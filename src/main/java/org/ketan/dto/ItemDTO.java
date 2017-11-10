
package org.ketan.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ItemDTO {
	
	private int itemId;
	
	private String itemName;

	private Date manufacturedDate;

	private Date expiryDate;

	private List<StockKeepingUnitDTO> keepingUnits = new ArrayList<StockKeepingUnitDTO>();
	
	
}
