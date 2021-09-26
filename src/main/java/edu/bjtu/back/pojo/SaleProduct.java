package edu.bjtu.back.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName: SaleProduct
 * Description:
 * date: 2021-09-26 15:08
 *
 * @author liyifan
 */

@Data
@ToString
public class SaleProduct {

    // id
    private String id;

    // 销售单号
    private String saleNo;

    // 序号
    private String sequenceNumber;

    // 商品编码
    private String productCode;

    // 商品名称
    private String productName;

    // 销售数量
    private int num;

    // 单价
    private String price;

    // 销售金额
    private String summary;

    // 计划到货时间
    private String planTime;

    // 发货数量
    private int deliverNum;

    // 到货数量
    private int arrivalNum;

    // 合格数量
    private int qualifiedNum;

    // 不合格数量
    private int unqualifiedNum;

    // 溯源码
    private String tracingSourceCode;

    // 规格型号
    private long productFormat;

    // 计价单位
    private String unit;

    public SaleProduct(String id, String saleNo, String sequenceNumber, String productCode, String productName, int num, String price, String summary, String planTime, int deliverNum, int arrivalNum, int qualifiedNum, int unqualifiedNum, String tracingSourceCode, long productFormat, String unit) {
        this.id = id;
        this.saleNo = saleNo;
        this.sequenceNumber = sequenceNumber;
        this.productCode = productCode;
        this.productName = productName;
        this.num = num;
        this.price = price;
        this.summary = summary;
        this.planTime = planTime;
        this.deliverNum = deliverNum;
        this.arrivalNum = arrivalNum;
        this.qualifiedNum = qualifiedNum;
        this.unqualifiedNum = unqualifiedNum;
        this.tracingSourceCode = tracingSourceCode;
        this.productFormat = productFormat;
        this.unit = unit;
    }

    public SaleProduct() {
    }

}
