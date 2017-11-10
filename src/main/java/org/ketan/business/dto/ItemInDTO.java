
package org.ketan.business.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemInDTO {
	
	private String itemName;
	
	private Date manufacturedDate;
	
	private Date expiryDate;
	
}
