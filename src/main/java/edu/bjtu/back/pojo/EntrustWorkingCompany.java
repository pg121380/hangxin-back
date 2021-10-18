package edu.bjtu.back.pojo;

public class EntrustWorkingCompany {
    private String id;
    private String entrustWorkingId;
    private String companyUp;
    private String companyDown;
    private String stepNumber;
    private String companyCode;
    private String companyName;
    private String status;
    private String createTime;
    private String updateTime;
    private String deptId;

    public EntrustWorkingCompany(String id, String entrustWorkingId, String companyUp, String companyDown, String stepNumber, String companyCode, String companyName, String status, String createTime, String updateTime, String deptId) {
        this.id = id;
        this.entrustWorkingId = entrustWorkingId;
        this.companyUp = companyUp;
        this.companyDown = companyDown;
        this.stepNumber = stepNumber;
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deptId = deptId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntrustWorkingId() {
        return entrustWorkingId;
    }

    public void setEntrustWorkingId(String entrustWorkingId) {
        this.entrustWorkingId = entrustWorkingId;
    }

    public String getCompanyUp() {
        return companyUp;
    }

    public void setCompanyUp(String companyUp) {
        this.companyUp = companyUp;
    }

    public String getCompanyDown() {
        return companyDown;
    }

    public void setCompanyDown(String companyDown) {
        this.companyDown = companyDown;
    }

    public String getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(String stepNumber) {
        this.stepNumber = stepNumber;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "EntrustWorkingCompany{" +
                "id='" + id + '\'' +
                ", entrustWorkingId='" + entrustWorkingId + '\'' +
                ", companyUp='" + companyUp + '\'' +
                ", companyDown='" + companyDown + '\'' +
                ", stepNumber='" + stepNumber + '\'' +
                ", companyCode='" + companyCode + '\'' +
                ", companyName='" + companyName + '\'' +
                ", status='" + status + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", deptId='" + deptId + '\'' +
                '}';
    }
}
