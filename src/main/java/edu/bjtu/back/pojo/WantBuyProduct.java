package edu.bjtu.back.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName: BuyProduct
 * Description: 我要买中的Product
 * date: 2021-09-28 12:41
 *
 * @author liyifan
 */

@Data
@NoArgsConstructor
@ToString
public class WantBuyProduct {

    // id
    private String id;

    // 订单编号
    private String orderNo;

    // 商品分类
    private String category;

    // 商品编码
    private String goodsCode;

    // 商品名称
    private String goodsName;

    // 金额
    private String amount;

    // 规格型号
    private String specification;

    // 计划采购金额
    private String purchaseAmount;

    // 计划采购数量
    private String purchaseQuantity;

    // 发布日期
    private long publishDate;

    // 截止日期
    private long closeDate;

    // 详细描述
    private String description;

    // 联系人
    private String contacts;

    // 组织id
    private String contactInfo;

    // 状态
    private String status;

    //商家id
    private String enterpriseId;

    // 商家名称
    private String enterpriseName;

    // 纳税人识别号
    private String nsrsbh;

    // 人气值
    private String popularity;

    // 推荐度
    private String recommendation;

    // 多少人看过
    private int visitorNum;

    // 多少人联系过
    private int contactNum;

    // 创建人Id
    private long userId;

    // 创建时间
    private long createTime;

    // 删除标志
    private String deleteMark;

    // 是否显示
    private String isShow;

    // 系统计算最低单价
    private String sysMinPrice;

    // 系统计算最高单价
    private String sysMaxPrice;

    // 系统计算单位
    private String sysUnit;

    //？不知道是个什么玩意
    private String sort;

    public WantBuyProduct(String id, String orderNo, String category, String goodsCode, String goodsName, String amount, String specification, String purchaseAmount, String purchaseQuantity, long publishDate, long closeDate, String description, String contacts, String contactInfo, String status, String enterpriseId, String enterpriseName, String nsrsbh, String popularity, String recommendation, int visitorNum, int contactNum, long userId, long createTime, String deleteMark, String isShow, String sysMinPrice, String sysMaxPrice, String sysUnit, String sort) {
        this.id = id;
        this.orderNo = orderNo;
        this.category = category;
        this.goodsCode = goodsCode;
        this.goodsName = goodsName;
        this.amount = amount;
        this.specification = specification;
        this.purchaseAmount = purchaseAmount;
        this.purchaseQuantity = purchaseQuantity;
        this.publishDate = publishDate;
        this.closeDate = closeDate;
        this.description = description;
        this.contacts = contacts;
        this.contactInfo = contactInfo;
        this.status = status;
        this.enterpriseId = enterpriseId;
        this.enterpriseName = enterpriseName;
        this.nsrsbh = nsrsbh;
        this.popularity = popularity;
        this.recommendation = recommendation;
        this.visitorNum = visitorNum;
        this.contactNum = contactNum;
        this.userId = userId;
        this.createTime = createTime;
        this.deleteMark = deleteMark;
        this.isShow = isShow;
        this.sysMinPrice = sysMinPrice;
        this.sysMaxPrice = sysMaxPrice;
        this.sysUnit = sysUnit;
        this.sort = sort;
    }
}
