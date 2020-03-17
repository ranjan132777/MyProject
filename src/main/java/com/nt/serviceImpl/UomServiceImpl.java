package com.nt.serviceImpl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IUomDao;
import com.nt.model.Uom;
import com.nt.service.IUomService;
@Service
public class UomServiceImpl implements IUomService {
	
	
	@Autowired
	private IUomDao dao;

	@Transactional

	public Integer saveUom(Uom obj) {

		return dao.saveUom(obj);
	}
	

	@Transactional(readOnly=true)

	public List<Uom> getAllUoms() {

		List<Uom > list = dao.getAllUoms();
		Collections.sort(list, (o1, o2) -> o1.getUomid() - o2.getUomid());

		return list;
	}

	@Transactional
	public void deleteUom(Integer id) {
		dao.deleteUom(id);


	}
	@Transactional(readOnly=true)

	public Uom getOneUom(Integer id) {
		return dao.getOneUom(id);
	}

	@Transactional
	public void updateUom(Uom obj) {
		dao.updateUom(obj);
	
	}

	@Transactional(readOnly=true)

	public List<Object[]> getUomIdAndUomModel() {
		
		return dao.getUomIdAndUomModel();
	}


	}


		


