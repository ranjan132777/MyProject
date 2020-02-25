package com.nt.service;

import java.util.List;

import com.nt.model.ShipmentType;

public interface IShipmentTypeService {
	public Integer saveShipmentType(ShipmentType obj);
	public List<ShipmentType>getAllShipmentTypes();
	public void deleteShipmentType(Integer id);
	public ShipmentType getOneShipmentType(Integer id);
	public void updateShipmentType(ShipmentType obj);

}
