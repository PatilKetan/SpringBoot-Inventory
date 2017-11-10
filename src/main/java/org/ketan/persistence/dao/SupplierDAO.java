package org.ketan.persistence.dao;

import java.util.List;

import org.ketan.persistence.db.SupplierEntity;
import org.springframework.data.repository.CrudRepository;

public interface SupplierDAO extends CrudRepository<SupplierEntity, Integer>{
    
    public List<SupplierEntity> findBySupplierName(String name);
}
