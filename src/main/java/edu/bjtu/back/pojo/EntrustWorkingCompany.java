package edu.bjtu.back.pojo;

public class EntrustWorkingCompany {
    private String id;
    private String entrustWorkingId;
    private String companyUp;
    private String companyDown;
    private int stepNumber;
    private String companyCode;
    private String companyName;
    private int status;
    private String createTime;
    private String updateTime;
    private long deptId;

    @Override
    public String toString() {
        return "EntrustWorkingCompany{" +
                "id='" + id + '\'' +
                ", entrustWorkingId='" + entrustWorkingId + '\'' +
                ", companyUp='" + companyUp + '\'' +
                ", companyDown='" + companyDown + '\'' +
                ", stepNumber=" + stepNumber +
                ", companyCode='" + companyCode + '\'' +
                ", companyName='" + companyName + '\'' +
                ", status=" + status +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", deptId=" + deptId +
                '}';
    }

    public EntrustWorkingCompany(String id, String entrustWorkingId, String companyUp, String companyDown, int stepNumber, String companyCode, String companyName, int status, String createTime, String updateTime, long deptId) {
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

    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) {
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
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

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }
}
