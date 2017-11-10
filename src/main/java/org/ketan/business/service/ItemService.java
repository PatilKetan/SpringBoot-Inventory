package org.ketan.business.service;

import java.util.List;

import org.ketan.business.dto.ItemDTO;
import org.ketan.business.dto.ItemInDTO;

public interface ItemService
{
    public List<ItemDTO> getAllItems();
    
    public ItemDTO getItem(int id);
    
    public void addItem(ItemInDTO item);
        
    public void updateItem(ItemInDTO item, int id);

    public void deleteItem(int id);
    
}
