package com.github.spring5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by verse on 2018/3/21.
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "hello Spring5";
    }
}
