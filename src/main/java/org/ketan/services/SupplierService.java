package org.ketan.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.apache.catalina.TomcatPrincipal;
import org.ketan.dto.ItemDTO;
import org.ketan.dto.SupplierDTO;
import org.ketan.mapper.BeanMapperAdapter;
import org.ketan.model.Item;
import org.ketan.model.Supplier;
import org.ketan.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
	 
	@Autowired
	private SupplierRepository supplierRepository;
	
	@Autowired
	private BeanMapperAdapter beanMapper;
	
	public List<SupplierDTO> getAllSuppliers() {
		List<SupplierDTO> suppliersDTOList = new ArrayList<SupplierDTO>();
		Iterable<Supplier> SupplierList = supplierRepository.findAll();
		
		for (Supplier Supplier : SupplierList) {
			suppliersDTOList.add(beanMapper.map(Supplier, SupplierDTO.class));
		}
		
		return suppliersDTOList;
	}
	
	public SupplierDTO getSupplier(int id) {
		return beanMapper.map(supplierRepository.findOne(id),SupplierDTO.class);
	}
	
	public void addSupplier(SupplierDTO supplier) {
		supplierRepository.save(beanMapper.map(supplier, Supplier.class));
	}
	
	public void updateSupplier(SupplierDTO supplier, int id) {
		supplierRepository.save(beanMapper.map(supplier, Supplier.class));
	}
	
	public void deleteSupplier(int id) {
		supplierRepository.delete(id);
	}
}
