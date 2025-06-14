package com.example.microservice_client_2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${app.message:Default message}")
    private String message;

    @Value("${app.version:Unknown}")
    private String version;

    @GetMapping("/message")
    public String getMessage() {
        return message + " (Version: " + version + " )";
    }
}
