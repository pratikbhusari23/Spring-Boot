package com.pb.cheapKart.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pb.cheapKart.DAL.ItemDetailsDAL;

import jakarta.transaction.Transactional;

@Service
public class ItemDetailsService {

    @Autowired
    ItemDetailsDAL itemDetailsDAL;

    @Transactional
    public void deleteItemDetails(int id) {
        itemDetailsDAL.deleteItemDetails(id);
    }
    
}
