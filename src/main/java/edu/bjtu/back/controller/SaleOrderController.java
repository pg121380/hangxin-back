package edu.bjtu.back.controller;

import edu.bjtu.back.pojo.SaleProduct;
import edu.bjtu.back.vo.OrderFolwWithUserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * ClassName: SaleOrderController
 * Description:
 * date: 2021-09-26 11:25
 *
 * @author liyifan
 */
@Controller
@CrossOrigin
public class SaleOrderController {

    private List<SaleProduct> saleOrderChildren;

    private List<OrderFolwWithUserVo> saleOrderFlowList;

    {
        saleOrderChildren = new ArrayList<>();
        //String id, String saleNo, String sequenceNumber, String productCode, String productName, int num, String price, String summary, String planTime, int deliverNum, int arrivalNum, int qualifiedNum, int unqualifiedNum, String tracingSourceCode, long productFormat, String unit
        SaleProduct saleProduct = new SaleProduct("saleProduct-1", "sale-order-1", "32rkjew34", "product-1", "钢材", 100, "100.0", "10000.0","2021-09-26", 100,100,100,0,"456712yui3jrtef7d8iuh43", 123456789l, "吨");
        SaleProduct saleProduct1 = new SaleProduct("saleProduct-2", "sale-order-1", "32rkjew35", "product-2", "钢材", 100, "100.0", "10000.0","2021-09-26", 100,100,100,0,"456712gfdasdsf7d8iuh43", 123456789l, "吨");
        SaleProduct saleProduct2 = new SaleProduct("saleProduct-3", "sale-order-1", "32rkjew36", "product-3", "钢材", 100, "100.0", "10000.0","2021-09-26", 100,100,100,0,"456712yuihgfsdfsasiuh43", 123456789l, "吨");
        SaleProduct saleProduct3 = new SaleProduct("saleProduct-4", "sale-order-1", "32rkjew37", "product-4", "钢材", 100, "100.0", "10000.0","2021-09-26", 100,100,100,0,"456712yuihggfdvssadeh43", 123456789l, "吨");
        SaleProduct saleProduct4 = new SaleProduct("saleProduct-5", "sale-order-1", "32rkjew38", "product-5", "钢材", 100, "100.0", "10000.0","2021-09-26", 100,100,100,0,"4fgfwegggrdrtef7d8iuh43", 123456789l, "吨");
        saleOrderChildren.add(saleProduct);
        saleOrderChildren.add(saleProduct1);
        saleOrderChildren.add(saleProduct2);
        saleOrderChildren.add(saleProduct3);
        saleOrderChildren.add(saleProduct4);

        saleOrderFlowList = new ArrayList<>();
        //String id, String purchaseNo, String saleNo, String handle, String content, long createTime, long createUserId, long deptId, String companyName, int deptName, int account
        OrderFolwWithUserVo orderFolwWithUserVo = new OrderFolwWithUserVo("orderfolw-1", "purchase-1", "sale-order-1", "协商", "同意", 1632571572l, 5783264325l, 328534l, "宝钢", 123,321);
        OrderFolwWithUserVo orderFolwWithUserVo1 = new OrderFolwWithUserVo("orderfolw-1", "purchase-1", "sale-order-1", "协商", "同意", 1632571572l, 5783264325l, 328534l, "宝钢", 123,321);
        OrderFolwWithUserVo orderFolwWithUserVo2 = new OrderFolwWithUserVo("orderfolw-1", "purchase-1", "sale-order-1", "协商", "同意", 1632571572l, 5783264325l, 328534l, "宝钢", 123,321);
        OrderFolwWithUserVo orderFolwWithUserVo3 = new OrderFolwWithUserVo("orderfolw-1", "purchase-1", "sale-order-1", "协商", "同意", 1632571572l, 5783264325l, 328534l, "宝钢", 123,321);
        OrderFolwWithUserVo orderFolwWithUserVo4 = new OrderFolwWithUserVo("orderfolw-1", "purchase-1", "sale-order-1", "协商", "同意", 1632571572l, 5783264325l, 328534l, "宝钢", 123,321);
        saleOrderFlowList.add(orderFolwWithUserVo);
        saleOrderFlowList.add(orderFolwWithUserVo1);
        saleOrderFlowList.add(orderFolwWithUserVo2);
        saleOrderFlowList.add(orderFolwWithUserVo3);
        saleOrderFlowList.add(orderFolwWithUserVo4);

    }

    @ResponseBody
    @RequestMapping("/saleOrder/{id}")
    public HashMap<String, Object> getSaleOrderDetail(@PathVariable("id") String id){
        HashMap<String, Object> res = new HashMap<>();
        res.put("code", 200);
        res.put("message", "销售订单详情获取成功！");
        HashMap<String, Object> data = new HashMap<>();
        data.put("id", id);
        data.put("saleNo", "sale-order-1");
        data.put("purchaseNo", "purchase-order-1");
        data.put("customerCode", "customer-1");
        data.put("customerName", "张三");
        data.put("contractNo", "contract-1");
        data.put("planTime", "2021-09-25");
        data.put("addressTel", "北京市海淀区");
        data.put("telephone", "13587620973");
        data.put("remarks", "无");
        data.put("summary", 14364532.0);
        data.put("status1", 0);
        data.put("status2", 1);
        data.put("status3", 0);
        data.put("transportMode", 1);
        data.put("transportCompany", "顺丰速运");
        data.put("transportNo", "SF432857324678325");
        data.put("createTime", 1632553572l);
        data.put("updateTime", 1632571572l);
        data.put("createUserId", 123456789l);
        data.put("updateUserId", 987654321l);
        data.put("deptId", 1);
        data.put("ideaTxt", "协商通过");
        data.put("isReadOnly", 1);
        data.put("systemSource", 1);
        data.put("children", this.saleOrderChildren);
        data.put("orderFlowList", this.saleOrderFlowList);
        res.put("data", data);
        return res;
    }

}
