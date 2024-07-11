package com.playxcel.inventory.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ItemList {
    private ArrayList<ItemListElements> itemList;
    private Integer page;
    private Integer totalItems;

    public ItemList(){
        this.setItemList(new ArrayList<>());
    }
}

