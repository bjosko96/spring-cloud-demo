package com.thesis.reservationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageRestController {

    private final String value;

    @Autowired
    public MessageRestController(@Value("${message}") String value) {
        this.value=value;
    }

    @RequestMapping(method=RequestMethod.GET, value="/message")
    String read() {
        return this.value;
    }
}