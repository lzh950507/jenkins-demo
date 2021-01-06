package com.lzh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizhihan
 * @date 2021-01-06
 */
@RestController
public class DemoController {


    @GetMapping("/demo")
    public Map<String, String> demo() {
        Map<String, String> map = new HashMap<>();
        map.put("jenkins-demo", "Hello Jenkins!");
        return map;
    }
}
