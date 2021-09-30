package edu.bjtu.back.controller;

import edu.bjtu.back.pojo.WantBuyProduct;
import edu.bjtu.back.pojo.WantSaleProduct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: NeedsAndGoodsController
 * Description:
 * date: 2021-09-28 12:22
 *
 * @author liyifan
 */
@Controller
public class NeedsAndGoodsController {

    private List<WantBuyProduct> wantBuyProducts;

    private List<WantSaleProduct> wantSaleProducts;

    {
        wantBuyProducts = new LinkedList<>();
        //String id, String orderNo, String category, String goodsCode, String goodsName, String amount, String specification, String purchaseAmount, String purchaseQuantity, String publishDate, String closeDate, String description, String contacts, String contactInfo, String status, String enterpriseId, String enterpriseName, String nsrsbh, String popularity, String recommendation, int visitorNum, String contactNum, long userId, long createTime, String deleteMark, String isShow, String sysMinPrice, String sysMaxPrice, String sysUnit, String sort
        WantBuyProduct wantBuyProduct1 = new WantBuyProduct("wb-1", "order-1", "1", "wb-product-1", "钢材", "10000.0", "0.5mm", "10000.0", "100", 1632722358l, 1632981558l, "钢材是钢锭、钢坯或钢材通过压力加工制成的一定形状、尺寸和性能的材料。大部分钢材加工都是通过压力加工，使被加工的钢（坯、锭等）产生塑性变形。", "张三", "dept-1", "2", "enterprise-1", "宝钢", "92331121MA2HL46MXL", "324", "187", 32, 5, 678542368l, 1632722358l, "0", "1", "99", "110", "吨", "");
        WantBuyProduct wantBuyProduct2 = new WantBuyProduct("wb-2", "order-1", "1", "wb-product-2", "铁矿石", "10000.0", "0.7mm", "10000.0", "100", 1632722358l, 1632981558l, "铁矿石是钢铁生产企业的重要原材料，天然矿石（铁矿石）经过破碎、磨碎、磁选、浮选、重选等程序逐渐选出铁。", "张三", "dept-1", "3", "enterprise-1", "宝钢", "92331121MA2HL46MXL", "189", "155", 30, 7, 678542368l, 1632722358l, "0", "1", "99", "110", "吨", "");
        WantBuyProduct wantBuyProduct3 = new WantBuyProduct("wb-3", "order-1", "1", "wb-product-3", "铝", "10000.0", "0.9mm", "10000.0", "100", 1632722358l, 1632981558l, "铝是一种银白色金属，在地壳中含量仅次于氧和硅排在第三位。", "张三", "dept-1", "1", "enterprise-1", "宝钢", "92331121MA2HL46MXL", "782", "635", 125, 20, 678542368l, 1632722358l, "0", "1", "99", "110", "吨", "");
        WantBuyProduct wantBuyProduct4 = new WantBuyProduct("wb-4", "order-1", "1", "wb-product-4", "镁条", "10000.0", "1.0mm", "10000.0", "100", 1632722358l, 1632981558l, "镁条一般指镁带。镁带一般指制备成带状的金属镁，化学符号为Mg，外观为有金属光泽的银白色固体。", "张三", "dept-1", "4", "enterprise-1", "宝钢", "92331121MA2HL46MXL", "826", "625", 64, 25, 678542368l, 1632722358l, "0", "1", "99", "110", "吨", "");
        WantBuyProduct wantBuyProduct5 = new WantBuyProduct("wb-5", "order-1", "2", "wb-product-5", "手机", "23333.0", "iPhone13 pro", "10000.0", "100", 1632722358l, 1632981558l, "iPhone13一般指iPhone 13。iPhone 13是美国苹果公司于北京时间2021年9月15日凌晨1点在Apple Park发布的iPhone手机。", "张三", "dept-1", "2", "enterprise-2", "apple", "92331121MA2HL46MXL", "324", "133", 56, 9, 678542368l, 1632722358l, "0", "1", "99", "110", "个", "");
        WantBuyProduct wantBuyProduct6 = new WantBuyProduct("wb-6", "order-1", "2", "wb-product-6", "笔记本电脑", "19999.0", "mac book air", "10000.0", "100", 1632722358l, 1632981558l, "MacBook Air，是2008年2月19日苹果公司推出的笔记本。", "张三", "dept-1", "3", "enterprise-2", "apple", "92331121MA2HL46MXL", "462", "239", 97, 10, 678542368l, 1632722358l, "0", "1", "99", "110", "台", "");
        WantBuyProduct wantBuyProduct7 = new WantBuyProduct("wb-7", "order-1", "2", "wb-product-7", "电视机", "24999.0", "Xiaomi A55", "10000.0", "100", 1632722358l, 1632981558l, "智能55寸电视。", "张三", "dept-1", "4", "enterprise-3", "小米", "92331121MA2HL46MXL", "571", "278", 45, 11, 678542368l, 1632722358l, "0", "1", "99", "110", "台", "");
        WantBuyProduct wantBuyProduct8 = new WantBuyProduct("wb-8", "order-1", "3", "wb-product-8", "藿香正气水", "4783.0", "-", "10000.0", "100", 1632722358l, 1632981558l, "藿香正气水，中成药名，为祛暑剂，具有解表化湿，理气和中之功效。", "张三", "dept-1", "1", "enterprise-4", "北京同仁堂", "92331121MA2HL46MXL", "324", "187", 32, 5, 678542368l, 1632722358l, "0", "1", "99", "110", "盒", "");
        WantBuyProduct wantBuyProduct9 = new WantBuyProduct("wb-9", "order-1", "3", "wb-product-9", "板蓝根", "2397.0", "-", "10000.0", "100", 1632722358l, 1632981558l, "板蓝根，中药名。具有清热解毒，凉血，利咽的功效。", "张三", "dept-1", "1", "enterprise-4", "北京同仁堂", "92331121MA2HL46MXL", "324", "187", 32, 5, 678542368l, 1632722358l, "0", "1", "99", "110", "袋", "");
        WantBuyProduct wantBuyProduct10 = new WantBuyProduct("wb-10", "order-1", "3", "wb-product-10", "连花清瘟胶囊", "1345.0", "-", "10000.0", "100", 1632722358l, 1632981558l, "连花清瘟胶囊，清瘟解毒，宣肺泄热。", "张三", "dept-1", "1", "enterprise-4", "北京同仁堂", "92331121MA2HL46MXL", "324", "187", 32, 5, 678542368l, 1632722358l, "0", "1", "99", "110", "盒", "");

        wantBuyProducts.add(wantBuyProduct1);
        wantBuyProducts.add(wantBuyProduct2);
        wantBuyProducts.add(wantBuyProduct3);
        wantBuyProducts.add(wantBuyProduct4);
        wantBuyProducts.add(wantBuyProduct5);
        wantBuyProducts.add(wantBuyProduct6);
        wantBuyProducts.add(wantBuyProduct7);
        wantBuyProducts.add(wantBuyProduct8);
        wantBuyProducts.add(wantBuyProduct9);
        wantBuyProducts.add(wantBuyProduct10);
    }

    @ResponseBody
    @RequestMapping("/needs/page")
    public HashMap<String, Object> iWantToBuy(int pageNo, int pageSize, String productName, String productCode, String categoryCode){
        HashMap<String, Object> res = new HashMap<>();
        res.put("code", 200);
        res.put("message", "我要买 数据获取成功！");
        HashMap<String, Object> data = new HashMap<>();
        data.put("total", 10);
        data.put("pages", 1);
        data.put("records", wantBuyProducts);
        data.put("page", 1);
        res.put("data", data);
        return res;
    }
}
