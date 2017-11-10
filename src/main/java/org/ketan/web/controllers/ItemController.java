package org.ketan.web.controllers;

import java.util.List;

import org.ketan.business.dto.ItemDTO;
import org.ketan.business.dto.ItemInDTO;
import org.ketan.business.service.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController {
	
	@Autowired
	private ItemServiceImpl itemService;

	@GetMapping
	public List<ItemDTO> getAllItems()  {
		return itemService.getAllItems();
	}
	
	@GetMapping("/{id}")
	public ItemDTO getItem(@PathVariable int id){
		return itemService.getItem(id);
	}
	
	@PostMapping
	public void addItem(@RequestBody ItemInDTO item) {
		itemService.addItem(item);
	}
	
	@PutMapping("/{id}")
	public void updateItem(@RequestBody ItemInDTO item, @PathVariable int id) {
		itemService.updateItem(item, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteItem(@PathVariable int id) {
		itemService.deleteItem(id);
	}
}
