package org.ketan.persistence.dao;

import org.ketan.persistence.db.StockKeepingUnitEntity;
import org.springframework.data.repository.CrudRepository;

public interface StockKeepingUnitDAO extends CrudRepository<StockKeepingUnitEntity, Integer> {

}
