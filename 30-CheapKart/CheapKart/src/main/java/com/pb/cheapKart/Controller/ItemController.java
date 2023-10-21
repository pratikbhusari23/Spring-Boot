package com.pb.cheapKart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pb.cheapKart.Entity.Item;
import com.pb.cheapKart.Service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
    
    @Autowired
    ItemService itemService;

    @GetMapping("/id/{id}")
    public Item getItemByID(@PathVariable int id) {
        
        return itemService.getItemByID(id);    
    }

    @PostMapping("/post")
    public void createItem(@RequestBody Item item) {
        itemService.createItem(item);
    }

    @PutMapping("/update")
    public void updateItem(@RequestBody Item item) {
        itemService.updateItem(item);
    }

    @DeleteMapping("/id/{id}")
    public void deleteItem(@PathVariable int id) {
        itemService.deleteItem(id);
    }

    @GetMapping("/all")
    public Iterable<Item> getAllItems() {
        return itemService.getAllItems();
    }
}
