package com.hxm.contoller;

import com.hxm.bean.Person;
import com.hxm.bean.Student;
import com.hxm.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author XAIOHU
 * @date 2019/10/30 --11:13
 **/
@RestController
public class HelloController {
    @Autowired
    com.hxm.service.HelloService helloService;
    @Autowired
    Person person;
    @Autowired
    Student student;
@GetMapping("/hello")
 public Map test(){
    Map<String,Object> map=new HashMap<>();
    //跳转到该页面;
    System.out.println(student);

    System.out.println(person);
    Person person1 = new Person();
     person1.setName("xiaohu");
     person1.setAge("1");
    map.put("person",person1);

    String s = helloService.selectDepartment();
    map.put("test",s);


    return map;
 }
    @GetMapping("/hello1")
    public Map test1(){
        Map<String,Object> map1=new HashMap<>();
        Person person = new Person();
        person.setName("xiaohu");
        person.setAge("1");
        map1.put("person",person);
        return map1;
    }

}
