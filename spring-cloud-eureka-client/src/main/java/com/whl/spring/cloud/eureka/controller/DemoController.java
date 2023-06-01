package com.whl.spring.cloud.eureka.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping({"", "/"})
    public String index() {
        return this.restTemplate.getForObject("http://eureka-server/demo", String.class);
    }

    @GetMapping("/test")
    public Map<String, Object> test() {
        return this.restTemplate.getForObject("http://eureka-server/demo/test", Map.class);
    }

}
