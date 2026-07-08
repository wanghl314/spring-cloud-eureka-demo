package com.whl.spring.cloud.eureka.controller;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
        data.put("a", RandomStringUtils.secure().nextAlphabetic(10));
        data.put("b", RandomStringUtils.secure().nextAlphanumeric(10));
        data.put("c", RandomStringUtils.secure().nextAscii(10));
        data.put("d", RandomStringUtils.secure().nextNumeric(10));
        return data;
    }

}
