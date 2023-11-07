package com.shawee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Shawee
 * @Date 2023/11/6
 */

@RestController
public class UserController {

    @GetMapping("/test")
    public String test() {
        return "shawee";
    }

}
