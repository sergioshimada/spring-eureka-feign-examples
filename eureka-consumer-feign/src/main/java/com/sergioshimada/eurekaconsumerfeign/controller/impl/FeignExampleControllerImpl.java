package com.sergioshimada.eurekaconsumerfeign.controller.impl;

import com.sergioshimada.eurekaconsumerfeign.client.EurekaClient;
import com.sergioshimada.eurekaconsumerfeign.controller.FeignExampleController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignExampleControllerImpl implements FeignExampleController {

    @Autowired
    private EurekaClient eurekaClient;

    @Override
    public String feignExampleClient(Model model) {

        return eurekaClient.exampleRestService();
    }
}
