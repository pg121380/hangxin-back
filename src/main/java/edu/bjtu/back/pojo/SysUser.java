package edu.bjtu.back.pojo;

/**
 * ClassName: SysUser
 * Description:
 * date: 2021/9/1 9:41
 *
 * @author liyifan
 */
public class SysUser {

    // 用户名
    private String account;

    // 邮箱
    private String email;

    // id
    private String id;

    // 电话
    private String mobile;

    // 用户名
    private String username;

    private String userType;

    public SysUser(String account, String email, String id, String mobile, String username, String userType) {
        this.account = account;
        this.email = email;
        this.id = id;
        this.mobile = mobile;
        this.username = username;
        this.userType = userType;
    }

    public SysUser() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", mobile='" + mobile + '\'' +
                ", username='" + username + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
