package com.rakeshrj;


import com.rakeshrj.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
         Alien obj =  context.getBean(Alien.class);
           System.out.println(obj.getAge());
               obj.code();



        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//       // Desktop dt = context.getBean( "Leo", Desktop.class);
//        Desktop dt = context.getBean( Desktop.class);
//           dt.compile();
//
//        Desktop dt1 = context.getBean( Desktop.class);
//        dt.compile();




//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = (Alien) context.getBean("alien");
//            obj.setAge(24);
//        System.out.println(obj.getAge());
//              obj.code();
//
//
//              Desktop obj1 =(Desktop) context.getBean("com");
   }
}
