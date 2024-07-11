package com.playxcel.inventory.repository;


import com.playxcel.inventory.model.response.Item;
import java.util.List;

public interface ItemRepository {
    Item getItemById(String id);
    Item saveItem(Item item);
    List<Item> getItemsByCategoryId(String categoryId);

}
