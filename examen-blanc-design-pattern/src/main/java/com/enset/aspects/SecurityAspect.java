package com.enset.aspects;

import com.enset.annotations.SecuredBy;
import com.enset.security.SecurityContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SecurityAspect {

    private SecurityContext securityContext = new SecurityContext("omar", "omar", new String[]{"AGENT"});

    @Around("execution(void com.enset.Main.main(..))")
    public Object handleSecurityOfApp(ProceedingJoinPoint pjp) throws Throwable {
        if (securityContext.isAuthenticated()) {
            return pjp.proceed();
        }
        throw new RuntimeException("unauthenticated");
    }


    @Around(value = "@annotation(securedBy)", argNames = "pjp,securedBy")
    public Object handleSecurityRoles(ProceedingJoinPoint pjp, SecuredBy securedBy) throws Throwable {
        String[] roles = securedBy.roles();

        for (String r : roles) {
             if (securityContext.exist(r)) {
                 return pjp.proceed();
             }
        }
        throw new RuntimeException("Unauthorized ");

    }
}
