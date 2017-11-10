package org.ketan.business.service;

import java.util.List;

import org.ketan.business.dto.StockKeepingUnitDTO;
import org.ketan.business.dto.StockKeepingUnitInDTO;
import org.ketan.persistence.db.StockKeepingUnitEntity;

public interface StockKeepingUnitService
{
    public List<StockKeepingUnitDTO> getAllStockKeepingUnits();

    public StockKeepingUnitDTO getStockKeepingUnit(int id);

    public void addStockKeepingUnit(StockKeepingUnitInDTO skuDto);

    public void updateStockKeepingUnit(StockKeepingUnitInDTO skuDto, int id);

    public void deleteStockKeepingUnit(int id);

    public StockKeepingUnitDTO getStockKeepingUnitsForSupplier(int id);

    public StockKeepingUnitEntity getStockKeepingUnitForItem(int id);

    public StockKeepingUnitEntity getStockKeepingUnitForItemSupplier(int itemId, int supplierId);

}
