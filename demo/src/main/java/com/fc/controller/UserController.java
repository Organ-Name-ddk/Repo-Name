package com.fc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ddk
 *  2021/8/21
 */
@RestController
public class UserController {

    @GetMapping("/test")
    public String test(){
        System.out.println("000");
        System.out.println("www");
        System.out.println("sss");

        return "wsest";
            }
        }
