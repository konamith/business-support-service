package com.bss.framework.commons.param;

import com.bss.framework.commons.toolkit.JsonUtil;

import java.io.Serializable;

public abstract class BaseResponse implements Serializable {

    private static final long serialVersionUID = 1L;

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
        return JsonUtil.toJsonString(this);
    }
}
