
package org.ketan.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.ketan.helper.Address;

import lombok.Data;

@Entity
@Table(name = "supplier")
@Data
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "supplier_id")
	private int supplierId;
	
	@Column(name = "supplier_name")
	private String suppliername;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride (name = "city", column = @Column(name = "supplier_city")),
		@AttributeOverride (name = "pincode", column = @Column(name = "supplier_pincode"))
	})
	private Address supplieraddress;
	
	@OneToMany(mappedBy = "supplier")
	private List<StockKeepingUnit> suppliersStocked = new ArrayList<StockKeepingUnit>();

}
