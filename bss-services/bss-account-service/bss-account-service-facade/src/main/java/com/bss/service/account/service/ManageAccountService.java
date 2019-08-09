package com.bss.service.account.service;

import com.bss.service.account.param.RegisterAccountRequest;
import com.bss.service.account.param.RegisterAccountResponse;

/**
 * 账户管理
 */
public interface ManageAccountService {

    /**
     * 注册账户
     * @param request
     * @return
     */
    RegisterAccountResponse registerAccount(RegisterAccountRequest request);

}
