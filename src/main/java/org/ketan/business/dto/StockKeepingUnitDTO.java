package org.ketan.business.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockKeepingUnitDTO {

	private int stockKeepingUnitId;

	private SupplierDTO supplier;

	private ItemDTO item;

	private Date entryDate;

	private Double price;

}
