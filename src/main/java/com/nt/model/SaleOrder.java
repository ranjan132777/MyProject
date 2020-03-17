package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="saletable")
public class SaleOrder {
	@Id
	@GeneratedValue
	@Column(name="orcode")
	private Integer orderCode;
	@Column(name="shipcode")
	
	private Integer shipmentCode;
	@Column(name="customer")
	
	private String Customer;
	@Column(name="refnum")
	
	private Integer refNumber;
	@Column(name="stmode")
	
	private String stockMode;
	@Column(name="stsource")
	
	private String stockSource;
	@Column(name="defstatus")
	
	private String defaultStatus;
	@Column(name="desc")
	
	private String Description;
	public SaleOrder() {
		super();
	}
	public Integer getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(Integer orderCode) {
		this.orderCode = orderCode;
	}
	public Integer getShipmentCode() {
		return shipmentCode;
	}
	public void setShipmentCode(Integer shipmentCode) {
		this.shipmentCode = shipmentCode;
	}
	public String getCustomer() {
		return Customer;
	}
	public void setCustomer(String customer) {
		Customer = customer;
	}
	public Integer getRefNumber() {
		return refNumber;
	}
	public void setRefNumber(Integer refNumber) {
		this.refNumber = refNumber;
	}
	public String getStockMode() {
		return stockMode;
	}
	public void setStockMode(String stockMode) {
		this.stockMode = stockMode;
	}
	public String getStockSource() {
		return stockSource;
	}
	public void setStockSource(String stockSource) {
		this.stockSource = stockSource;
	}
	public String getDefaultStatus() {
		return defaultStatus;
	}
	public void setDefaultStatus(String defaultStatus) {
		this.defaultStatus = defaultStatus;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "SaleOrder [orderCode=" + orderCode + ", shipmentCode=" + shipmentCode + ", Customer=" + Customer
				+ ", refNumber=" + refNumber + ", stockMode=" + stockMode + ", stockSource=" + stockSource
				+ ", defaultStatus=" + defaultStatus + ", Description=" + Description + "]";
	}
	}
