package com.playxcel.inventory.controller;

import com.playxcel.inventory.model.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public ApiResponse getHealth(){
        return new ApiResponse(200,"Healthy");
    }
}
