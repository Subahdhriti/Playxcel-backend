package com.playxcel.inventory.controller.v1;

import com.playxcel.inventory.model.response.ApiResponse;
import com.playxcel.inventory.model.response.Item;
import com.playxcel.inventory.model.request.ItemDetailsPayload;
import com.playxcel.inventory.model.request.ItemListPayload;
import com.playxcel.inventory.model.response.ItemList;
import com.playxcel.inventory.service.InventoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/items")
public class ItemController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/item-details")
    public Item getItemDetails(@Valid @RequestBody ItemDetailsPayload payload, @RequestHeader String customerHash){
        return inventoryService.getItemDetails(payload.getItemId());
    }

    @PostMapping("/item-list")
    public ItemList getItemList(@Valid @RequestBody ItemListPayload payload, @RequestHeader String customerHash){
        return inventoryService.getItemList(payload);
    }

    @PostMapping("/add-item")
    public ApiResponse addItem(@Valid @RequestBody Item payload){
        inventoryService.addItem(payload);
        return new ApiResponse(200,"Success");
    }


}
