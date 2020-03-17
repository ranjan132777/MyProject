package com.nt.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.dao.IPartDao;
import com.nt.model.Part;
import com.nt.model.ShipmentType;
@Repository
public class PartDaoImpl implements IPartDao {
	@Autowired
	private HibernateTemplate ht;


	public Integer savePart(Part obj) {
		return (Integer) ht.save(obj);
	}

	public List<Part> getAllPart() {
		return ht.loadAll(Part.class);
	}

	public void  deletePart(Integer id) {
		ht.delete(new Part ());
	}

	public Part getOnePart(Integer id) {
		return ht.get(Part.class ,id);
	}

	public void updatePart(Part obj) {
	ht.update(obj);
	}

	public List<Object[]> getPartModeCount() {
		String hql="  select shipMode,count(shipMode)" + "from com.nt.model.Part " + " group by shipMode ";

		
		return (List<Object[]>) ht.find(hql);

		}

}
