package edu.bjtu.back.pojo;

/**
 * ClassName: PurchaseOrder
 * Description:
 * date: 2021/9/1 13:59
 *
 * @author liyifan
 */
public class PurchaseOrder {

    // id
    private String id;

    // 合同编号
    private String contractNo;

    // 创建时间
    private Long createTime;

    // 创建人
    private String createUserId;

    // 收货地址电话
    private String addressTel;

    // 部门id
    private String deptId;

    // 计划到货时间
    private Long planTime;

    // 采购单号
    private String purchaseNo;

    // 销售单号
    private String saleNo;

    // 下单状态
    private int status1;

    // 到货状态
    private int status2;

    // 质检状态
    private int status3;

    // 入库状态
    private int status4;

    // 订单金额
    private double summary;

    // 供应商编号
    private String supplierCode;

    // 供应商名称
    private String supplierName;

    // 物流公司
    private String transportCompany;

    // 发运方式
    private int transportMode;

    // 物流编号
    private String transportNo;

    // 更新时间
    private Long updateTime;

    // 备注
    private String remarks;

    public PurchaseOrder(String id, String contractNo, Long createTime, String createUserId, String addressTel, String deptId, Long planTime, String purchaseNo, String saleNo, int status1, int status2, int status3, int status4, double summary, String supplierCode, String supplierName, String transportCompany, int transportMode, String transportNo, Long updateTime, String remarks) {
        this.id = id;
        this.contractNo = contractNo;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.addressTel = addressTel;
        this.deptId = deptId;
        this.planTime = planTime;
        this.purchaseNo = purchaseNo;
        this.saleNo = saleNo;
        this.status1 = status1;
        this.status2 = status2;
        this.status3 = status3;
        this.status4 = status4;
        this.summary = summary;
        this.supplierCode = supplierCode;
        this.supplierName = supplierName;
        this.transportCompany = transportCompany;
        this.transportMode = transportMode;
        this.transportNo = transportNo;
        this.updateTime = updateTime;
        this.remarks = remarks;
    }

    public PurchaseOrder() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getAddressTel() {
        return addressTel;
    }

    public void setAddressTel(String addressTel) {
        this.addressTel = addressTel;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public Long getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Long planTime) {
        this.planTime = planTime;
    }

    public String getPurchaseNo() {
        return purchaseNo;
    }

    public void setPurchaseNo(String purchaseNo) {
        this.purchaseNo = purchaseNo;
    }

    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    public int getStatus1() {
        return status1;
    }

    public void setStatus1(int status1) {
        this.status1 = status1;
    }

    public int getStatus2() {
        return status2;
    }

    public void setStatus2(int status2) {
        this.status2 = status2;
    }

    public int getStatus3() {
        return status3;
    }

    public void setStatus3(int status3) {
        this.status3 = status3;
    }

    public int getStatus4() {
        return status4;
    }

    public void setStatus4(int status4) {
        this.status4 = status4;
    }

    public double getSummary() {
        return summary;
    }

    public void setSummary(double summary) {
        this.summary = summary;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getTransportCompany() {
        return transportCompany;
    }

    public void setTransportCompany(String transportCompany) {
        this.transportCompany = transportCompany;
    }

    public int getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(int transportMode) {
        this.transportMode = transportMode;
    }

    public String getTransportNo() {
        return transportNo;
    }

    public void setTransportNo(String transportNo) {
        this.transportNo = transportNo;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "id='" + id + '\'' +
                ", contractNo='" + contractNo + '\'' +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", addressTel='" + addressTel + '\'' +
                ", deptId='" + deptId + '\'' +
                ", planTime=" + planTime +
                ", purchaseNo='" + purchaseNo + '\'' +
                ", saleNo='" + saleNo + '\'' +
                ", status1=" + status1 +
                ", status2=" + status2 +
                ", status3=" + status3 +
                ", status4=" + status4 +
                ", summary=" + summary +
                ", supplierCode='" + supplierCode + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", transportCompany='" + transportCompany + '\'' +
                ", transportMode=" + transportMode +
                ", transportNo='" + transportNo + '\'' +
                ", updateTime=" + updateTime +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
