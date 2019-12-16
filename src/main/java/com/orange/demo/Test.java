package com.orange.demo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orange.demo.response.BaseResponse;

import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        String json = "{\n" +
                "\t\"code\": 200,\n" +
                "\t\"msg\": \"success\",\n" +
                "\t\"data\": [1, 2, 3, 4, 5]}";
        BaseResponse<List<String>> baseResponse = new Gson().fromJson(json, TypeToken.getParameterized(BaseResponse.class, TypeToken.getParameterized(List.class,String.class).getType()).getType());
        System.out.println(String.valueOf(baseResponse.data));
    }

    /**
     * 删除list中null元素
     *
     * @param oldList
     * @param <T>
     * @return
     */
    public static <T> List<T> removeNull(List<? extends T> oldList) {

        // 你没有看错，真的是有 1 行代码就实现了
        oldList.removeAll(Collections.singleton(null));
        return (List<T>) oldList;
    }
}
