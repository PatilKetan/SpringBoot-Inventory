package org.ketan.dto;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class StockKeepingUnitDTO {

	private int stockKeepingUnitId;

	private SupplierDTO supplier;

	private ItemDTO item;

	private Date entryDate;

	private Double price;

}
