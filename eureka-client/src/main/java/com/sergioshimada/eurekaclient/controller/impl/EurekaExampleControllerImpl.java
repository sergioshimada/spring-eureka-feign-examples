package com.sergioshimada.eurekaclient.controller.impl;

import com.sergioshimada.eurekaclient.controller.EurekaExampleController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaExampleControllerImpl implements EurekaExampleController {

    @Override
    public String exampleRestService() {
        return "Example executed with success!";
    }
}
