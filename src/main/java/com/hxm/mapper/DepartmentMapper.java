package com.hxm.mapper;

import com.hxm.entity.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author XAIOHU
 * @date 2019/10/31 --13:20
 **/
/*@Mapper
public interface DepartmentMapper{

    @Select("select * from department where id=#{id}")
    public Department selectDepartment(Integer id);
    @Options(useGeneratedKeys =true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public  int insertDept(Department department);



}*/
