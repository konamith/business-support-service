package com.bss.service.account.service;

import com.alibaba.dubbo.config.annotation.Service;
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
@Service()
public class ManageAccountServiceImpl implements ManageAccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManageAccountServiceImpl.class);

    @Override
    public RegisterAccountResponse registerAccount(RegisterAccountRequest request) {
        return null;
    }
}
