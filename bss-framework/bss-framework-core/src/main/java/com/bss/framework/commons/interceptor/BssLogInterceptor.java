package com.bss.framework.commons.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.bss.framework.commons.constant.CommonConstant;
import com.bss.framework.commons.exception.BssServiceException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.CodeSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 全局日志拦截
 *
 * @Description TODO
 * @Author LiuMing
 * @Date 2019-06-06
 */
@Aspect
@Component
@Order(10)
public class BssLogInterceptor {

    private static final Logger SYSTEM_LOGGER = LoggerFactory.getLogger(CommonConstant.LOGGER_SYSTEM);

    private static final Logger PERFORMANCE_LOGGER = LoggerFactory.getLogger(CommonConstant.LOGGER_PERFORMANCE);

    @Around("com.bss.framework.commons.interceptor.GlobalPointCutDefinition.facadeInterfacePointCut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws BssServiceException {
        String interfaceInfo = getInterfaceInfo(joinPoint);
        SYSTEM_LOGGER.info(String.format("开始调用：%s，请求参数：%s", interfaceInfo, getParameterInfo(joinPoint)));
        long startTime = System.currentTimeMillis();
        Object obj = null;
        try {
            obj = joinPoint.proceed();
        } catch (Throwable e) {
            if (e instanceof BssServiceException) {
                SYSTEM_LOGGER.error("");
            }
        }

    }

    /**
     * 获取接口信息
     *
     * @param joinPoint
     * @return
     */
    private String getInterfaceInfo(ProceedingJoinPoint joinPoint) {
        return new StringBuffer(joinPoint.getTarget().getClass().getName()).append(".").append(joinPoint.getSignature().getName()).toString();
    }

    /**
     * 获取入参信息
     *
     * @param joinPoint
     * @return
     */
    private String getParameterInfo(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String[] paramNameArray = ((CodeSignature) joinPoint.getSignature()).getParameterNames();
        if (null != args && args.length > 0) {
            StringBuilder buff = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                buff.append(paramNameArray[i]).append(":").append(JSONObject.toJSONString(args[i]));
            }
            return buff.toString();
        }
        return "";
    }
}
