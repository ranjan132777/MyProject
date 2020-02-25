package com.nt.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.dao.IShipmentTypeDao;
import com.nt.model.ShipmentType;

@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {
	@Autowired
	private HibernateTemplate ht;

	public Integer saveShipmentType(ShipmentType obj) {
		return (Integer) ht.save(obj);
	}

	public List<ShipmentType> getAllShipmentTypes() {

		return ht.loadAll(ShipmentType.class);
	}


	public void deleteShipmentType(Integer id) {
		ht.delete(new ShipmentType (id));
		
	}

	public ShipmentType getOneShipmentType(Integer id) {
		return ht.get(ShipmentType.class, id);
	}

	public void updateShipmentType(ShipmentType obj) {
		ht.update(obj);
	}

}
