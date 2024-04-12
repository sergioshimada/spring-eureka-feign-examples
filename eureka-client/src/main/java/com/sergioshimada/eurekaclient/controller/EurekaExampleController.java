package com.sergioshimada.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;


public interface EurekaExampleController {

    @RequestMapping("/exampleRestService")
    String exampleRestService();
}
