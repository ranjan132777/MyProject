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
		ht.delete(new Uom ());
		

		
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
	public boolean isUomModelExist(String uomModel) {
		boolean flag=false;
		String hql=" select count(uomModel) from in.nit.model.Uom where uomModel=?0 ";
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Long> list=(List<Long>) ht.find(hql,uomModel);
		if(list!=null && !list.isEmpty()) {
			long count=list.get(0);
			if(count==0) flag=false;
			else flag=true;
		}
		return flag;
	}

}
	

