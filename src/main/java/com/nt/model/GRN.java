package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grntable")
public class GRN {
	@Id
	@GeneratedValue
	@Column(name="gcode")
	
	private Integer grnCode;
	@Column(name="gtype")
	
	private String grnType;
	@Column(name="orcode")
	
	private Integer orderCode;
	@Column(name="desc")
	
	private String Description;

public GRN() {
		super();
	}

public Integer getGrnCode() {
	return grnCode;
}

public void setGrnCode(Integer grnCode) {
	this.grnCode = grnCode;
}

public String getGrnType() {
	return grnType;
}

public void setGrnType(String grnType) {
	this.grnType = grnType;
}

public Integer getOrderCode() {
	return orderCode;
}

public void setOrderCode(Integer orderCode) {
	this.orderCode = orderCode;
}

public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}

@Override
public String toString() {
	return "GRN [grnCode=" + grnCode + ", grnType=" + grnType + ", orderCode=" + orderCode + ", Description="
			+ Description + "]";
}

}
