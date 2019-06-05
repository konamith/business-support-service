package com.bss.service.account.param;

import com.bss.framework.commons.param.BaseResponse;
import com.bss.framework.commons.toolkit.JsonUtil;

/**
 * @Description 注册账户接口出参
 * @Author LiuMing
 * @Date 2019-05-21
 */
public class RegisterAccountResponse extends BaseResponse {

    private static final long serialVersionUID = 702930939425548390L;

    @Override
    public String toString() {
        return JsonUtil.toJsonString(this);
    }
}
