package com.example.validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.blockhound.BlockHound;

@SpringBootApplication
public class ValidatorApplication {

    public static void main(String[] args) {
        BlockHound.install();
        SpringApplication.run(ValidatorApplication.class, args);
    }

}
