package com.bss.service.account.param;

/**
 * @Description 注册账户接口出参
 * @Author LiuMing
 * @Date 2019-05-21
 */
public class RegisterAccountResponse extends BaseResponse {

    private static final long serialVersionUID = 702930939425548390L;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegisterAccountResponse{");
        sb.append("code='").append(code).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
