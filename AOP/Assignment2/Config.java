package AOP.Assignment2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("AOP.Assignment2")
public class Config {

    @Bean
    public Employee emp(){
        return new Employee();
    }

}
