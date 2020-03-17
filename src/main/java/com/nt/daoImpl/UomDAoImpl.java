package com.nt.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.dao.IUomDao;
import com.nt.model.ShipmentType;
import com.nt.model.Uom;
@Repository
public class UomDAoImpl implements IUomDao {
	@Autowired
	private HibernateTemplate ht;

	public Integer saveUom(Uom obj) {
		return (Integer) ht.save(obj);
	}

	public List<Uom> getAllUoms() {

		return ht.loadAll(Uom.class);
	}


	public void deleteUom(Integer id) {
		ht.delete(new Uom (id));
		

		
		}
	public Uom getOneUom(Integer id) {
		return ht.get(Uom.class, id);
	}

	public void updateUom(Uom obj) {
		ht.update(obj);

	}
	public List<Object[]> getUomIdAndUomModel() {
		String hql="select id,UomModel from com.nt.nit.Model.Uom";
		List<Object[]> list=(List<Object[]>)ht.find(hql);
		return list;
	}
	}

		

	

