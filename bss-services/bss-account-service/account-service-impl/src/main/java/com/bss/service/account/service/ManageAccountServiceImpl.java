package com.bss.service.account.service;

import com.bss.framework.commons.annotation.ServiceCompontent;
import com.bss.framework.commons.constant.CommonConstant;
import com.bss.service.account.param.RegisterAccountRequest;
import com.bss.service.account.param.RegisterAccountResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 账户管理
 *
 * @Description TODO
 * @Author LiuMing
 * @Date 2019-06-05
 */
@ServiceCompontent
public class ManageAccountServiceImpl implements ManageAccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonConstant.LOGGER_SYSTEM);

    @Override
    public RegisterAccountResponse registerAccount(RegisterAccountRequest request) {
        return null;
    }
}
