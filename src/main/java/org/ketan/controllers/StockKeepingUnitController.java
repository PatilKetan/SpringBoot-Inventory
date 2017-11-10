package org.ketan.controllers;

import java.util.List;

import org.ketan.dto.StockKeepingUnitDTO;
import org.ketan.dto.StockKeepingUnitInDTO;
import org.ketan.model.StockKeepingUnit;
import org.ketan.services.StockKeepingUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockKeepingUnitController {
	
	@Autowired
	private StockKeepingUnitService stockKeepingUnitService;

	@RequestMapping("/stockkeepingunits")
	public List<StockKeepingUnitDTO> getAllStockKeepingUnits()  {
		return stockKeepingUnitService.getAllStockKeepingUnits();
	}
	
	@RequestMapping("/stockkeepingunit/{id}")
	public StockKeepingUnitDTO getStockKeepingUnit(@PathVariable int id){
		return stockKeepingUnitService.getStockKeepingUnit(id);
	}
//	//implement
//	@RequestMapping("/item/{id}/stockkeepingunits")
//	public StockKeepingUnit getStockKeepingUnitsForItem(@PathVariable int id){
//		return stockKeepingUnitService.getStockKeepingUnitForItem(id);
//	}
//	//implement
//	@RequestMapping("/supplier/{id}/stockkeepingunits")
//	public StockKeepingUnit getStockKeepingUnitsForSupplier(@PathVariable int id){
//		return stockKeepingUnitService.getStockKeepingUnitForSupplier(id);
//	}
//	//implement
//	@RequestMapping("/item/{itemId}/supplier/{supplierId}/stockkeepingunits")
//	public StockKeepingUnit getStockKeepingUnitsForSupplierItem(@PathVariable int itemId,@PathVariable int supplierId){
//		return stockKeepingUnitService.getStockKeepingUnitForItemSupplier(itemId,supplierId);
//	}
//	
	@RequestMapping(method = RequestMethod.POST, value = "/stockkeepingunits")
	public void addStockKeepingUnit(@RequestBody StockKeepingUnitInDTO stockKeepingUnit) {
		stockKeepingUnitService.addStockKeepingUnit(stockKeepingUnit);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/stockkeepingunits/{id}")
	public void updateStockKeepingUnit(@RequestBody StockKeepingUnitInDTO stockKeepingUnit, @PathVariable int id) {
		stockKeepingUnitService.updateStockKeepingUnit(stockKeepingUnit, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/stockkeepingunits/{id}")
	public void deleteItem(@PathVariable int id) {
		stockKeepingUnitService.deleteStockKeepingUnit(id);
	}
	
}
