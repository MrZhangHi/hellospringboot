package cn.study.dockerspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("get")
    public String get(){
        return "hello docker!";
    }
}
