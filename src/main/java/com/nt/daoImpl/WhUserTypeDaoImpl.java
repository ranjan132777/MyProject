package com.nt.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.dao.WhUserTypeDao;
import com.nt.model.WhUserType;

@Repository
public class WhUserTypeDaoImpl implements WhUserTypeDao {
	@Autowired
	private HibernateTemplate ht;

	public Integer saveWhUserType(WhUserType obj) {
		return (Integer) ht.save(obj);
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
		String hql = " select id,userCode from " + WhUserType.class.getName() + " where userType=?0 ";

		return (List<Object[]>) ht.find(hql, userType);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public boolean isUserCodeExist(String userCode) {
		boolean flag = false;

		// SQL: select count(usrcode) from whusertypetab where usrcode=?;
		String hql = "SELECT COUNT(userCode) FROM in.nit.model.WhUserType WHERE userCode=?0";
		List<Long> list = (List<Long>) ht.find(hql, userCode);
		if (list != null && !list.isEmpty()) {
			long count = list.get(0);
			if (count == 0)
				flag = false; // data not exist
			else
				flag = true; // data exist
		}

		return flag;

	}

	@Override
	public boolean isUserMailExist(String userMail) {
		boolean flag = false;
		String hql = "SELECT COUNT(userMail) FROM in.nit.model.WhUserType WHERE userMail=?0";
		@SuppressWarnings({ "deprecation", "unchecked" })
		List<Long> list = (List<Long>) ht.find(hql, userMail);
		if (list != null && !list.isEmpty()) {
			long count = list.get(0);
			if (count == 0)
				flag = false; // not exist
			else
				flag = true;
		}
		return flag;

	}

	@Override
	public boolean isUserContactExist(String userContact) {
		boolean flag = false;
		String hql = "SELECT COUNT(userContact) FROM in.nit.model.WhUserType " + " WHERE userContact like '%"
				+ userContact + "' " // without +91
				+ " or userContact like '" + userContact + "'"; // with +91
		@SuppressWarnings({ "deprecation", "unchecked" })
		List<Long> list = (List<Long>) ht.find(hql);
		if (list != null && !list.isEmpty()) {
			long count = list.get(0);
			if (count == 0)
				flag = false; // not exist
			else
				flag = true;
		}
		return flag;

	}

}
