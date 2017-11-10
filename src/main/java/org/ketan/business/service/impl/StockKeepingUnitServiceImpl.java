package org.ketan.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.ketan.business.dto.StockKeepingUnitDTO;
import org.ketan.business.dto.StockKeepingUnitInDTO;
import org.ketan.mapper.BeanMapperAdapter;
import org.ketan.persistence.dao.StockKeepingUnitDAO;
import org.ketan.persistence.db.ItemEntity;
import org.ketan.persistence.db.StockKeepingUnitEntity;
import org.ketan.persistence.db.SupplierEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockKeepingUnitServiceImpl
{

    @Autowired
    private StockKeepingUnitDAO stockKeepingUnitRepository;
    @Autowired
    private ItemServiceImpl itemService;
    @Autowired
    private SupplierServiceImpl supplierService;
    @Autowired
    private BeanMapperAdapter beanMapper;

    public List<StockKeepingUnitDTO> getAllStockKeepingUnits()
    {
        List<StockKeepingUnitDTO> keepingUnitsDTOList = new ArrayList<StockKeepingUnitDTO>();
        Iterable<StockKeepingUnitEntity> stockKeepingUnitList = stockKeepingUnitRepository.findAll();

        for (StockKeepingUnitEntity sku : stockKeepingUnitList)
        {
            keepingUnitsDTOList.add(beanMapper.map(sku, StockKeepingUnitDTO.class));
        }

        return keepingUnitsDTOList;
    }

    public StockKeepingUnitDTO getStockKeepingUnit(int id)
    {
        return beanMapper.map(stockKeepingUnitRepository.findOne(id), StockKeepingUnitDTO.class);
    }

    public void addStockKeepingUnit(StockKeepingUnitInDTO skuDto)
    {
        // Create sku object
        StockKeepingUnitEntity sku = beanMapper.map(skuDto, StockKeepingUnitEntity.class);
        System.out.println();
        // set item in sku object
        sku.setItem(beanMapper.map(itemService.getItem(skuDto.getItemId()), ItemEntity.class));
        // set supplier in sku object
        sku.setSupplier(beanMapper.map(supplierService.getSupplier(skuDto.getSupplierId()), SupplierEntity.class));

        stockKeepingUnitRepository.save(sku);

    }

    public void updateStockKeepingUnit(StockKeepingUnitInDTO skuDto, int id)
    {
        // Create sku object
        StockKeepingUnitEntity sku = beanMapper.map(skuDto, StockKeepingUnitEntity.class);
        // set item in sku object
        sku.setItem(beanMapper.map(itemService.getItem(skuDto.getItemId()), ItemEntity.class));
        // set supplier in sku object
        sku.setSupplier(beanMapper.map(supplierService.getSupplier(skuDto.getSupplierId()), SupplierEntity.class));

        stockKeepingUnitRepository.save(sku);
    }

    public void deleteStockKeepingUnit(int id)
    {
        stockKeepingUnitRepository.delete(id);
    }

    public StockKeepingUnitEntity getStockKeepingUnitForSupplier(int id)
    {
        return null;
    }

    public StockKeepingUnitEntity getStockKeepingUnitForItem(int id)
    {

        return null;
    }

    public StockKeepingUnitEntity getStockKeepingUnitForItemSupplier(int itemId, int supplierId)
    {
        return null;
    }

}
