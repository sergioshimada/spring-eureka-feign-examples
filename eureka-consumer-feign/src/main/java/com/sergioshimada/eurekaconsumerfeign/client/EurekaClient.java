package com.sergioshimada.eurekaconsumerfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
public interface EurekaClient {

    @RequestMapping("/exampleRestService")
    String exampleRestService();
}
