package com.nt.dao;

import java.util.List;

import com.nt.model.OrderMethod;
public interface IOrderMethodDao {
public Integer saveOrderMethod(OrderMethod obj); 
 public List<OrderMethod>getAllOrderMethods();
public void deleteOrderMethod(Integer id);
public OrderMethod getOneOrderMethod(Integer id);
public void updateOrderMethod(OrderMethod obj);
public List<Object[]> getOrderIdAndCode(String mode);


}
