package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Uom;
import com.nt.service.IUomService;
import com.nt.validator.UomValidator;

@Controller
@RequestMapping("/uom")
public class UomController {
	private UomValidator validator;

	@Autowired
	private IUomService service;

	@RequestMapping("/register")
	public String ShowRegPage(ModelMap map) {
		map.addAttribute("uom", new Uom());
		return "UomRegister";
	}
	@RequestMapping(value = "/save",method =RequestMethod.POST)
	public String saveUom(@ModelAttribute Uom uom,ModelMap map) 
	{
		
		/*
		 * //must be called before save validator.validate(uom, errors);
		 * 
		 * if(!errors.hasErrors()) { //If no errors are exist Integer
		 * id=service.saveUom(uom);
		 * map.addAttribute("message","Uom created with Id:"+id);
		 * map.addAttribute("uom",new Uom()) ; }else { //If errors exist
		 * map.addAttribute("message","Please Check all Errors!"); }
		 */		
		
		String msg=null;
		Integer ids=service.saveUom(uom);
		msg="Uom Id;-'"+ids+"'Saved Success";
		map.addAttribute("message", msg);
		map.addAttribute("uom", new Uom());
		return "UomRegister";
	
		}

	@RequestMapping(value = "/all")
	public String getAllUoms(Model model) {
		List<Uom> list = service.getAllUoms();
		model.addAttribute("list", list);
		return "UomData";

	}

	@RequestMapping("/delete")
	public String deleteUom(@RequestParam("id") Integer id, Model model) {

		service.deleteUom(id);
		String msg = "Uom'" + id + "'Deleted";
		model.addAttribute("message", msg);
		// fetch new data
		List<Uom> list = service.getAllUoms();
		model.addAttribute("list", list);
		return "UomData";

	}
	
	@RequestMapping("/edit")
	public String ShowEditPage(@RequestParam("sid") Integer id, Model model) {
		Uom st = service.getOneUom(id);
		model.addAttribute("uom", st);
		return "UomEdit";

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
public String updateUom(@ModelAttribute Uom uom, Model model) {
		service.updateUom(uom);
		
		String message = "Uom'" + uom.getUomid() + "' Updated";
		model.addAttribute("message", message);

		List<Uom> list = service.getAllUoms();
		model.addAttribute("list", list);

		return "UomData";

	}

}
