package com.gabriel.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Value("${TESTE_ENV_VAR:default}")
    private String customProperty;

    @GetMapping("/world")
    public ResponseEntity<String> world() {
        return ResponseEntity.ok("Hello!!" + customProperty);
    }

}
