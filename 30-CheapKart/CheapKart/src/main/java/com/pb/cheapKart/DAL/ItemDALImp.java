package com.pb.cheapKart.DAL;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pb.cheapKart.Entity.Item;

import jakarta.persistence.EntityManager;

@Repository 
public class ItemDALImp implements ItemDAL{

    @Autowired
    EntityManager entityManager;

    @Override
    public Item getItemByID(int id) {

        Session session = entityManager.unwrap(Session.class);
        Item item = session.get(Item.class, id);

        return item;
    }

    @Override
    public void createItem(Item item) {
        Session session = entityManager.unwrap(Session.class);
        session.persist(item);
    }

    @Override
    public void updateItem(Item item) {
        
        Session session = entityManager.unwrap(Session.class);
        session.merge(item);
    }

    @Override
    public void deleteItem(int id) {
        
        Session session = entityManager.unwrap(Session.class);
        Item item = session.get(Item.class, id);
        session.remove(item);
    }

    @Override
    public Iterable<Item> getAllItems() {
            
            Session session = entityManager.unwrap(Session.class);
            Iterable<Item> items = session.createQuery("from Item", Item.class).getResultList();
            return items;
    }

    
    
}
