package org.ketan.web.controllers;

import java.util.List;

import org.ketan.business.dto.SupplierDTO;
import org.ketan.business.dto.SupplierInDTO;
import org.ketan.business.service.impl.SupplierServiceImpl;
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
@RequestMapping("/suppliers")
public class SupplierController {
	
	@Autowired
	private SupplierServiceImpl supplierService;
	
	@GetMapping
	public List<SupplierDTO> getAllSuppliers() {
		return supplierService.getAllSuppliers();
	}
	
	@GetMapping("/{id}")
	public SupplierDTO getSupplier(@PathVariable int id) {
		return supplierService.getSupplier(id);
	}
	
	@PostMapping
	public void addSupplier(@RequestBody SupplierInDTO supplier) {
		supplierService.addSupplier(supplier);
	}
	
	@PutMapping("/{id}")
	public void updateSupplier(@RequestBody SupplierInDTO supplier,@PathVariable int id) {
		supplierService.updateSupplier(supplier,id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSupplier(@PathVariable int id) {
		supplierService.deleteSupplier(id);
	}
	
}
