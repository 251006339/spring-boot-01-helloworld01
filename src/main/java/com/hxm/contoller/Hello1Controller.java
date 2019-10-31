package com.hxm.contoller;

import com.hxm.entity.User;
import com.hxm.exception.MyUserNotExistException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author XAIOHU
 * @date 2019/10/30 --11:35
 **/
@Controller
public class Hello1Controller {
    @GetMapping("/success")
    public String  test(Map<String,Object> map){
        map.put("hello","<h1>你好<h1>");
        map.put("users", Arrays.asList("张三","例子","王五"));
        return "success";
    }
    @GetMapping("/hello002")
    public String  test1(){

        return "redirect:/success";
    }
    //发送异常到自定义异常类;
    @GetMapping("/error11")
    public String test(@RequestParam("name")  String name){
        if(name.equals("aaaa")){
            throw  new MyUserNotExistException();
        }



    return "success";
    }
    @ResponseBody
    @PostMapping("/error/{id}")
    public Map test(@PathVariable("id")Integer id, @RequestBody User user){
        HashMap<Object, Object> map = new HashMap<>();
            map.put("user",user);


        return map;
    }

}
