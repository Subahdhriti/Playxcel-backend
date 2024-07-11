package com.playxcel.inventory.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {
    private Integer code;
    private String message;

    public ApiResponse(int code, String msg) {
        this.code = code;
        this.message = msg;
    }
}
