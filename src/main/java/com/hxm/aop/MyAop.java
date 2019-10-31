package com.hxm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author XAIOHU
 * @date 2019/10/30 --16:41
 **/


@Component //加入到容器 中;
@Aspect
public class MyAop {
    //拦截点
    @Pointcut("execution(public * com.hxm.service..*(..))")
    public void MyAop(){

    }
    @Before(value = "MyAop()") //joinPoint
    public void  doBefore(JoinPoint joinPoint){
        //JoinPoint joinPoint :使用JoinPoint获得切面的名字,参数
        //RequestContextHolder获得前端发送过来的
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request =
                requestAttributes.getRequest();
        String method = request.getMethod();
        System.out.println("请求的方式:"+method);
        String requestURI = request.getRequestURI();
        System.out.println("请求的地址"+requestURI);


    }
    @After(value = "MyAop()")
    public void doAfter(){

        System.out.println("doAfter");
    }
    //执行结束之后的返回值;
    @AfterReturning(returning = "ret",pointcut  = "MyAop()")
    public void         doAfterReturning(Object ret){
        System.out.println(ret);

    }



}
