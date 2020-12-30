package com.immoc.springcloud.controller;

import com.immoc.springcloud.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class Controller {

    @Resource
    private IService iService;

    @GetMapping("/sayHi")
    public String sayHi(){
        return iService.sayHi();
    }

}
