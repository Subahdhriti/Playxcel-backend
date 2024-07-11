package com.playxcel.inventory.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ItemListElements {
    private Specifications specifications;
    private String category;
    private String currency;
    private String description;
    private String id;
    private ArrayList<ImageDetails> images;
    private String name;
    private Double price;
    private Double mrp;
    private RatingDetails ratingDetails;
    private Integer stock;
}
