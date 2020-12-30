package com.immoc.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("feign-client")
public interface IService {

    @GetMapping("/sayHi")
    String sayHi();

}
