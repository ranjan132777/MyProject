package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="parttable")
public class Part {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer Id;
	@Column(name="pcode")
	
	private String partCode;
	@Column(name="plen")
	
	private Double partLen;
	@Column(name="pwid")
	
	private Double partWid;
	@Column(name="pht")
	
	private Double partHgt;
	@Column(name="pcost")
	
	private Double basecost;
	@Column(name="pcurr")
	
	private String BaseCurrency;
	@Column(name="pnote")
	
	private String Note;
	
	  @ManyToOne
	  
	  @JoinColumn(name="uomidFk")
	  
	  @Column(name="uomob") private Uom uomOb;
	 
	
	@ManyToOne
	@JoinColumn(name="orderSaleIdFk")
	private OrderMethod omsaleOb;
	@ManyToOne
	@JoinColumn(name="orderPurchaseIdFk")
	private OrderMethod omPurchaseOb;
	
	
	
	public Part() {
		super();
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getPartCode() {
		return partCode;
	}
	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}
	public Double getPartLen() {
		return partLen;
	}
	public void setPartLen(Double partLen) {
		this.partLen = partLen;
	}
	public Double getPartWid() {
		return partWid;
	}
	public void setPartWid(Double partWid) {
		this.partWid = partWid;
	}
	public Double getPartHgt() {
		return partHgt;
	}
	public void setPartHgt(Double partHgt) {
		this.partHgt = partHgt;
	}
	public Double getBasecost() {
		return basecost;
	}
	public void setBasecost(Double basecost) {
		this.basecost = basecost;
	}
	public String getBaseCurrency() {
		return BaseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		BaseCurrency = baseCurrency;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public Uom getUobOb() {
		return uomOb;
	}
	public void setUobOb(Uom uobOb) {
		this.uomOb = uobOb;
	}
	public OrderMethod getOmsaleOb() {
		return omsaleOb;
	}
	public void setOmsaleOb(OrderMethod omsaleOb) {
		this.omsaleOb = omsaleOb;
	}
	
	public OrderMethod getOmPurchaseOb() {
		return omPurchaseOb;
	}
	public void setOmPurchaseOb(OrderMethod omPurchaseOb) {
		this.omPurchaseOb = omPurchaseOb;
	}
	@Override
	public String toString() {
		return "Part [Id=" + Id + ", partCode=" + partCode + ", partLen=" + partLen + ", partWid=" + partWid
				+ ", partHgt=" + partHgt + ", basecost=" + basecost + ", BaseCurrency=" + BaseCurrency + ", Note="
				+ Note + ", uomOb=" + uomOb + ", omsaleOb=" + omsaleOb + ", omPurchaseOb=" + omPurchaseOb + "]";
	}
	
	
	
	
}
