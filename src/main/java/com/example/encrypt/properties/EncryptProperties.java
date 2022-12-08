package com.example.encrypt.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "body.encrypt")
@Data
public class EncryptProperties {
    private String key;
}

