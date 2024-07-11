package com.playxcel.inventory.service;

import com.playxcel.inventory.model.request.ItemListPayload;
import com.playxcel.inventory.model.response.Item;
import com.playxcel.inventory.model.response.ItemList;
import com.playxcel.inventory.model.response.ItemListElements;
import com.playxcel.inventory.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private ItemRepository itemRepository;

    public void addItem(Item item){
        itemRepository.saveItem(item);
    }

    public Item getItemDetails(String itemId){

        return itemRepository.getItemById(itemId);
    }

    public ItemList getItemList(ItemListPayload payload){
        List<Item> productList = itemRepository.getItemsByCategoryId(payload.getCategoryId());
        ItemList itemList = new ItemList();

        productList.forEach( product -> {
            ItemListElements itemListElements = new ItemListElements();
            itemListElements.setId(product.getId());
            itemListElements.setCategory(product.getCategory());
            itemListElements.setSpecifications(product.getSpecifications());
            itemListElements.setImages(product.getImages());
            itemListElements.setName(product.getName());
            itemListElements.setCurrency(product.getCurrency());
            itemListElements.setDescription(product.getDescription());
            itemListElements.setPrice(product.getPrice());
            itemListElements.setMrp(product.getMrp());
            itemListElements.setStock(product.getStock());
            itemListElements.setRatingDetails(product.getRatingDetails());

            itemList.getItemList().add(itemListElements);
            }
        );

        itemList.setTotalItems(itemList.getItemList().size());

        return itemList;
    }
}
