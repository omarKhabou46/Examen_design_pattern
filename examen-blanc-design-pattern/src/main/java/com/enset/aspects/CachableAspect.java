package com.enset.aspects;

import com.enset.models.Agent;
import com.enset.models.Transaction;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class CachableAspect {

  private Map<Agent, Transaction> map = new HashMap<>();

    @Around("@annotation(com.enset.annotations.Cachable)")
    public Object handleCachable(ProceedingJoinPoint pjp) throws Throwable {

        Agent ag = (Agent) pjp.getTarget();

        if (map.containsKey(ag)) {
            System.out.println("Cache HIT");
            return map.get(ag);
        }

        System.out.println("Cache MISS");
        Object result = pjp.proceed();
        map.put(ag, (Transaction) result);
        return result;
    }

}
