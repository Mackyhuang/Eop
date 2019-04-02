package vip.ifmm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author: MackyHuang
 * @eamil: 973151766@qq.com
 */
@Component
@Aspect
public class RecordlogAspect {

    @Around("@annotation(vip.ifmm.annotation.Recordlog)")
    public Object dopre(ProceedingJoinPoint joinPoint){

        Object[] args = joinPoint.getArgs();
        System.out.println(args.length);
        System.out.println("___");
        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return proceed;
    }
}
