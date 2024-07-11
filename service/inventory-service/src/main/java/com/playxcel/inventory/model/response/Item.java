package com.playxcel.inventory.model.response;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "inventory_collection")
public class Item {
    @Id
    @NotNull
    private String id;
    @NotNull
    private String availability;
    private Specifications specifications;
    @NotNull
    private String brand;
    @NotNull
    private String category;
    @NotNull
    private String categoryId;
    private String currency;
    private String description;
    private ArrayList<ImageDetails> images;
    @NotNull
    private String name;
    @NotNull
    private Double price;
    @NotNull
    private Double mrp;
    private RatingDetails ratingDetails;
    private ArrayList<ReviewDetails> reviews;
    @NotNull
    private Integer stock;

}

