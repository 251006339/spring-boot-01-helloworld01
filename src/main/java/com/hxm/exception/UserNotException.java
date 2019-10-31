package com.hxm.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @date 2019/10/30 --13:45
 **/
@ControllerAdvice
public class UserNotException {

@ResponseBody
@ExceptionHandler(MyUserNotExistException.class)
public Map exception(Exception e){ //异常 e 输出消息
    Map<String,Object> map=new HashMap<>();
    map.put("error","用户不存在");


   return map;
}
/*
@ExceptionHandler(MyUserNotExistException.class)
    public String exception1(Exception e,HttpServletRequest request){
    Map<String,Object> map=new HashMap<>();
    map.put("error",e.getMessage());//错误的信息;
    request.setAttribute("map",map);
    return "forword:/error";
}
*/




}
