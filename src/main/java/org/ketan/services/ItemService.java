package org.ketan.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.ketan.model.Item;
import org.ketan.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getAllItems() {
		List<Item> items = new ArrayList<Item>();
		itemRepository.findAll().forEach(items::add);
		return items;
	}
	
	public Item getItem(int id) {
		return itemRepository.findOne(id);
	}
	
	public void addItem(Item item) {
		itemRepository.save(item);
	}
	
	
	public void updateItem(Item item, int id) {
		itemRepository.save(item);
	}

	public void deleteItem(int id) {
		itemRepository.delete(id);
	}
	
}
