package org.ketan.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.catalina.TomcatPrincipal;
import org.ketan.model.Item;
import org.ketan.model.Supplier;
import org.ketan.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
	 
	@Autowired
	private SupplierRepository supplierRepository;
	
	public List<Supplier> getAllSuppliers() {
		List<Supplier> suppliers = new ArrayList<Supplier>();
		supplierRepository.findAll().forEach(suppliers::add);
		return suppliers;
	}
	
	public Supplier getSupplier(int id) {
		Supplier supplier = supplierRepository.findOne(id);
		return supplier;
	}
	
	public void addSupplier(Supplier supplier) {
		supplierRepository.save(supplier);
	}
	
	public void updateSupplier(Supplier supplier, int id) {
		supplierRepository.save(supplier);
	}
	
	public void deleteSupplier(int id) {
		supplierRepository.delete(id);
	}
}
