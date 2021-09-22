package edu.bjtu.back.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class StorageProduct {
    private String id;

    // 入库单号
    private String arrivalNo;

    // 序号
    private String sequenceNumber;

    // 商品编码
    private String productCode;

    // 商品名称
    private String productName;

    // 是否赠品
    private int isGift;

    // 采购数量
    private String num;

    // 计件单价
    private String price;

    // 采购金额
    private String summary;

    // 本次到货数量
    private Long currArrivalNum;

    // 更新时间
    private String updateTime;

    // 规格型号
    private String productFormat;

    // 计件单价
    private String unit;
}
