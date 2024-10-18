package com.saptarshi.youpromised.controller;

import com.saptarshi.youpromised.model.Promise;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterPromise {

    @PostMapping(value = "/makepromise", consumes=MediaType.APPLICATION_JSON_VALUE)
    public String registerPromise(@RequestBody Promise promise) {
        // Logic to process the JSON data received in the request
        return "Promise registered: " + promise.getMadeBy() + " - " + promise.getMadeTo();
    }
}