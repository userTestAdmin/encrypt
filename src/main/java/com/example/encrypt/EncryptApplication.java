package com.example.encrypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class EncryptApplication {

    public static void main(String[] args) {
        SpringApplication.run(EncryptApplication.class, args);
    }

}
