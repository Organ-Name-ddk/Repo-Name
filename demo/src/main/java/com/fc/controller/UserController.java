package com.fc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ddk
 * @date 2021/8/21
 */
@RestController
public class UserController {

    @GetMapping("/test")
    public String test(){
        return "wsest";
            }
        }
