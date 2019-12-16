package com.orange.demo.response;


public class BaseResponse<Data> {
    public int code;
    public String msg;
    public Data data;

    public BaseResponse() {
        this.code = 200;
    }

    public BaseResponse(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
