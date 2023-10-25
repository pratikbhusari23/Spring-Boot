package com.pb.cheapKart.DAL;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pb.cheapKart.Entity.itemDetails;

import jakarta.persistence.EntityManager;

@Repository
public class ItemDetailsImp implements ItemDetailsDAL{

    @Autowired
    EntityManager entityManager;
    @Override
    public void deleteItemDetails(int id) {

        Session session = entityManager.unwrap(Session.class);
        itemDetails itemDetails = session.get(itemDetails.class, id);
        session.remove(itemDetails);


    }
    
    
}
