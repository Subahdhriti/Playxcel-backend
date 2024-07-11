package com.playxcel.inventory.model.response;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDetails {
    private String comment;
    @NotNull
    private Double rating;
    @NotNull
    private String user;
}
