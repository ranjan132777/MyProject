package com.nt.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.dao.WhUserTypeDao;
import com.nt.model.ShipmentType;
import com.nt.model.WhUserType;

@Repository
public class WhUserTypeDaoImpl implements WhUserTypeDao {
@Autowired
private HibernateTemplate ht;

	public Integer saveWhUserType(WhUserType obj) {
		return (Integer)ht.save(obj);
	}

	public List<WhUserType> getAllWhUserTypes() {
		return ht.loadAll(WhUserType.class);
	}

	public void deleteOneWhUserType(Integer id) {
	ht.delete(new WhUserType(id));
		}

	public void deleteWhUserType(Integer id) {
		ht.delete(new WhUserType(id));		
	}

	public WhUserType getOneWhUserType(Integer id) {
		return ht.get(WhUserType.class, id);
	}

	public void updateWhUserType(WhUserType obj) {
		ht.update(obj);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Object[]> getWhUserTypeIdAndCode(String userType) {
		String hql=" select id,userCode from "+ WhUserType.class.getName()+" where userType=?0 ";
		
		return (List<Object[]>) ht.find(hql, userType);
	}

		}

	
	

