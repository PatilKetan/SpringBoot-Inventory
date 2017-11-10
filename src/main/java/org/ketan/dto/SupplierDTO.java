
package org.ketan.dto;


import java.util.ArrayList;
import java.util.List;

import org.ketan.helper.Address;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class SupplierDTO {
	
	private int supplierId;
	
	private String supplierName;

	private Address supplierAddress;
	
	private List<StockKeepingUnitDTO> keepingUnits = new ArrayList<StockKeepingUnitDTO>();

}
