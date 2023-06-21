package com.poc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SpringRestController {
    @GetMapping("/connect")
    public void connect() {
        log.info("--- Spring Boot Application Connected.");
    }
}
