package com.rakeshrj.config;

import com.rakeshrj.Alien;
import com.rakeshrj.Computer;
import com.rakeshrj.Desktop;
import com.rakeshrj.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.rakeshrj")
public class AppConfig {




//@Bean(name = {"com2","Leo","Rocky","Desktop1"})


//   @Bean
//   public Alien alien( @Autowired  Computer com){   //@Qualifier("desktop")
//       Alien obj = new Alien();
//        obj.setAge(24);
//        obj.setCom(desktop());
//       return obj;
//   }
//
//
//   @Bean
//  // @Scope("prototype")
//    public Desktop desktop () {
//       return new Desktop();
//   }
//
//   @Bean
//     @Primary
//        public Laptop laptop(){
//            return new Laptop();
//       }
//
}

