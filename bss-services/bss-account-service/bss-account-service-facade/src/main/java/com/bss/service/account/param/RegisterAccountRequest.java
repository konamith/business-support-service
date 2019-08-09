package com.bss.service.account.param;

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
        final StringBuilder sb = new StringBuilder("RegisterAccountRequest{");
        sb.append("mobileNo='").append(mobileNo).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
