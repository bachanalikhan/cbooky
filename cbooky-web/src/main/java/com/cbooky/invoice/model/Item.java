package com.cbooky.invoice.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Invoice item
 * 
 */
@Entity
public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1355056973107178073L;
	@EmbeddedId
	private ItemPk itemPk;
	private String particular;
	private String hsnCode;
	private String unit;
	private Integer quantity;
	private Double price;
	private Float taxRate;
	private Float discount;
	private Double taxAmount;
	private Double total;

	public Item() {
	}

	/**
	 * 
	 * @param itemPk
	 * @param particular
	 * @param hsnCode
	 * @param unit
	 * @param quantity
	 * @param price
	 * @param taxRate
	 * @param discount
	 * @param taxAmount
	 * @param total
	 */
	public Item(ItemPk itemPk, String particular, String hsnCode, String unit, Integer quantity, Double price,
			Float taxRate, Float discount, Double taxAmount, Double total) {
		super();
		this.itemPk = itemPk;
		this.particular = particular;
		this.hsnCode = hsnCode;
		this.unit = unit;
		this.quantity = quantity;
		this.price = price;
		this.taxRate = taxRate;
		this.discount = discount;
		this.taxAmount = taxAmount;
		this.total = total;
	}


	public ItemPk getItemPk() {
		return itemPk;
	}

	public void setItemPk(ItemPk itemPk) {
		this.itemPk = itemPk;
	}

	public String getParticular() {
		return particular;
	}

	public void setParticular(String particular) {
		this.particular = particular;
	}

	public String getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Float getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Float taxRate) {
		this.taxRate = taxRate;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
