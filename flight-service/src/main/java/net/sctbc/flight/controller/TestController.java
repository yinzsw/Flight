package net.sctbc.flight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinzsWang
 * @time 2022/5/3 17:48
 **/
@RestController
@RequestMapping("/flight")
public class TestController {
    @GetMapping("/1")
    String t() {
        return "hello world";
    }
}
