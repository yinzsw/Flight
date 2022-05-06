package net.sctbc.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinzsWang
 * @time 2022/5/3 17:48
 **/
@RestController
@RequestMapping("/hello")
public class TestController {
    @GetMapping
    String t() {
        return "hello world";
    }
}
