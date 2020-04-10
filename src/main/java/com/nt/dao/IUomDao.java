package com.nt.dao;

import java.util.List;

import com.nt.model.Uom;



public interface IUomDao {
	public Integer saveUom(Uom obj); 
	public List<Uom>getAllUoms();
	public void deleteUom(Integer id);
	public Uom getOneUom(Integer id);
	public void updateUom(Uom obj);

public List<Object[]> getUomIdAndUomModel();
boolean isUomModelExist(String uomModel);

}
