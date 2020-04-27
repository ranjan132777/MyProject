package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "uomtable")
public class Uom {

	@Id
	@GeneratedValue(generator = "uom_gen")
	@GenericGenerator(name="uom_gen",strategy = "increment")
	@Column(name = "uid")
	private Integer uomid;
	@Column(name = "utype")
    private String uomType;
	@Column(name = "umodel")

	private String uomModel;
	@Column(name = "uDesc")

	private String uomDesc;
	
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="uomidFk")
	 * 
	 * @Column(name = "uomob")
	 */
	//private Uom uomOb;
	
	public Uom() {
		super();
	}

	public Uom(Integer uomid) {
		super();
		this.uomid = uomid;
	}

	public Uom(Integer uomid, String uomType, String uomModel, String uomDesc) {
		super();
		this.uomid = uomid;
		this.uomType = uomType;
		this.uomModel = uomModel;
		this.uomDesc = uomDesc;
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

	@Override
	public String toString() {
		return "Uom [uomid=" + uomid + ", uomType=" + uomType + ", uomModel=" + uomModel + ", uomDesc=" + uomDesc + "]";
	}
	
	
	
}
