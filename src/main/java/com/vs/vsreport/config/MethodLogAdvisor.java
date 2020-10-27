package com.vs.vsreport.config;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class MethodLogAdvisor {

    private static final Logger LOGGER = LogManager.getLogger(MethodLogAdvisor.class);
    
    @Around("@annotation(MethodLog) && execution(* * (..))")
    public Object methodLog(ProceedingJoinPoint joinPoint) throws Throwable {
    	
        Object result = null;
        String message = getMessage(joinPoint);
        LOGGER.info(message+" -- START");
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        try {
            result = joinPoint.proceed();
        } catch (Exception e) {
            LOGGER.error("Exception in MethodLogAdvisor.methodLog()", e);
            throw e;
        } finally {
            stopWatch.stop();
            LOGGER.info(message+" -- END");
            LOGGER.info("Elapsed Time (in Milliseconds): " + stopWatch.getTotalTimeMillis());
        }

        return result;
    }

    public String getMessage(JoinPoint joinPoint) throws Exception {
    	
        StringBuilder sb = new StringBuilder();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        sb.append(method.getDeclaringClass()).append(".").append(method.getName()).append(" ");
        return sb.toString();
    }
}
