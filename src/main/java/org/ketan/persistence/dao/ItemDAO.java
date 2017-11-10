package org.ketan.persistence.dao;

import org.ketan.persistence.db.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemDAO extends CrudRepository<ItemEntity, Integer>{
}
