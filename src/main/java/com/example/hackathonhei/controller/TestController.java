package com.example.hackathonhei.controller;

import com.example.hackathonhei.model.Test;
import com.example.hackathonhei.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestController {
    private TestService testService;

    @GetMapping("/test")
    public List<Test> getAllTest(){
        return testService.getAllTest();
    }


}
