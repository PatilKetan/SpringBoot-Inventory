
package org.ketan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name = "item")
@Data
public class Item {
	
	@Id
	@Column(name = "Item_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	
	@Column(name = "Item_Name")
	private String itemName;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "Manufactured_Date")
	private Date manufacturedDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "Expiry_Date")
	private Date expiryDate;
	
	@OneToMany(mappedBy = "item")
	private List<StockKeepingUnit> items = new ArrayList<StockKeepingUnit>();
	
	
}
