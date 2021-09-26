package edu.bjtu.back.controller;

import edu.bjtu.back.pojo.PurchaseOrder;
import edu.bjtu.back.pojo.SaleOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: OrderController
 * Description: 企业采购单、销售单相关接口
 * date: 2021/9/1 10:05
 *
 * @author liyifan
 */
@Controller
@CrossOrigin
public class OrderController {

    public List<PurchaseOrder> purchaseOrders = new ArrayList<>();

    public List<SaleOrder> saleOrders = new ArrayList<>();

    {
        PurchaseOrder purchaseOrder1 = new PurchaseOrder("p-order-1", "contract-4322", 1630000000l, "1", "12345678909", "d-1", 1630477982l, "p-1", "s-1", 1, 0, 0, 0, 10000000.0, "4324252", "浙江三禾竹木有限公司", "顺丰速运", 1,"SF6542345436", 1630400000l, "订单备注");
        PurchaseOrder purchaseOrder2 = new PurchaseOrder("p-order-2", "contract-6554", 1630000000l, "1", "12344318909", "d-1", 1630477982l, "p-2", "s-2", 0, 1, 0, 0, 10000000.0, "4324252", "浙江三禾竹木有限公司", "顺丰速运", 1,"SF6546534454", 1630400000l, "订单备注");
        PurchaseOrder purchaseOrder3 = new PurchaseOrder("p-order-3", "contract-6576", 1630000000l, "1", "14323678954", "d-1", 1630477982l, "p-3", "s-3", 0, 0, 1, 0, 10000000.0, "4324252", "浙江三禾竹木有限公司", "顺丰速运", 1,"SF6542359034", 1630400000l, "订单备注");
        PurchaseOrder purchaseOrder4 = new PurchaseOrder("p-order-4", "contract-9856", 1630000000l, "1", "15234568909", "d-1", 1630477982l, "p-4", "s-4", 0, 0, 0, 1, 10000000.0, "4324252", "浙江三禾竹木有限公司", "顺丰速运", 1,"SF6541263456", 1630400000l, "订单备注");
        PurchaseOrder purchaseOrder5 = new PurchaseOrder("p-order-5", "contract-3456", 1630000000l, "1", "12387654508", "d-1", 1630477982l, "p-5", "s-5", 1, 0, 0, 0, 10000000.0, "4324252", "浙江三禾竹木有限公司", "顺丰速运", 1,"SF6542867456", 1630400000l, "订单备注");
        purchaseOrders.add(purchaseOrder1);
        purchaseOrders.add(purchaseOrder2);
        purchaseOrders.add(purchaseOrder3);
        purchaseOrders.add(purchaseOrder4);
        purchaseOrders.add(purchaseOrder5);

        SaleOrder saleOrder1 = new SaleOrder("s-order-1", "contract-6423", 1630000000l, "1", "c-4234", "张三", "12345678909", "d-2", "协商通过", 1630477982l, "p-1", "s-1", 1, 0, 0, 0, 10000.0, "顺丰速运", 1, "SF765346554", 1630400000l, "备注信息");
        SaleOrder saleOrder2 = new SaleOrder("s-order-2", "contract-6544", 1630000000l, "1", "c-7633", "李四", "13235124453", "d-2", "协商通过", 1630477982l, "p-2", "s-2", 0, 1, 0, 0, 10000.0, "顺丰速运", 1, "SF765334254", 1630400000l, "备注信息");
        SaleOrder saleOrder3 = new SaleOrder("s-order-3", "contract-2143", 1630000000l, "1", "c-6532", "王五", "13657234542", "d-2", "协商通过", 1630477982l, "p-3", "s-3", 0, 0, 1, 0, 10000.0, "顺丰速运", 1, "SF543446554", 1630400000l, "备注信息");
        SaleOrder saleOrder4 = new SaleOrder("s-order-4", "contract-8763", 1630000000l, "1", "c-9876", "赵六", "13545645423", "d-2", "协商通过", 1630477982l, "p-4", "s-4", 0, 0, 0, 1, 10000.0, "顺丰速运", 1, "SF765346545", 1630400000l, "备注信息");
        SaleOrder saleOrder5 = new SaleOrder("s-order-5", "contract-1234", 1630000000l, "1", "c-4234", "张三", "12345678909", "d-2", "协商通过", 1630477982l, "p-5", "s-5", 1, 0, 0, 0, 10000.0, "顺丰速运", 1, "SF765423554", 1630400000l, "备注信息");
        saleOrders.add(saleOrder1);
        saleOrders.add(saleOrder2);
        saleOrders.add(saleOrder3);
        saleOrders.add(saleOrder4);
        saleOrders.add(saleOrder5);
    }

    @RequestMapping("/purchaseOrder/page")
    @ResponseBody
    public Map<String, Object> getPurchaseOrderList(@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize, @RequestParam("createTimeStart") String createTimeStart, @RequestParam("createTimeEnd")String createTimeEnd){
        System.out.println("[getPurchaseOrderList]页码: " + pageNo);
        System.out.println("[getPurchaseOrderList]分页大小: " + pageSize);
        System.out.println("[getPurchaseOrderList]创建时间起: " + createTimeStart);
        System.out.println("[getPurchaseOrderList]创建时间止: " + createTimeEnd);

        int page = 0;
        int pages = 20;
        int total = 5;
        Map<String, Object> map = new HashMap<>();
        map.put("page", page);
        map.put("pages", pages);
        map.put("total", total);
        map.put("records", purchaseOrders);
        return map;
    }

    @RequestMapping("/saleOrder/page")
    @ResponseBody
    public Map<String, Object> getSaleOrderList(@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize, @RequestParam("createTimeStart") String createTimeStart, @RequestParam("createTimeEnd")String createTimeEnd){
        System.out.println("[getSaleOrderList]页码: " + pageNo);
        System.out.println("[getSaleOrderList]分页大小: " + pageSize);
        System.out.println("[getSaleOrderList]创建时间起: " + createTimeStart);
        System.out.println("[getSaleOrderList]创建时间止: " + createTimeEnd);

        int page = 0;
        int pages = 20;
        int total = 5;
        Map<String, Object> map = new HashMap<>();
        map.put("page", page);
        map.put("pages", pages);
        map.put("total", total);
        map.put("records", saleOrders);
        return map;
    }
}
