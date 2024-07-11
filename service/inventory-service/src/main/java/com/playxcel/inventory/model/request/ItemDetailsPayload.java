package com.playxcel.inventory.model.request;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
public class ItemDetailsPayload {
    private String customerHash;
    @NotNull
    private String itemId;
}

