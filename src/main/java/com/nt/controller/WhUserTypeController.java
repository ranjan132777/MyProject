package com.nt.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.WhUserType;
import com.nt.service.IWhUserTypeService;


@Controller
@RequestMapping("/whu")
public class WhUserTypeController {
	private IWhUserTypeService service;

	@RequestMapping("/register")
	public String ShowRegPage() {
		return "WhUserTypeRegister";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUom(@ModelAttribute WhUserType  whusertype, Model model) {

		Integer id =service.saveWhUserType(whusertype);
		String message = "WhUserType," + id + "'saved";
		model.addAttribute("message", message);

		return "WhUserTypeRegister";
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