package com.nt.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.dao.IPurchaseOrderDao;
import com.nt.model.PurchaseOrder;
import com.nt.model.WhUserType;
@Repository
public class PurchaseOrderDaoImpl implements IPurchaseOrderDao {
@Autowired
private HibernateTemplate ht;

	public Integer savePurchaseOrder(PurchaseOrder obj) {
		return (Integer) ht.save(obj);
	}

	public List<PurchaseOrder> getAllPurchaseOrder() {
		return ht.loadAll(PurchaseOrder.class);
	}

	public void deletePurchaseOrder(Integer id) {
	ht.delete(new PurchaseOrder());
	}

	public PurchaseOrder getOnePurchaseOrder(Integer id) {
		return ht.get(PurchaseOrder.class, id);
	}

	public void updatePurchaseOrder(PurchaseOrder obj) {
	ht.update(obj);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Object[]> getwhUserTypeIdAndCode(String userType) {
		String hql=" select id,userCode from " + WhUserType.class.getName()+ " where userType=?0";
		
		
		
		
		
		return (List<Object[]>) ht.find(hql, userType);
	}

}
