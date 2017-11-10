package org.ketan.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.ketan.business.dto.ItemDTO;
import org.ketan.business.dto.ItemInDTO;
import org.ketan.mapper.BeanMapperAdapter;
import org.ketan.persistence.dao.ItemDAO;
import org.ketan.persistence.db.ItemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl {

	@Autowired
	private ItemDAO itemRepository;
	
	@Autowired
	private BeanMapperAdapter beanMapper;
	
	public List<ItemDTO> getAllItems() {
		List<ItemDTO> itemsDTOList = new ArrayList<ItemDTO>();
		Iterable<ItemEntity> itemList = itemRepository.findAll();
		
		for (ItemEntity item : itemList) {
			itemsDTOList.add(beanMapper.map(item, ItemDTO.class));
		}
		
		return itemsDTOList;
	}
	
	public ItemDTO getItem(int id) {
		return beanMapper.map(itemRepository.findOne(id),ItemDTO.class);
	}
	
	public void addItem(ItemInDTO item) {
		itemRepository.save(beanMapper.map(item, ItemEntity.class));
	}
	
	
	public void updateItem(ItemInDTO item, int id) {
		itemRepository.save(beanMapper.map(item, ItemEntity.class));
	}

	public void deleteItem(int id) {
		itemRepository.delete(id);
	}
	
}
