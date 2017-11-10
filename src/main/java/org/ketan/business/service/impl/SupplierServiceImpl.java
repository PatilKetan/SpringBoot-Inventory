package org.ketan.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.ketan.business.dto.SupplierDTO;
import org.ketan.business.dto.SupplierInDTO;
import org.ketan.mapper.BeanMapperAdapter;
import org.ketan.persistence.dao.SupplierDAO;
import org.ketan.persistence.db.SupplierEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl {
	 
	@Autowired
	private SupplierDAO supplierRepository;
	
	@Autowired
	private BeanMapperAdapter beanMapper;
	
	public List<SupplierDTO> getAllSuppliers() {
		List<SupplierDTO> suppliersDTOList = new ArrayList<SupplierDTO>();
		Iterable<SupplierEntity> SupplierList = supplierRepository.findAll();
		
		for (SupplierEntity Supplier : SupplierList) {
			suppliersDTOList.add(beanMapper.map(Supplier, SupplierDTO.class));
		}
		
		return suppliersDTOList;
	}
	
	public SupplierDTO getSupplier(int id) {
		return beanMapper.map(supplierRepository.findOne(id),SupplierDTO.class);
	}
	
	public void addSupplier(SupplierInDTO supplier) {
		supplierRepository.save(beanMapper.map(supplier, SupplierEntity.class));
	}
	
	public void updateSupplier(SupplierInDTO supplier, int id) {
		supplierRepository.save(beanMapper.map(supplier, SupplierEntity.class));
	}
	
	public void deleteSupplier(int id) {
		supplierRepository.delete(id);
	}
}
