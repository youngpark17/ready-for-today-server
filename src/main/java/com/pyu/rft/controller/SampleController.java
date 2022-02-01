package com.pyu.rft.controller;

import com.pyu.rft.utils.ApiUtils.ApiResult;
import static com.pyu.rft.utils.ApiUtils.success;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1")
public class SampleController {

    @GetMapping
    public ApiResult<String> test(){
        return success("성공");
    }
}
