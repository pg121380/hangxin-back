package edu.bjtu.back.controller;

import edu.bjtu.back.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: ProductController
 * Description:
 * date: 2021-09-26 21:14
 *
 * @author liyifan
 */

@Controller
public class ProductController {

    private List<Product> records;

    {
        records = new ArrayList<>();
        // String id, String productCategoryCode, String productCategoryName, String productCode, String productName, String productFileId, String productFormat, String unit, String price, long createTime, long updateTime, long createUserId, long updateUserId, int deptId
        Product product = new Product("product-1", "1", "原材料", "product-code-1", "钢材", "imgUrl", "0.5mm", "吨", "100.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product1 = new Product("product-2", "1", "原材料", "product-code-2", "铝锭", "imgUrl", "0.7mm", "吨", "432.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product2 = new Product("product-3", "1", "原材料", "product-code-3", "铜锭", "imgUrl", "1.0mm", "吨", "476.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product3 = new Product("product-4", "2", "数码", "product-code-4", "手机", "imgUrl", "iPhone13 pro", "个", "6799.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product4 = new Product("product-5", "2", "数码", "product-code-5", "笔记本电脑", "imgUrl", "dell", "台", "5999.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product5 = new Product("product-6", "3", "食品", "product-code-6", "桂格麦片", "imgUrl", "aptx-4869", "罐", "19.9.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product6 = new Product("product-7", "3", "食品", "product-code-7", "蒙牛牛奶", "imgUrl", "aptx-4870", "箱", "39.9.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product7 = new Product("product-8", "4", "百货", "product-code-8", "毛巾", "imgUrl", "小米最生活", "条", "10.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product8 = new Product("product-9", "5", "电器", "product-code-9", "电视机", "imgUrl", "Xiaomi A55", "台", "2399.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product9 = new Product("product-10", "5", "电器", "product-code-10", "电冰箱", "imgUrl", "Gree BCD-230", "台", "4499.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product10 = new Product("product-11", "6", "饰品", "product-code-11", "项链", "imgUrl", "-", "条", "10.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product11 = new Product("product-12", "6", "饰品", "product-code-12", "头饰", "imgUrl", "-", "条", "10.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product12 = new Product("product-13", "7", "医药", "product-code-13", "连花清瘟胶囊", "imgUrl", "-", "盒", "21.9", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product13 = new Product("product-14", "7", "医药", "product-code-14", "板蓝根", "imgUrl", "-", "袋", "30.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);
        Product product14 = new Product("product-15", "7", "医药", "product-code-15", "藿香正气水", "imgUrl", "-", "瓶", "10.0", 1632553572l, 1632571572l, 123456789l, 987654321l, 1);

        records.add(product);
        records.add(product1);
        records.add(product2);
        records.add(product3);
        records.add(product4);
        records.add(product5);
        records.add(product6);
        records.add(product7);
        records.add(product8);
        records.add(product9);
        records.add(product10);
        records.add(product11);
        records.add(product12);
        records.add(product13);
        records.add(product14);
    }

    @ResponseBody
    @RequestMapping("/product/page")
    public HashMap<String, Object> getProductList(int pageNo, int pageSize, String productCategoryCode, String productName, String productFormat){
        HashMap<String, Object> res = new HashMap<>();
        res.put("code", 200);
        res.put("message", "物品列表获取成功！");
        HashMap<String, Object> data = new HashMap<>();
        data.put("total", 5);
        data.put("pages", 1);
        data.put("page", 1);
        List<Product> collect = records.stream().filter(p -> p.getProductCategoryCode().equals(productCategoryCode)).collect(Collectors.toList());
        data.put("records", collect);
        res.put("data", data);
        return res;
    }

}
