package com.example.caffeinecache.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @Cacheable(cacheNames = "test1")
    @GetMapping("/caching/{name}")
    public String findTestData1(@PathVariable String name) {
        System.out.println("캐쉬 적용 테스트1==>" + name);
        return "dddddd";
    }
}
