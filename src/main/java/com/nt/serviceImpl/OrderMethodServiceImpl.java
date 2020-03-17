package com.nt.serviceImpl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IOrderMethodDao;
import com.nt.model.OrderMethod;
import com.nt.service.IOrderMethodService;
@Service
public class OrderMethodServiceImpl implements IOrderMethodService {
@Autowired
private IOrderMethodDao dao;
@Transactional

	public Integer saveOrderMethod(OrderMethod obj) {
		return dao.saveOrderMethod(obj);
	}
	@Transactional(readOnly=true)

	public List<OrderMethod> getAllOrderMethods() {
		
		List<OrderMethod> list = dao.getAllOrderMethods();
		Collections.sort(list, (o1, o2) ->o1.getOrdermethodId()-o2.getOrdermethodId());


		return list;
	}
@Transactional
	public void deleteOrderMethod(Integer id) {
dao.deleteOrderMethod(id);
	}
@Transactional(readOnly=true)

	public OrderMethod getOneOrderMethod(Integer id) {
		return dao.getOneOrderMethod(id);
	}
@Transactional

	public void updateOrderMethod(OrderMethod obj) {
dao.updateOrderMethod(obj);
	}

@Transactional(readOnly=true)

public List<Object[]> getOrderIdAndCode(String mode) {
	return dao.getOrderIdAndCode(mode);
}
}


