package edu.bjtu.back.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * ClassName: Order
 * Description:
 * date: 2021-09-26 16:06
 *
 * @author liyifan
 */
@Data
@NoArgsConstructor
@ToString
public class Order {

    // id
    private String id;

    // 采购单号
    private String purchaseNo;

    // 销售单号
    private String saleNo;

    // 供应商编码
    private String supplierCode;

    // 供应商名称
    private String supplierName;

    // 合同编号
    private String contractNo;

    // 计划到货时间
    private long planTime;

    // 收货地址
    private String addressTel;

    // 联系电话
    private String telephone;

    // 备注
    private String remarks;

    // 订单金额
    private int summary;

    // 下单状态
    private int status1;

    // 到货状态
    private int status2;

    // 质检状态
    private int status3;

    // 入库状态
    private int status4;

    // 发运方式
    private int transportMode;

    // 物流公司
    private String transportCompany;

    // 物流编号
    private String transportNo;

    // 创建时间
    private long createTime;

    // 更新时间
    private long updateTime;

    // 创建人id
    private long createUserId;

    // 更新人id
    private long updateUserId;

    // 组织id
    private int deptId;

    // 是否只读
    private int isReadOnly;

    // 系统来源
    private int systemSource;

    public Order(String id, String purchaseNo, String saleNo, String supplierCode, String supplierName, String contractNo, long planTime, String addressTel, String telephone, String remarks, int summary, int status1, int status2, int status3, int status4, int transportMode, String transportCompany, String transportNo, long createTime, long updateTime, long createUserId, long updateUserId, int deptId, int isReadOnly, int systemSource) {
        this.id = id;
        this.purchaseNo = purchaseNo;
        this.saleNo = saleNo;
        this.supplierCode = supplierCode;
        this.supplierName = supplierName;
        this.contractNo = contractNo;
        this.planTime = planTime;
        this.addressTel = addressTel;
        this.telephone = telephone;
        this.remarks = remarks;
        this.summary = summary;
        this.status1 = status1;
        this.status2 = status2;
        this.status3 = status3;
        this.status4 = status4;
        this.transportMode = transportMode;
        this.transportCompany = transportCompany;
        this.transportNo = transportNo;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createUserId = createUserId;
        this.updateUserId = updateUserId;
        this.deptId = deptId;
        this.isReadOnly = isReadOnly;
        this.systemSource = systemSource;
    }
}
