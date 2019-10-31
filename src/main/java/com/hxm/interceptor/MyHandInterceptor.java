package com.hxm.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Optional;

/**
 * @author XAIOHU
 * @date 2019/10/30 --15:42
 **/
  //还要定义拦截器 的范围
public class MyHandInterceptor implements HandlerInterceptor {
    @Override  //拦截所有请求
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
         //如果有session 就执行,没有session就创建新的session
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {

        }

        HttpSession session = request.getSession();
        //key--value   aaa---aaa
        String aaa = (String)session.getAttribute("aaa");


        if(!StringUtils.isEmpty(aaa) &&aaa.equals("aaa")){
            return true;
        }
        //跳转到注册的请求;
        request.getRequestDispatcher("/hello").forward(request,response);

        return false;
    }
}
