package com.nt.dao;

import java.util.List;

import com.nt.model.WhUserType;



public interface WhUserTypeDao {
	Integer saveWhUserType(WhUserType obj); 
	List<WhUserType>getAllWhUserTypes();
	public void deleteWhUserType(Integer id);
	public WhUserType getOneWhUserType(Integer id);
	public void updateWhUserType(WhUserType obj);
	public List<Object[]> getWhUserTypeIdAndCode(String userType); 

}
