package com.nt.service;

import java.util.List;

import com.nt.model.PurchaseOrder;

public interface IPurchaseOrderService {
	public Integer savePurchaseOrder(PurchaseOrder obj); 
	public List<PurchaseOrder>getAllPurchaseOrder();
	public void deletePurchaseOrder(Integer id);
	public PurchaseOrder getOnePurchaseOrder(Integer id);
	public void updatePurchaseOrder(PurchaseOrder obj);
	public List<Object[]> getwhUserTypeIdAndCode(String userType);


}
