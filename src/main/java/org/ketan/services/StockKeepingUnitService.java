package org.ketan.services;

import java.util.ArrayList;
import java.util.List;

import org.ketan.dto.ItemDTO;
import org.ketan.dto.StockKeepingUnitDTO;
import org.ketan.dto.StockKeepingUnitInDTO;
import org.ketan.mapper.BeanMapperAdapter;
import org.ketan.model.Item;
import org.ketan.model.StockKeepingUnit;
import org.ketan.model.Supplier;
import org.ketan.repository.StockKeepingUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockKeepingUnitService {
	
	@Autowired
	private StockKeepingUnitRepository stockKeepingUnitRepository;
	@Autowired
	private ItemService itemService;
	@Autowired
	private SupplierService supplierService;
	@Autowired
	private BeanMapperAdapter beanMapper;
	
	public List<StockKeepingUnitDTO> getAllStockKeepingUnits() {
		System.out.println("*********************************In Get*********************************");
		List<StockKeepingUnitDTO> keepingUnitsDTOList = new ArrayList<StockKeepingUnitDTO>();
		Iterable<StockKeepingUnit> stockKeepingUnitList = stockKeepingUnitRepository.findAll();
		
		for (StockKeepingUnit sku : stockKeepingUnitList) {
			keepingUnitsDTOList.add(beanMapper.map(sku, StockKeepingUnitDTO.class));
		}
		
		return keepingUnitsDTOList;
	}
	
	public StockKeepingUnitDTO getStockKeepingUnit(int id) {
		return beanMapper.map(stockKeepingUnitRepository.findOne(id),StockKeepingUnitDTO.class);
	}
	
	public void addStockKeepingUnit(StockKeepingUnitInDTO skuDto) {
		//Create sku object
		StockKeepingUnit sku = beanMapper.map(skuDto, StockKeepingUnit.class);
		System.out.println();
		//set item in sku object
		sku.setItem(beanMapper.map(itemService.getItem(skuDto.getItemId()),Item.class));
		//set supplier in sku object
		sku.setSupplier(beanMapper.map(supplierService.getSupplier(skuDto.getSupplierId()),Supplier.class));
		
		stockKeepingUnitRepository.save(sku);
		
	}
	
	
	public void updateStockKeepingUnit(StockKeepingUnitInDTO skuDto, int id) {
		//Create sku object
		StockKeepingUnit sku = beanMapper.map(skuDto, StockKeepingUnit.class);
		//set item in sku object
		sku.setItem(beanMapper.map(itemService.getItem(skuDto.getItemId()),Item.class));
		//set supplier in sku object
		sku.setSupplier(beanMapper.map(supplierService.getSupplier(skuDto.getSupplierId()),Supplier.class));
		
		stockKeepingUnitRepository.save(sku);
	}

	public void deleteStockKeepingUnit(int id) {
		stockKeepingUnitRepository.delete(id);
	}

	public StockKeepingUnit getStockKeepingUnitForSupplier(int id) {
		return null;
	}

	public StockKeepingUnit getStockKeepingUnitForItem(int id) {
		
		return null;
	}

	public StockKeepingUnit getStockKeepingUnitForItemSupplier(int itemId, int supplierId) {
		return null;
	}

	
}
