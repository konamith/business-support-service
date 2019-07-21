package com.bss.service.account.param;

import java.io.Serializable;

public abstract class BaseResponse implements Serializable {

    private static final long serialVersionUID = -8231587645842922492L;

    /**
     * 返回码
     */
    protected String code;

    /**
     * 返回信息
     */
    protected String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseResponse{");
        sb.append("code='").append(code).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
