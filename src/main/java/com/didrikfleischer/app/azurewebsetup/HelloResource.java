package com.didrikfleischer.app.azurewebsetup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/hello")
@RestController
public class HelloResource {
    private String message = "Hello there!";

    @GetMapping
    public String hello() {
        return message;
    }
}
