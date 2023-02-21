package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintController {

    //default get
    @RequestMapping("/")
    public String getPrint() {
        return "test printing";
    }
}
