package com.playxcel.inventory.repository;

import com.playxcel.inventory.model.response.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Repository
public class ItemRepositoryImpl implements ItemRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Item getItemById(String id) {
        return mongoTemplate.findById(id, Item.class);
    }

    @Override
    public Item saveItem(Item item) {
        return mongoTemplate.save(item);
    }

    @Override
    public List<Item> getItemsByCategoryId(String categoryId) {
        return mongoTemplate.query(Item.class)
                .matching(query(where("categoryId").is(categoryId)))
                .all();
    }
}
