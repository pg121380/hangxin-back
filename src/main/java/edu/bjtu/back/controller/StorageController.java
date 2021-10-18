package edu.bjtu.back.controller;

import edu.bjtu.back.pojo.StorageRecord;
import edu.bjtu.back.pojo.StorageOrder;
import edu.bjtu.back.pojo.StorageProduct;
import edu.bjtu.back.vo.params.QueryPageParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author zhangxinyu
 */

@RestController
@CrossOrigin
public class StorageController {

    // 库存信息列表
    public List<StorageRecord> storageLists = new ArrayList<>();

    { // 构造代码块
        // 为什么用大括号包住就不用写
        StorageRecord storage1 = new StorageRecord("storage-1","goods-1","测温计","规格","只","4200",1L,"repertory-1","王五开",11L,"1630000000l","dept-1","user-11","user-11","1630000000l");
        StorageRecord storage2 = new StorageRecord("storage-2","goods-2","livox激光雷达","规格","个","231",2L,"repertory-2","姜文",22L,"1630000000l","dept-1","user-12","user-12","1630000000l");
        StorageRecord storage3 = new StorageRecord("storage-3","goods-3","海康摄像头","规格","只","4703",3L,"repertory-1","曹安满",33L,"1630000000l","dept-1","user-13","user-13","1630000000l");
        StorageRecord storage4 = new StorageRecord("storage-4","goods-4","梯子","规格","只","4520",4L,"repertory-1","刘能",44L,"1630000000l","dept-1","user-11","user-14","1630000000l");
        StorageRecord storage5 = new StorageRecord("storage-5","goods-1","测温计","规格","只","4200",5L,"repertory-1","王喜顺",55L,"1630000000l","dept-1","user-11","user-15","1630000000l");

        storageLists.add(storage1);
        storageLists.add(storage2);
        storageLists.add(storage3);
        storageLists.add(storage4);
        storageLists.add(storage5);

    }



    // "storage-product-1","contract-1", 1630000000L,"user-1", "customer-1","马实","000-123456","dept-1","可行，大力推进", 1630050000L,"purchase-1",

    public StorageOrder storageOrder = new StorageOrder();

    public List<StorageProduct> storageProductList = new ArrayList<>();
    {
        StorageProduct storageProduct1 = new StorageProduct("storage-product-1","arrivalNo-1","sequenceNumber-1","productCode-1","拯救者电脑",0,"100","5000","500000",98L,"1630050000L","x86","yuan");
        StorageProduct storageProduct2 = new StorageProduct("storage-product-2","arrivalNo-2","sequenceNumber-2","productCode-2","海康相机",0,"100","5000","500000",98L,"1630050000L","x86","yuan");
        StorageProduct storageProduct3 = new StorageProduct("storage-product-3","arrivalNo-3","sequenceNumber-3","productCode-3","鼠标",0,"100","5000","500000",98L,"1630050000L","x86","yuan");
        StorageProduct storageProduct4 = new StorageProduct("storage-product-4","arrivalNo-4","sequenceNumber-4","productCode-4","键盘",0,"100","5000","500000",98L,"1630050000L","x86","yuan");
        StorageProduct storageProduct5 = new StorageProduct("storage-product-5","arrivalNo-5","sequenceNumber-5","productCode-6","显示器",1,"100","5000","500000",98L,"1630050000L","x86","yuan");

        storageProductList.add(storageProduct1);
        storageProductList.add(storageProduct2);
        storageProductList.add(storageProduct3);
        storageProductList.add(storageProduct4);
        storageProductList.add(storageProduct5);
    }

    public List<StorageOrder> storageOrderList = new ArrayList<>();
    {
        StorageOrder storageOrder1 = new StorageOrder("storage-order-1", "storageNo-1","supplierCode-1","竞业达","000-123456","暂无","50000","store-1","廊坊仓库",1630000000L,"2020年6月11日","user-1",32212,112);
        StorageOrder storageOrder2 = new StorageOrder("storage-order-2", "storageNo-2","supplierCode-2","小米","000-123456","暂无","50000","store-2","北京仓库",1630000000L,"2020年6月11日","user-2",32212,112);
        StorageOrder storageOrder3 = new StorageOrder("storage-order-3", "storageNo-3","supplierCode-3","铁科","000-123456","暂无","50000","store-3","天津仓库",1630000000L,"2020年6月11日","user-3",32212,112);
        StorageOrder storageOrder4 = new StorageOrder("storage-order-4", "storageNo-4","supplierCode-4","美的","000-123456","暂无","50000","store-4","石家庄仓库",1630000000L,"2020年6月11日","user-4",32212,112);
        StorageOrder storageOrder5 = new StorageOrder("storage-order-5", "storageNo-5","supplierCode-5","海信","000-123456","暂无","50000","store-5","长治仓库",1630000000L,"2020年6月11日","user-5",32212,112);

        storageOrderList.add(storageOrder1);
        storageOrderList.add(storageOrder2);
        storageOrderList.add(storageOrder3);
        storageOrderList.add(storageOrder4);
        storageOrderList.add(storageOrder5);
    }




    // 入库信息列表
    @GetMapping("/storageOrder/page")
    public Map<String, Object> getStorageOrderPage(@RequestParam("pageNo") int pageNo,
                                                   @RequestParam("pageSize") int pageSize,
                                                   @RequestParam("createTimeStart") String createTimeStart,
                                                   @RequestParam("createTimeEnd") String createTimeEnd,
                                                   @RequestParam("supplierName") String supplierName,
                                                   @RequestParam("storageNo") String storageNo){


        int page = 0;  // 当前页
        int pages = 10;  // 分页大小
        int total = 5; // 分页总数

        Map<String, Object> map = new HashMap<>();
        map.put("page", page);
        map.put("pages", pages);
        map.put("total", total);
        map.put("records", storageOrderList);

        return map;
    }




    // 入库详情查询
    @GetMapping("/storageOrder/{id}")
    public Map<String,Object> getStorageOrder(@PathVariable("id") String id){
        System.out.println("[getStorageOrder]id："+ id);

        Map<String, Object> map = new HashMap<>();
        map.put("storageOrder", storageOrder);
        map.put("storageProduct", storageProductList);

        return map;
    }

    // 库存信息分页查询
//    @PostMapping("/goodsStock/queryPage")
//    public Map<String, Object>  getStorageList(@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize,
//                                               @RequestParam("goodsCode") String goodsCode, @RequestParam("goodsName") String goodsName,
//                                               @RequestParam("repertoryId") String repertoryId) {
    @PostMapping("/goodsStock/queryPage")
    public Map<String, Object>  getStorageList(@RequestBody QueryPageParam queryPageParam) {

        System.out.println("[getStorageList]页码："+ queryPageParam.getPageNo());
        System.out.println("[getStorageList]分页数：" + queryPageParam.getPageSize());
        System.out.println("[getStorageList]商品编码：" + queryPageParam.getGoodsCode());
        System.out.println("[getStorageList]商品名称：" + queryPageParam.getGoodsName());
        System.out.println("[getStorageList]仓库id：" + queryPageParam.getRepertoryId());

        int current = 0; // 当前分页
        int size = 20; // 分页大小
        int total = 5;  // 分页总数

        HashMap<String, Object> map = new HashMap<>();
        map.put("current", current);
        map.put("size", size);
        map.put("total", total);
        map.put("records", storageLists);

        return map;
    }
}
