package com.jkh.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("bye")
    public String bye() {
        return "bye1";
    }
    @GetMapping("rebye")
    public String bye1() {
        return "bye";
    }
    @GetMapping("exe")
    public String exe() {
        return "exe";
    }
}
