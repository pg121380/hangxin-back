package edu.bjtu.back.controller;

import edu.bjtu.back.pojo.StorageList;
import edu.bjtu.back.pojo.StorageOrder;
import edu.bjtu.back.pojo.StorageProduct;
import edu.bjtu.back.vo.params.QueryPageParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 都是查询 为什么有的用post 有的用get 区别是什么
// post 和 get 方法不同对@RequestParam有没有影响

/**
 * @author zhangxinyu
 */

@RestController
@CrossOrigin
public class StorageController {

    // 库存信息列表
    public List<StorageList> storageLists = new ArrayList<>();

    {
        // 为什么用大括号包住就不用写
        StorageList storage1 = new StorageList("storage-1","goods-1","测温计","规格","只","4200",1L,"repertory-1","王五开",0001L,"1630000000l","dept-1","user-11","user-11","1630000000l");
        StorageList storage2 = new StorageList("storage-2","goods-2","livox激光雷达","规格","个","231",2L,"repertory-2","姜文",0002L,"1630000000l","dept-1","user-12","user-12","1630000000l");
        StorageList storage3 = new StorageList("storage-3","goods-3","海康摄像头","规格","只","4703",3L,"repertory-1","曹安满",0003L,"1630000000l","dept-1","user-13","user-13","1630000000l");
        StorageList storage4 = new StorageList("storage-4","goods-4","梯子","规格","只","4520",4L,"repertory-1","刘能",0004L,"1630000000l","dept-1","user-11","user-14","1630000000l");
        StorageList storage5 = new StorageList("storage-5","goods-1","测温计","规格","只","4200",5L,"repertory-1","王喜顺",0005L,"1630000000l","dept-1","user-11","user-15","1630000000l");

        storageLists.add(storage1);
        storageLists.add(storage2);
        storageLists.add(storage3);
        storageLists.add(storage4);
        storageLists.add(storage5);

    }

    public StorageOrder storageOrder = new StorageOrder();

    public List<StorageProduct> storageProductList = new ArrayList<>();
    {
        StorageProduct storageProduct1 = new StorageProduct();
        StorageProduct storageProduct2 = new StorageProduct();
        StorageProduct storageProduct3 = new StorageProduct();
        StorageProduct storageProduct4 = new StorageProduct();
        StorageProduct storageProduct5 = new StorageProduct();

        storageProductList.add(storageProduct1);
        storageProductList.add(storageProduct2);
        storageProductList.add(storageProduct3);
        storageProductList.add(storageProduct4);
        storageProductList.add(storageProduct5);
    }

    public List<StorageOrder> storageOrderList = new ArrayList<>();
    {
        StorageOrder storageOrder1 = new StorageOrder();
        StorageOrder storageOrder2 = new StorageOrder();
        StorageOrder storageOrder3 = new StorageOrder();
        StorageOrder storageOrder4 = new StorageOrder();
        StorageOrder storageOrder5 = new StorageOrder();

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
