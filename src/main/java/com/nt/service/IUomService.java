package com.nt.service;

import java.util.List;

import com.nt.model.Uom;


public interface IUomService {
	public Integer saveUom(Uom obj);
	public List<Uom>getAllUoms();
	public void deleteUom(Integer id);

}
