package org.ketan.persistence.dao;

import java.util.List;

import org.ketan.persistence.db.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemDAO extends CrudRepository<ItemEntity, Integer>{
    
    public List<ItemEntity> findByItemName(String name);
    
}
