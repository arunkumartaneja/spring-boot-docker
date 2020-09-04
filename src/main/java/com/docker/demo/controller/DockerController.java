package com.docker.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}
