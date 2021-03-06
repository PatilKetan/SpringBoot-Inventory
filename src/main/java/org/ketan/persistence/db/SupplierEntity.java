
package org.ketan.persistence.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.ketan.helper.Address;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "supplier")
@Getter
@Setter
public class SupplierEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "supplier_id")
	private int supplierId;
	
	@Column(name = "supplier_name")
	private String supplierName;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride (name = "city", column = @Column(name = "supplier_city")),
		@AttributeOverride (name = "pincode", column = @Column(name = "supplier_pincode"))
	})
	private Address supplierAddress;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "supplier")
	private List<StockKeepingUnitEntity> keepingUnits = new ArrayList<StockKeepingUnitEntity>();

}
