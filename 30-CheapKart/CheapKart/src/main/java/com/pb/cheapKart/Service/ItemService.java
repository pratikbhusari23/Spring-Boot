package com.pb.cheapKart.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.cheapKart.DAL.ItemDAL;
import com.pb.cheapKart.Entity.Item;

import jakarta.transaction.Transactional;

@Service
public class ItemService {

    @Autowired
    ItemDAL itemDAL;

    @Transactional
    public Item getItemByID(int id) {

        return itemDAL.getItemByID(id);
    }

    @Transactional
    public void createItem(Item item) {
        itemDAL.createItem(item);
    }

    @Transactional
    public void updateItem(Item item) {

        itemDAL.updateItem(item);
    }

    @Transactional
    public void deleteItem(int id) {
        itemDAL.deleteItem(id);
    }

    @Transactional
    public Iterable<Item> getAllItems() {
        return itemDAL.getAllItems();
    }
    

}
