package com.hxm.dao;

import com.hxm.entity.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author XAIOHU
 * @date 2019/10/31 --13:20
 **/
@Repository
public interface DepartmentMapper {


    public Department selectDepartment(Integer id);

    public  int insertDept(Department department);



}
