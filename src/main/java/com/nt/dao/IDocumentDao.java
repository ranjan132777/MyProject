package com.nt.dao;

import java.util.List;

import com.nt.model.Document;

public interface IDocumentDao {
public Integer saveDocument(Document doc);
public List<Object[]> getfileIdAndNames();
public Document getOneDocument(Integer id);
}
