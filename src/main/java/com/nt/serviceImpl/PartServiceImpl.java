package com.nt.serviceImpl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IPartDao;
import com.nt.model.Part;
import com.nt.service.IPartService;
@Service
public class PartServiceImpl implements IPartService {
	@Autowired
	private IPartDao dao;

	@Transactional

	public Integer savePart(Part obj) {
		return dao.savePart(obj);
	}
	@Transactional(readOnly=true)

	public List<Part> getAllPart() {
		List<Part> list = dao.getAllPart();
		Collections.sort(list, (o1, o2) -> o1.getId() - o2.getId());

		return list;
}
	@Transactional

	public void deletePart(Integer id) {
	dao.deletePart(id);
	}
	@Transactional(readOnly=true)

	public Part getOnePart(Integer id) {
	return	dao.getOnePart(id);
		
	}
	@Transactional
	public void updatePart(Part obj) {
	dao.updatePart(obj);
	}
	@Transactional
	public List<Object[]> getPartModeCount() {
		return dao.getPartModeCount();
	}

}
