package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 67545 on 2018/1/22.
 */
@RestController
public class helloController {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello,Spring Boot";
    }
}
