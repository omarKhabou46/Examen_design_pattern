package com.enset.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Aspect
public class LogAspect {
    private final Logger logger = Logger.getLogger(LogAspect.class.getName());

  @Around("@annotation(com.enset.annotations.Log)")
  public Object handleLog(JoinPoint jp, ProceedingJoinPoint pjp) throws Throwable {
      logger.info("execution of " + jp.getSignature().getName());
      long t1 = System.currentTimeMillis();
      Object result = pjp.proceed();
      long t2 = System.currentTimeMillis();
      logger.info("execution time of " + jp.getSignature().getName() + " is " + (t2 - t1));
      return result;
  }

}
