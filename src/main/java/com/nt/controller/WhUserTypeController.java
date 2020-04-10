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

import com.nt.model.WhUserType;
import com.nt.service.IWhUserTypeService;
import com.nt.validator.WhUserTypeValidator;


@Controller
@RequestMapping("/whu")
public class WhUserTypeController {
	
	@Autowired
	private WhUserTypeValidator validator;//HAS-A
	private IWhUserTypeService service;
	@RequestMapping("/register")
	public String ShowRegPage() {
		return "WhUserTypeRegister";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveWhUserType(@ModelAttribute WhUserType whUserType, Errors errors, ModelMap map) {
		
		// call Validator
          validator.validate(whUserType, errors);
		
		if(!errors.hasErrors()) { //has no errors
			Integer id=service.saveWhUserType(whUserType);
			map.addAttribute("message","WhUserType created with Id:"+id);
			map.addAttribute("whUserType",new WhUserType()) ;
		}else { //errors are added by validator
			map.addAttribute("message","Please check All Errors");
		}
		return "WhUserTypeRegister";
	
		

//		Integer id =service.saveWhUserType(whusertype);
//		String message = "WhUserType," + id + "'saved";
//		modelmap.addAttribute("message", message);
//
//		return "WhUserTypeRegister";
	}

	@RequestMapping(value = "/all")
	public String getAllWhUserTypes(Model model) {
		List<WhUserType> list = service.getAllWhUserTypes();
		model.addAttribute("list", list);
		return "WhUserTypeData";

	}

	@RequestMapping("/delete")
	public String deleteUom(@RequestParam("uid") Integer id, Model model) {

		service.getOneWhUserType(id);
		String message = "WhUserType'" + id + "'Deleted";
		model.addAttribute(message, message);
		// fetch new data
		List<WhUserType> list = service.getAllWhUserTypes();
		model.addAttribute("lis", list);
		return "whusertype";

}
}