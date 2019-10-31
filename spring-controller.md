一.返回json
 @RestController+ Map<String,Object>;
  传值:@Controller+@GetMapper()+String-"success"+参数Map<String,Object>
       参数Model model;
       参数HttpServletRequest request;
       request.attabute("","");
       参数HttpSession session;
       session.setAttribute("","");
       服务器有效期--session:
       返回重定向:redirect:/emp;+参数使用HttpSession session
       在@Controller+@Getmapper上抛异常new 自定义异常;到@ExceptionHandler
       @ControllerAdvice+方法@ExceptionHandler(自定义异常类.Class)
       自定义异常类继承RuntimeException
       super("用户不存在"); 
       返回转发:forword:/error+参数使用HttpServletRequest request;   
        request.attribute("map",map);
       前端参数@RequestParam String name
       @DeleteMapper("emp/{id})+参数@PathVariable("id")  
  二.切面Aspect     
    @EnableAspectJAuto +@Aspect+@Componment
    定义方法:@Pointcut("exection public com.hxm.service.*(..)")
             public void myAop();  
    定义之前执行请求头信息@Before(Point)
    定义之后执行:@After 
    定义之后返回值:@AfterReturning(returning="ret",poincut="MyAop()") 
    定义之后返回值:
   三.给Bean赋值
   1.通过配置文件赋值
   方法@ConfigurationProperties(prefix = "spring.student").
   类上ConfigurationProperties(prefix = "spring.student").
   给属性赋值;
   2.通过@Value(${key}) @Value(#{15-2})@Value=
  四.整合Mybatis操作数据库
   1.配置数据源时,注意时区的配置:serverTimezone=UTC
   2.整合Druid数据源.
     A.写配置类导入Druid数据源
     B.Service服务和filter过滤器;
       
       