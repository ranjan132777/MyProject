package com.nt.serviceImpl;

import java.util.Collections;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IShipmentTypeDao;
import com.nt.model.ShipmentType;
import com.nt.service.IShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {

	@Autowired
	private IShipmentTypeDao dao;

	@Transactional
	 public Integer saveShipmentType(ShipmentType obj) {

		return dao.saveShipmentType(obj);
	}
	

	@Transactional(readOnly=true)

	public List<ShipmentType> getAllShipmentTypes() {

		List<ShipmentType> list = dao.getAllShipmentTypes();
		Collections.sort(list, (o1, o2) -> o1.getShipId() - o2.getShipId());

		return list;
	}

	@Transactional
	public void deleteShipmentType(Integer id) {
		dao.deleteShipmentType(id);
		}


	@Transactional(readOnly=true)

	public ShipmentType getOneShipmentType(Integer id) {
		return dao.getOneShipmentType(id);
	}
	@Transactional

	public void updateShipmentType(ShipmentType obj) {
		dao.updateShipmentType(obj);
	}

}
