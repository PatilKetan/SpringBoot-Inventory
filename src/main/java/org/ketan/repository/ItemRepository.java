package org.ketan.repository;

import java.io.Serializable;

import org.ketan.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer>{
}
