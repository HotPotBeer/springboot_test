package com.ama.springboot_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类功能说明
 *
 * @Version 0.0.1
 * @Author WenZhe Wang
 * @Date 2021/12/15 15:54
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "成功!!!";
    }
}