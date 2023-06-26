package com.whl.spring.cloud.eureka.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping({"", "/"})
    public String index() {
        return "Demo";
    }

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> test() {
        Map<String, Object> data = new HashMap<>();
        data.put("a", RandomStringUtils.randomAlphabetic(10));
        data.put("b", RandomStringUtils.randomAlphanumeric(10));
        data.put("c", RandomStringUtils.randomAscii(10));
        data.put("d", RandomStringUtils.randomNumeric(10));
        return data;
    }

}
