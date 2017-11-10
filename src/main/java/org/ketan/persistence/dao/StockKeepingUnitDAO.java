package org.ketan.persistence.dao;

import java.util.List;

import org.ketan.persistence.db.StockKeepingUnitEntity;
import org.springframework.data.repository.CrudRepository;

public interface StockKeepingUnitDAO extends CrudRepository<StockKeepingUnitEntity, Integer> {
    
    public List<StockKeepingUnitEntity> findBySupplierSupplierId(int supplierId);
    public List<StockKeepingUnitEntity> findByItemItemId(int supplierId);

}
