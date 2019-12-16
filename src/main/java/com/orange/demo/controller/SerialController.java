package com.orange.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("serial")
public class SerialController {

    @RequestMapping("first")
    public Response<String> getLoadingData() throws InterruptedException {
        Thread.sleep(2000);
        Response<String> response = new Response<>();
        response.code = 200;
        response.msg = "success";
        response.data = "first";
        return response;
    }

    @RequestMapping("second")
    public Response<String> getLoadingData(@RequestParam(required = false) String params) throws InterruptedException {
        Thread.sleep(2000);
        Response<String> response = new Response<>();
        response.code = 200;
        response.msg = "success";
        response.data = "second-params: " + params;
        return response;
    }

    @RequestMapping("third")
    public Response<List<String>> getLoadingData(@RequestParam(required = false) String params1, @RequestParam(required = false) String params2) throws InterruptedException {
        Thread.sleep(2000);
        Response<List<String>> response = new Response<>();
        response.code = 200;
        response.msg = "success";
        List<String> ret = new ArrayList<>();
        ret.add("1");
        ret.add("2");
        ret.add("3");
        ret.add("4");
        ret.add("5");
        response.data = ret;
        return response;
    }
}

class Response<T> {
    public int code;
    public String msg;
    public T data;
}
