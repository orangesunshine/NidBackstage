package com.orange.demo.controller;

import com.orange.demo.response.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("parallel")
public class ParallelController {
    @RequestMapping("first")
    public BaseResponse<String> getFirst() {
        BaseResponse<String> response = new BaseResponse<>();
        response.code = 200;
        response.msg = "success";
        response.data = "parallel-first";
        return response;
    }

    @RequestMapping("second")
    public BaseResponse<String> getSecond(@RequestParam("params") String request) {
        BaseResponse<String> response = new BaseResponse<>();
        response.code = 200;
        response.msg = "success";
        response.data = "parallel-second";
        return response;
    }

    @RequestMapping("third")
    public BaseResponse<List<String>> getThird(@RequestParam("size") int size) {
        BaseResponse<List<String>> response = new BaseResponse<>();
        response.code = 200;
        response.msg = "success";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add("third: " + i);
        }
        response.data = list;
        return response;
    }
}
