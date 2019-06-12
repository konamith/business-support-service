package com.bss.framework.commons.toolkit;

import com.alibaba.fastjson.JSONObject;

public class JsonUtil {

    private JsonUtil() {}

    public static String toJsonString(Object obj) {
        return JSONObject.toJSONString(obj);
    }

}
