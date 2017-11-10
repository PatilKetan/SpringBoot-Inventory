package org.ketan.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.ketan.dto.ItemDTO;
import org.ketan.dto.ItemInDTO;
import org.ketan.mapper.BeanMapperAdapter;
import org.ketan.model.Item;
import org.ketan.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private BeanMapperAdapter beanMapper;
	
	public List<ItemDTO> getAllItems() {
		List<ItemDTO> itemsDTOList = new ArrayList<ItemDTO>();
		Iterable<Item> itemList = itemRepository.findAll();
		
		for (Item item : itemList) {
			itemsDTOList.add(beanMapper.map(item, ItemDTO.class));
		}
		
		return itemsDTOList;
	}
	
	public ItemDTO getItem(int id) {
		return beanMapper.map(itemRepository.findOne(id),ItemDTO.class);
	}
	
	public void addItem(ItemInDTO item) {
		itemRepository.save(beanMapper.map(item, Item.class));
	}
	
	
	public void updateItem(ItemInDTO item, int id) {
		itemRepository.save(beanMapper.map(item, Item.class));
	}

	public void deleteItem(int id) {
		itemRepository.delete(id);
	}
	
}
