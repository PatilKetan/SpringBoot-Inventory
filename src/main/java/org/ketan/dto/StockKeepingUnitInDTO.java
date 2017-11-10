package org.ketan.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockKeepingUnitInDTO {

	private int supplierId;

	private int itemId;

	private Date entryDate;

	private Double price;

}
