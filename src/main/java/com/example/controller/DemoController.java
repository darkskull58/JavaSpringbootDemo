package com.example.controller;

import com.azure.security.keyvault.secrets.SecretClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private SecretClient secretClient;
    
    @GetMapping("/")
    public String hello() {
        String secretValue = secretClient.getSecret("demo-secret").getValue();
        return "Hello from Azure! Secret value: " + secretValue;
    }
}