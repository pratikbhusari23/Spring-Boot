package com.pb.website.repository;

import java.util.Optional;

public interface DAO<T> {
    
    public Optional<T> getEntityById(Integer id);
    public int saveEntity(T t);
}
