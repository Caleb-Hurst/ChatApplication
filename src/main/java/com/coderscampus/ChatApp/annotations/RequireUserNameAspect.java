package com.coderscampus.ChatApp.annotations;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Aspect
@Component
public class RequireUserNameAspect {
    @Autowired
    private HttpSession session;

    @Around("@annotation(requireUserName)")
    public Object checkUserName(ProceedingJoinPoint joinPoint, RequireUserName requireUserName) throws Throwable {
        String storedName = (String) session.getAttribute("name");
        if (storedName == null) {
            return new ModelAndView("redirect:/welcome");
        }

        return joinPoint.proceed();
    }

    @Pointcut("execution(* com.coderscampus.ChatApp.web.ChannelController.*(..))")
    public void channelControllerMethods() {
    }
}
