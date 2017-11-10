package org.ketan.web.controllers;

import java.util.List;

import org.ketan.business.dto.StockKeepingUnitDTO;
import org.ketan.business.dto.StockKeepingUnitInDTO;
import org.ketan.business.service.impl.StockKeepingUnitServiceImpl;
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
@RequestMapping("/stockkeepingunits")
public class StockKeepingUnitController {
	
	@Autowired
	private StockKeepingUnitServiceImpl stockKeepingUnitService;

	@GetMapping
	public List<StockKeepingUnitDTO> getAllStockKeepingUnits()  {
		return stockKeepingUnitService.getAllStockKeepingUnits();
	}
	
	@GetMapping("/{id}")
	public StockKeepingUnitDTO getStockKeepingUnit(@PathVariable int id){
		return stockKeepingUnitService.getStockKeepingUnit(id);
	}
	
	@GetMapping("suppliers/{id}")
    public List<StockKeepingUnitDTO> getStockKeepingUnitsForSupplier(@PathVariable int id){
        return stockKeepingUnitService.getStockKeepingUnitsForSupplier(id);
    }

	@PostMapping
	public void addStockKeepingUnit(@RequestBody StockKeepingUnitInDTO stockKeepingUnit) {
		stockKeepingUnitService.addStockKeepingUnit(stockKeepingUnit);
	}
	
	@PutMapping("/{id}")
	public void updateStockKeepingUnit(@RequestBody StockKeepingUnitInDTO stockKeepingUnit, @PathVariable int id) {
		stockKeepingUnitService.updateStockKeepingUnit(stockKeepingUnit, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteItem(@PathVariable int id) {
		stockKeepingUnitService.deleteStockKeepingUnit(id);
	}
	
}
