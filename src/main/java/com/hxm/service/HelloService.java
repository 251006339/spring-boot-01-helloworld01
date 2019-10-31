package com.hxm.service;

import com.hxm.dao.DepartmentMapper;
import com.hxm.entity.Department;
import com.hxm.dao.HelloDao;
import com.hxm.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author XAIOHU
 * @date 2019/10/30 --16:39
 **/

@Service
public class HelloService {

@Autowired
    HelloDao helloDao;
@Autowired
    DepartmentMapper departmentMapper;

public String test(){
    User user=new User();

    user.setName("adb");
    helloDao.insert(user);
   return "success";
}


    public String selectDepartment(){
        Department department = departmentMapper.selectDepartment(1);
        return "success";
    }


}
