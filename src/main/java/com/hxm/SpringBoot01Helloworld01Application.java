package com.hxm;

import com.hxm.bean.Person;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@MapperScan("com.hxm.dao")
@EnableAspectJAutoProxy //注册切面的代理类
@SpringBootApplication
public class SpringBoot01Helloworld01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01Helloworld01Application.class, args);
    }
   @ConfigurationProperties(prefix = "spring.person")
    @Bean
    public Person person(){
        return new Person();
    }

}
