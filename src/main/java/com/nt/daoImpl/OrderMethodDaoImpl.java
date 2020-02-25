package com.nt.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.dao.IOrderMethodDao;
import com.nt.model.OrderMethod;


@Repository
public class OrderMethodDaoImpl implements IOrderMethodDao {
	@Autowired
	private HibernateTemplate ht;

	public Integer saveOrderMethod(OrderMethod obj) {
	
		return (Integer) ht.save(obj);
	}

	public List<OrderMethod> getAllOrderMethods() {

		return ht.loadAll(OrderMethod.class);
	}


	public void deleteOrderMethod(Integer id) {
		ht.delete(new OrderMethod ());
		
	}

	public OrderMethod getOneOrderMethod(Integer id) {
		return ht.get(OrderMethod.class, id);
	}

	public void updateOrderMethod(OrderMethod obj) {
	ht.update(obj);	
	}
	}

		


