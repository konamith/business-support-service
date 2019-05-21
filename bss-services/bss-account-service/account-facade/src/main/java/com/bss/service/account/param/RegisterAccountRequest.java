package com.bss.service.account.param;

import com.bss.framework.commons.param.BaseRequest;
import com.bss.framework.commons.toolkit.JsonUtil;

/**
 * @Description 注册账户接口入参
 * @Author LiuMing
 * @Date 2019-05-21
 */
public class RegisterAccountRequest extends BaseRequest {

    /**
     * 手机号码
     */
    private String mobileNo;

    /**
     * 电子邮箱
     */
    private String email;

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return JsonUtil.toJsonString(this);
    }
}
