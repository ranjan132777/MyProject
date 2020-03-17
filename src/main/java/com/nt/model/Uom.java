package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "uomtable")
public class Uom {

	@Id
	@GeneratedValue
	@Column(name = "uomid")
	private Integer uomid;
	@Column(name = "utype")
    private String uomType;
	@Column(name = "umodel")

	private String uomModel;
	@Column(name = "uDesc")

	private String uomDesc;
	
	@ManyToOne
	@JoinColumn(name="uomidFk")
	@Column(name = "uomob")

	private Uom uomOb;
	
	
	
	

	public Uom(Integer id) {
		super();
	}

	public Integer getUomid() {
		return uomid;
	}

	public void setUomid(Integer uomid) {
		this.uomid = uomid;
	}

	public String getUomType() {
		return uomType;
	}

	public void setUomType(String uomType) {
		this.uomType = uomType;
	}

	public String getUomModel() {
		return uomModel;
	}

	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}

	public String getUomDesc() {
		return uomDesc;
	}

	public void setUomDesc(String uomDesc) {
		this.uomDesc = uomDesc;
	}
	public Uom getUomOb() {
		return uomOb;
	}

	public void setUomOb(Uom uomOb) {
		this.uomOb = uomOb;
	}

	@Override
	public String toString() {
		return "Uom [uomid=" + uomid + ", uomType=" + uomType + ", uomModel=" + uomModel + ", uomDesc=" + uomDesc
				+ ", uomOb=" + uomOb + "]";
	}

	
}
