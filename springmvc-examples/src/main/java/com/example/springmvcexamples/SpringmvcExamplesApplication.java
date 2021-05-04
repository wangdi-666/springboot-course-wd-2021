package com.example.springmvcexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringmvcExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmvcExamplesApplication.class, args);
    }

    /*
    // example04用,现在有了SecurityConfiguration，就不需要这个，注释掉就行
    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
    */
}
