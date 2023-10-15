package com.halo.cache.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试 controller
 *
 * @author halo
 * @since 2023/10/15 21:39
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
}
