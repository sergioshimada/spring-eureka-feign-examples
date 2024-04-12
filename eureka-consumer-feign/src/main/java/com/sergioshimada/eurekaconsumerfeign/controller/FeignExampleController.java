package com.sergioshimada.eurekaconsumerfeign.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public interface FeignExampleController {

    @GetMapping("/get-eureka-with-feign")
    String feignExampleClient(Model model);
}
