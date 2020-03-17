package com.nt.service;

import java.util.List;

import com.nt.model.Document;

public interface IDocumentService {
	public Integer saveDocument(Document doc);
	public List<Object[]> getfileIdAndNames() ;
	public Document getOneDocument(Integer id);
		
}
