/**
 * Created By Arun Singh
 * Date:25-06-2025
 * Time:10:56
 * Project Name:SecurityWithJwt
 */

package com.nontech.SecurityWithJwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/contact")
    public String sayContact() {
        return "Hello Contact";
    }
}
