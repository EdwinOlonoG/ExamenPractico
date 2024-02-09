package com.walmart.test.controller;

import com.walmart.test.VO.Request;
import com.walmart.test.VO.Response;
import com.walmart.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    public TestService testService;
    @PostMapping("/searchArray")
    public List<String> countDuplicated(@RequestBody Request request){
        List<String> response = testService.countDuplicated(request.getArr1(), request.getArr2());
        return response;
    }

    @GetMapping("/hola")
    public String hola(){
        return "hola";
    }
}
