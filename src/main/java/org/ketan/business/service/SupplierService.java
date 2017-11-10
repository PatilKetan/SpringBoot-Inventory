package org.ketan.business.service;

import java.util.List;

import org.ketan.business.dto.SupplierDTO;
import org.ketan.business.dto.SupplierInDTO;

public interface SupplierService
{
    public List<SupplierDTO> getAllSuppliers();
    
    public SupplierDTO getSupplier(int id);
    
    public void addSupplier(SupplierInDTO supplier);
    
    public void updateSupplier(SupplierInDTO supplier, int id);
    
    public void deleteSupplier(int id);
    
}
