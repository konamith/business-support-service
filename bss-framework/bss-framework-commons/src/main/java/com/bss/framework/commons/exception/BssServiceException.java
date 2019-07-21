package com.bss.framework.commons.exception;

import com.bss.framework.commons.toolkit.JsonUtil;

/**
 * BSS服务层异常
 */
public class BssServiceException extends RuntimeException {

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
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
