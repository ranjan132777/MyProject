package com.nt.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "omtab")
public class OrderMethod {
	@Id
	@GeneratedValue(generator = "omidgen")
	@GenericGenerator(name = "omidgen", strategy = "increment")
	@Column(name ="omid")

	private Integer ordermethodId;

	@Column(name ="ommode")

	private String orderMode;

	@Column(name ="omcode")

	private String ordeCode;

	@Column(name ="omtype")

	private String orderType;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "omacpttab", joinColumns = @JoinColumn(name = "omid"))
	@OrderColumn(name = "pos")

	@Column(name = "omacpt")

	private List<String> orderAccept;
	@Column(name = "omdesc")

	private String orderDesc;

	public OrderMethod() {
		super();
	}

	public Integer getOrdermethodId() {
		return ordermethodId;
	}

	public void setOrdermethodId(Integer ordermethodId) {
		this.ordermethodId = ordermethodId;
	}

	public String getOrderMode() {
		return orderMode;
	}

	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}

	public String getOrdeCode() {
		return ordeCode;
	}

	public void setOrdeCode(String ordeCode) {
		this.ordeCode = ordeCode;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public List<String> getOrderAccept() {
		return orderAccept;
	}

	public void setOrderAccept(List<String> orderAccept) {
		this.orderAccept = orderAccept;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	@Override
	public String toString() {
		return "OrderMethod [ordermethodId=" + ordermethodId + ", orderMode=" + orderMode + ", ordeCode=" + ordeCode
				+ ", orderType=" + orderType + ", orderAccept=" + orderAccept + ", orderDesc=" + orderDesc + "]";
	}
}
