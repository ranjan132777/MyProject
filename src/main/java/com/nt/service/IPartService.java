package com.nt.service;

import java.util.List;

import com.nt.model.Part;

public interface IPartService {
	public Integer savePart(Part obj); 
	public List<Part>getAllPart();
	public void deletePart(Integer id);
	public Part getOnePart(Integer id);
	public void updatePart(Part obj);
	public List<Object[]> getPartModeCount();

}
