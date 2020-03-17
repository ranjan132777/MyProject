package com.nt.dao;

import java.util.List;

import com.nt.model.ShipmentType;

public interface IShipmentTypeDao {
Integer saveShipmentType(ShipmentType obj); 
List<ShipmentType>getAllShipmentTypes();
public void deleteShipmentType(Integer id);
public ShipmentType getOneShipmentType(Integer id);
public void updateShipmentType(ShipmentType obj);
public List<Object[]> getShimentModeCount();
}
