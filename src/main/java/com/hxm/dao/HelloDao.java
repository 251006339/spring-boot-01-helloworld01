package com.hxm.dao;

import com.hxm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author XAIOHU
 * @date 2019/10/30 --17:50
 **/
@Repository
public class HelloDao {


    @Autowired
    JdbcTemplate jdbcTemplate;

  public void insert(User user){
      jdbcTemplate.update("insert into  department values(?,?)",new Object[]{user.getId(),user.getName()});

  }

}
