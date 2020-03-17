package com.nt.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IDocumentDao;
import com.nt.model.Document;
import com.nt.service.IDocumentService;
@Service
public class DocumentServiceImpl implements IDocumentService {
	@Autowired
	private IDocumentDao dao;
	
	
	@Transactional
	public Integer saveDocument(Document doc) {
		return dao.saveDocument(doc) ;
	}
	@Transactional(readOnly = true)
	public List<Object[]> getfileIdAndNames() {
		return dao.getfileIdAndNames();
	}
	@Transactional(readOnly = true)
	public Document getOneDocument(Integer id) {
		return dao.getOneDocument(id);
	}

}
