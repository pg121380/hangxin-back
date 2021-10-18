package edu.bjtu.back.pojo;

public class EntrustWorking {
    private String id;
    private String companyName;
    private int companyNum;


    private String contact;

    private String ScreateTime;
    private String createUserId;
    private String currentWorkCompany;
    private int deptId;
    private String deptName;
    private String entrustWorkingNo;
    private Long isDel;
    private int link;
    private String planExplain;
    private int status;
    private int testingReportNum;
    private String transportCompany;
    private int transportMode;
    private String transportNo;
    private String updateTime;
    private Long updateUserId;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanyNum() {
        return companyNum;
    }

    public void setCompanyNum(int companyNum) {
        this.companyNum = companyNum;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getScreateTime() {
        return ScreateTime;
    }

    public void setScreateTime(String screateTime) {
        ScreateTime = screateTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCurrentWorkCompany() {
        return currentWorkCompany;
    }

    public void setCurrentWorkCompany(String currentWorkCompany) {
        this.currentWorkCompany = currentWorkCompany;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getEntrustWorkingNo() {
        return entrustWorkingNo;
    }

    public void setEntrustWorkingNo(String entrustWorkingNo) {
        this.entrustWorkingNo = entrustWorkingNo;
    }

    public Long getIsDel() {
        return isDel;
    }

    public void setIsDel(Long isDel) {
        this.isDel = isDel;
    }

    public int getLink() {
        return link;
    }

    public void setLink(int link) {
        this.link = link;
    }

    public String getPlanExplain() {
        return planExplain;
    }

    public void setPlanExplain(String planExplain) {
        this.planExplain = planExplain;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTestingReportNum() {
        return testingReportNum;
    }

    public void setTestingReportNum(int testingReportNum) {
        this.testingReportNum = testingReportNum;
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

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Override
    public String toString() {
        return "EntrustWorking{" +
                "id='" + id + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyNum=" + companyNum +
                ", contact='" + contact + '\'' +
                ", ScreateTime='" + ScreateTime + '\'' +
                ", createUserId='" + createUserId + '\'' +
                ", currentWorkCompany='" + currentWorkCompany + '\'' +
                ", deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", entrustWorkingNo='" + entrustWorkingNo + '\'' +
                ", isDel=" + isDel +
                ", link=" + link +
                ", planExplain='" + planExplain + '\'' +
                ", status=" + status +
                ", testingReportNum=" + testingReportNum +
                ", transportCompany='" + transportCompany + '\'' +
                ", transportMode=" + transportMode +
                ", transportNo='" + transportNo + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", updateUserId=" + updateUserId +
                '}';
    }

    public EntrustWorking(String id, String companyName, int companyNum, String contact, String screateTime, String createUserId, String currentWorkCompany, int deptId, String deptName, String entrustWorkingNo, Long isDel, int link, String planExplain, int status, int testingReportNum, String transportCompany, int transportMode, String transportNo, String updateTime, Long updateUserId) {
        this.id = id;
        this.companyName = companyName;
        this.companyNum = companyNum;
        this.contact = contact;
        ScreateTime = screateTime;
        this.createUserId = createUserId;
        this.currentWorkCompany = currentWorkCompany;
        this.deptId = deptId;
        this.deptName = deptName;
        this.entrustWorkingNo = entrustWorkingNo;
        this.isDel = isDel;
        this.link = link;
        this.planExplain = planExplain;
        this.status = status;
        this.testingReportNum = testingReportNum;
        this.transportCompany = transportCompany;
        this.transportMode = transportMode;
        this.transportNo = transportNo;
        this.updateTime = updateTime;
        this.updateUserId = updateUserId;
    }
}
