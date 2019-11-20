package io.turntabl.springwebservices.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.turntabl.springwebservices.model.HelloMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @GetMapping("sayhello")
    public HelloMessage sayHello(
            @RequestParam(name="name", defaultValue = "francis")
                    String name){
        HelloMessage message = new HelloMessage();
        message.setMessage("Hello!");
        message.setName(name);

        return message;
    }
}
