package com.bss.framework.commons.interceptor;

import org.aspectj.lang.annotation.Pointcut;

/**
 * 全局的
 * @Description TODO
 * @Author LiuMing
 * @Date 2019-06-06
 */
public class GlobalPointCutDefinition {

    @Pointcut("@within(com.bss.framework.commons.annotation.ServiceCompontent) && (execution(public * com.bss.service..*.*ServiceImpl.*(..)))")
    public void facadeInterfacePointCut() {}

}
