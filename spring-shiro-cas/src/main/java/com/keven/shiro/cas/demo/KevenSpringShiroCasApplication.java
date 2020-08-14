package com.keven.shiro.cas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@EnableTransactionManagement
@SpringBootApplication
public class KevenSpringShiroCasApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(KevenSpringShiroCasApplication.class, args);
    }
}
