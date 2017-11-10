package org.ketan.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "stock_keeping_unit")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"supplier","item"})
@ToString(exclude = {"supplier","item"})
@JsonIgnoreProperties(value= {"item","supplier"})
public class StockKeepingUnit {

	@Id
	@Column(name = "stock_record_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stockKeepingUnitId;

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
