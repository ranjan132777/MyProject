package com.nt.serviceImpl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IPurchaseOrderDao;
import com.nt.model.Part;
import com.nt.model.PurchaseOrder;
import com.nt.service.IPurchaseOrderService;

@Service
public class PurchaseOrderServiceImpl implements IPurchaseOrderService {
	@Autowired
	private IPurchaseOrderDao dao;

	@Transactional

	public Integer savePurchaseOrder(PurchaseOrder obj) {
		return dao.savePurchaseOrder(obj);
	}

	@Transactional(readOnly = true)

	public List<PurchaseOrder> getAllPurchaseOrder() {

		List<PurchaseOrder> list = dao.getAllPurchaseOrder();
		Collections.sort(list, (o1, o2) -> o1.getId() - o2.getId());

		return list;
	}

	@Transactional

	public void deletePurchaseOrder(Integer id) {
		dao.deletePurchaseOrder(id);
	}

	@Transactional(readOnly = true)

	public PurchaseOrder getOnePurchaseOrder(Integer id) {
		return dao.getOnePurchaseOrder(id);
	}

	@Transactional
	public void updatePurchaseOrder(PurchaseOrder obj) {
		dao.updatePurchaseOrder(obj);
	}

	public List<Object[]> getwhUserTypeIdAndCode(String userType) {
		return dao.getwhUserTypeIdAndCode(userType);
	}

}
