
package org.ketan.business.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ItemDTO {
	
	private int itemId;
	
	private String itemName;

	private Date manufacturedDate;

	private Date expiryDate;	
	
}
