package com.hxm;

import com.hxm.aop.MyAop;
import com.hxm.config.MyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01Helloworld01ApplicationTests {

    @Test
    public void contextLoads() throws IOException {
        InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream("application.properties");
        Properties properties=new Properties();
        properties.load(systemResourceAsStream);
        Iterator<Map.Entry<Object, Object>> iterator = properties.entrySet().iterator();
        while (iterator.hasNext()){

            Map.Entry<Object, Object> next = iterator.next();
            Object key = next.getKey();
            Object value = next.getValue();
            System.out.println(
                    key+""+value
            );
        }

    }

    @Test
    public void contextLoads1() throws IOException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringBoot01Helloworld01Application.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        Object student = annotationConfigApplicationContext.getBean("student");
        System.out.println(student);
     }

}
