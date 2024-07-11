package com.playxcel.inventory.model.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemListPayload {
    @NotNull
    private String categoryId;
    private Integer limit;
    private Integer pageNo;
}
