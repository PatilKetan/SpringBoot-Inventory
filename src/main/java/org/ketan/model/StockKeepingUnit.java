package org.ketan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "stock_keeping_unit")
@Data
public class StockKeepingUnit {
	
	@Id
	@Column(name = "stock_record_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "ref_supplier")
	private Supplier supplier;
	
	@ManyToOne
	@JoinColumn(name = "ref_item")
	private Item item;
	
	@Column(name = "entry_date")
	private Date entryDate;
	
	@Column(name = "price")
	private Double price;

}
