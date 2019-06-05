package com.bss.framework.commons.param;

import com.bss.framework.commons.toolkit.JsonUtil;

import java.io.Serializable;

public abstract class BaseRequest implements Serializable {

    private static final long serialVersionUID = 7610039368571684404L;

    @Override
    public String toString() {
        return JsonUtil.toJsonString(this);
    }
}
