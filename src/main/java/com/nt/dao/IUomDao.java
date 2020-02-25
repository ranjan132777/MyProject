package com.nt.dao;

import java.util.List;

import com.nt.model.Uom;



public interface IUomDao {
	public Integer saveUom(Uom obj); 
	public List<Uom>getAllUoms();
	public void deleteUom(Integer id);

}
