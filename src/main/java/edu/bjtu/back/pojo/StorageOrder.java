package edu.bjtu.back.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 入库信息



@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class StorageOrder {

    private String id;

    // 入库单号
    private String storageNo;

    // 供应商编号
    private String supplierCode;

    // 供应商名称
    private String supplierName;

    // 收货地址电话
    private String addressTel;

    // 备注
    private String remarks;

    // 订单金额
    private String summary;

    // 仓库编码
    private String storeCode;

    // 库存编码
    private String storeName;

    // 质检日期
    private Long createTime;

    // 更新时间
    private String updateTime;

    private String createUserId;

    private int updateUserId;

    private int deptId;

}
