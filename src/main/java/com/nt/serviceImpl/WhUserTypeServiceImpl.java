package com.nt.serviceImpl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.WhUserTypeDao;
import com.nt.model.WhUserType;
import com.nt.service.IWhUserTypeService;

public class WhUserTypeServiceImpl implements IWhUserTypeService {
	@Autowired
	private WhUserTypeDao dao;

	@Transactional

	public Integer saveWhUserType(WhUserType obj) {
		return dao.saveWhUserType(obj);
	}

	@Transactional(readOnly = true)
	public List<WhUserType> getAllWhUserType() {
		List<WhUserType> list = dao.getAllWhUserTypes();
		Collections.sort(list, (o1, o2) -> o1.getId() - o2.getId());

		return list;

	}

	@Transactional
	public void deleteOneWhUserType(Integer id) {
		dao.deleteWhUserType(id);
	}

	@Transactional(readOnly = true)

	public List<WhUserType> getAllWhUserTypes() {
		return dao.getAllWhUserTypes();
	}

	@Transactional
	public void deleteWhUserType(Integer id) {
		dao.deleteWhUserType(id);
	}

	@Transactional(readOnly = true)

	public WhUserType getOneWhUserType(Integer id) {
		return dao.getOneWhUserType(id);
	}

	@Transactional
	public void updateWhUserType(WhUserType obj) {
		dao.updateWhUserType(obj);
	}

	@Transactional(readOnly = true)

	public List<Object[]> getWhUserTypeIdAndCode(String userType) {
		return dao.getWhUserTypeIdAndCode(userType);
	}
	@Transactional(readOnly = true)

	public boolean isUserCodeExist(String userCode) {
		return dao.isUserCodeExist(userCode);
	}
	@Transactional(readOnly = true)

	public boolean isUserMailExist(String userMail) {
		return dao.isUserMailExist(userMail);
	}

	@Transactional(readOnly = true)
	public boolean isUserContactExist(String userContact) {
		return dao.isUserContactExist(userContact);
	}

}
