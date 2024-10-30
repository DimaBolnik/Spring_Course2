package ru.bolnik.springcourse.Ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("ru.bolnik.springcourse.Ioc")
@PropertySource("classpath:myApplication.properties")
public class MyConfig {

    @Bean
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }



}
