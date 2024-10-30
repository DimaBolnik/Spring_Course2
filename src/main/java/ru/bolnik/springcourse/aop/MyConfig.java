package ru.bolnik.springcourse.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.bolnik.springcourse.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
