package com.hxm.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.hxm.interceptor.MyHandInterceptor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * @author XAIOHU
 * @date 2019/10/30 --15:18
 **/
@Configuration
public class MyConfig  implements WebMvcConfigurer {


    @Override //自定义拦截的范围;
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyHandInterceptor()).addPathPatterns("/**").excludePathPatterns("/hello");
    }
/*配置@Bean的数据源的属性*/
@ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){

        return  new DruidDataSource();
    }


    //配置Druid的监控
    //1、配置一个管理后台的
    // Servlet
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams = new HashMap<>();

        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123456");
        initParams.put("allow","");//默认就是允许所有访问
        initParams.put("deny","192.168.15.21");

        bean.setInitParameters(initParams);
        return bean;
    }


    //2、配置一个web监控的filter
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());

        Map<String,String> initParams = new HashMap<>();
         //排除一些请求 监听;
        initParams.put("exclusions","*.js,*.css,/druid/*");

        bean.setInitParameters(initParams);
         //filter拦截所有请求;
        bean.setUrlPatterns(Arrays.asList("/*"));

        return  bean;
    }




}

