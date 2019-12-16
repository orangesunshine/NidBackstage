package com.orange.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("retrofit")
public class RetrofitDemoController {
    @RequestMapping("first")
    public Response<String> first(String request) throws InterruptedException {
        Response<String> response = new Response<>();
        response.code = 200;
        response.msg = "success";
        response.data = "first-request: " + request;
        return response;
    }

    @RequestMapping("second")
    public Response<String> second(String request) throws InterruptedException {
        Response<String> response = new Response<>();
        response.code = 200;
        response.msg = "success";
        response.data = "second-request: " + request;
        return response;
    }
}
