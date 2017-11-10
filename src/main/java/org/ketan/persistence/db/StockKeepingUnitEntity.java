package org.ketan.persistence.db;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "stock_keeping_unit")
@Getter
@Setter
public class StockKeepingUnitEntity {

	@Id
	@Column(name = "stock_record_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stockKeepingUnitId;

	@ManyToOne
	@JoinColumn(name = "ref_supplier")
	private SupplierEntity supplier;

	@ManyToOne
	@JoinColumn(name = "ref_item")
	private ItemEntity item;

	@Column(name = "entry_date")
	private Date entryDate;

	@Column(name = "price")
	private Double price;

}
