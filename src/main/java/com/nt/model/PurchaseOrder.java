package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="PurchTab")

public class PurchaseOrder {
	@Id
	@GeneratedValue(generator = "pur_gen")
	@GenericGenerator(name="pur_gen",strategy = "increment")
	@Column(name="id")
	private Integer Id;
	
	
	@Column(name ="orcode")
	private Integer orderCode;
	@Column(name ="renum")
	private Integer referenceNumber;
	@Column(name ="qtycheck")
	private String qualityCheck;
	@Column(name ="defstatus")
	private String defaultStatus;
	@Column(name ="desc")
	private String Description;
	
	@ManyToOne
	@JoinColumn(name="oridFk")
	//@Column(name = "scode")
	private PurchaseOrder shipmentCode;

	public PurchaseOrder() {
		super();
	}

	public PurchaseOrder(Integer id) {
		super();
		Id = id;
	}

	public PurchaseOrder(Integer id, Integer orderCode, Integer referenceNumber, String qualityCheck,
			String defaultStatus, String description, PurchaseOrder shipmentCode) {
		super();
		Id = id;
		this.orderCode = orderCode;
		this.referenceNumber = referenceNumber;
		this.qualityCheck = qualityCheck;
		this.defaultStatus = defaultStatus;
		Description = description;
		this.shipmentCode = shipmentCode;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(Integer orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(Integer referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getQualityCheck() {
		return qualityCheck;
	}

	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
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

	public PurchaseOrder getShipmentCode() {
		return shipmentCode;
	}

	public void setShipmentCode(PurchaseOrder shipmentCode) {
		this.shipmentCode = shipmentCode;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [Id=" + Id + ", orderCode=" + orderCode + ", referenceNumber=" + referenceNumber
				+ ", qualityCheck=" + qualityCheck + ", defaultStatus=" + defaultStatus + ", Description=" + Description
				+ ", shipmentCode=" + shipmentCode + "]";
	}

		

	
	

}
	
	
	
	
		
		
