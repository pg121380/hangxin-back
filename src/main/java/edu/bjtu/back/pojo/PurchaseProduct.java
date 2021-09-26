package edu.bjtu.back.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName: PurchaseProduct
 * Description:
 * date: 2021-09-26 16:16
 *
 * @author liyifan
 */
@Data
@NoArgsConstructor
@ToString
public class PurchaseProduct {

    // id
    private String id;

    // 采购单号
    private String purchaseNo;

    // 序号
    private String sequenceNumber;

    // 商品编码
    private String productCode;

    // 商品名称
    private String productName;

    // 规格型号
    private String productFormat;

    // 计价单位
    private String unit;

    // 是否赠品
    private int isGift;

    // 采购数量
    private int num;

    // 计价单价
    private String price;

    // 采购金额
    private String summary;

    // 计划到货日期
    private long planTime;

    // 发货数量
    private int deliverNum;

    // 到货时间
    private int arrivalNum;

    // 合格数量
    private int qualifiedNum;

    // 不合格数量
    private int unqualifiedNum;

    // 入库数量
    private int storageNum;

    // 更新时间
    private long updateTime;

    public PurchaseProduct(String id, String purchaseNo, String sequenceNumber, String productCode, String productName, String productFormat, String unit, int isGift, int num, String price, String summary, long planTime, int deliverNum, int arrivalNum, int qualifiedNum, int unqualifiedNum, int storageNum, long updateTime) {
        this.id = id;
        this.purchaseNo = purchaseNo;
        this.sequenceNumber = sequenceNumber;
        this.productCode = productCode;
        this.productName = productName;
        this.productFormat = productFormat;
        this.unit = unit;
        this.isGift = isGift;
        this.num = num;
        this.price = price;
        this.summary = summary;
        this.planTime = planTime;
        this.deliverNum = deliverNum;
        this.arrivalNum = arrivalNum;
        this.qualifiedNum = qualifiedNum;
        this.unqualifiedNum = unqualifiedNum;
        this.storageNum = storageNum;
        this.updateTime = updateTime;
    }
}
