package com.pb.cheapKart.DAL;

import com.pb.cheapKart.Entity.Item;

public interface ItemDAL {
    
    Item getItemByID(int id);

    void createItem(Item item);

    void updateItem(Item item);

    void deleteItem(int id);

    Iterable<Item> getAllItems();
    
}
