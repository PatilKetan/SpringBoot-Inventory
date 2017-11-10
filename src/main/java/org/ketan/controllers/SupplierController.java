package org.ketan.controllers;

import java.util.List;

import org.ketan.dto.SupplierDTO;
import org.ketan.model.Supplier;
import org.ketan.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	@RequestMapping("/suppliers")
	public List<SupplierDTO> getAllSuppliers() {
		return supplierService.getAllSuppliers();
	}
	
	@RequestMapping("/supplier/{id}")
	public SupplierDTO getSupplier(@PathVariable int id) {
		return supplierService.getSupplier(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/suppliers")
	public void addSupplier(@RequestBody SupplierDTO supplier) {
		supplierService.addSupplier(supplier);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/supplier/{id}")
	public void updateSupplier(@RequestBody SupplierDTO supplier,@PathVariable int id) {
		supplierService.updateSupplier(supplier,id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/supplier/{id}")
	public void deleteSupplier(@PathVariable int id) {
		supplierService.deleteSupplier(id);
	}
	
}
