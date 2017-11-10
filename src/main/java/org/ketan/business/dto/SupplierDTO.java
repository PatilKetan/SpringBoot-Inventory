
package org.ketan.business.dto;


import org.ketan.helper.Address;

import lombok.Data;

@Data
public class SupplierDTO {
	
	private int supplierId;
	
	private String supplierName;

	private Address supplierAddress;
	

}
