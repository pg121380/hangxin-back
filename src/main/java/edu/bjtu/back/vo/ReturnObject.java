package edu.bjtu.back.vo;

public class ReturnObject {

    private String message = "";
    private Integer code = 200;
    private Object data;

    public ReturnObject(Object data) {
        this.data = data;
    }

    public ReturnObject() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ReturnObject{" +
                "message='" + message + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
