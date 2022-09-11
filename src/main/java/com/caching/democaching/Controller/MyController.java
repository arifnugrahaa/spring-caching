package com.caching.democaching.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caching.democaching.Services.HeavyService;

@RestController
@RequestMapping("/api/data")
public class MyController {
    
    @Autowired
    private HeavyService heavyService;

    @GetMapping
    public String getData(){
        return heavyService.getSomeData();
    }
}
