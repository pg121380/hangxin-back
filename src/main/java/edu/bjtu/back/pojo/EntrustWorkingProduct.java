package edu.bjtu.back.pojo;

public class EntrustWorkingProduct {
    private String id;
    private String entrustWorkingNo;
    private int sequenceNumber;
    private String productCode;
    private String productName;
    private String productFormat;
    private String unit;
    private int processNum;
    private long startTime;
    private long finishTime;
    private String processFileId;
    private String processFileName;
    private long createTime;
    private long updateTime;

    @Override
    public String toString() {
        return "EntrustWorkingProductList{" +
                "id='" + id + '\'' +
                ", entrustWorkingNo='" + entrustWorkingNo + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productFormat='" + productFormat + '\'' +
                ", unit='" + unit + '\'' +
                ", processNum=" + processNum +
                ", startTime=" + startTime +
                ", finishTime=" + finishTime +
                ", processFileId='" + processFileId + '\'' +
                ", processFileName='" + processFileName + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public EntrustWorkingProduct(String id, String entrustWorkingNo, int sequenceNumber, String productCode, String productName, String productFormat, String unit, int processNum, long startTime, long finishTime, String processFileId, String processFileName, long createTime, long updateTime) {
        this.id = id;
        this.entrustWorkingNo = entrustWorkingNo;
        this.sequenceNumber = sequenceNumber;
        this.productCode = productCode;
        this.productName = productName;
        this.productFormat = productFormat;
        this.unit = unit;
        this.processNum = processNum;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.processFileId = processFileId;
        this.processFileName = processFileName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntrustWorkingNo() {
        return entrustWorkingNo;
    }

    public void setEntrustWorkingNo(String entrustWorkingNo) {
        this.entrustWorkingNo = entrustWorkingNo;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductFormat() {
        return productFormat;
    }

    public void setProductFormat(String productFormat) {
        this.productFormat = productFormat;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getProcessNum() {
        return processNum;
    }

    public void setProcessNum(int processNum) {
        this.processNum = processNum;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }

    public String getProcessFileId() {
        return processFileId;
    }

    public void setProcessFileId(String processFileId) {
        this.processFileId = processFileId;
    }

    public String getProcessFileName() {
        return processFileName;
    }

    public void setProcessFileName(String processFileName) {
        this.processFileName = processFileName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
}
