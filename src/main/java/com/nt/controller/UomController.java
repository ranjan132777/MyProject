package com.nt.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Uom;
import com.nt.service.IUomService;

@Controller
@RequestMapping("/uom")
public class UomController {
	private IUomService service;

	@RequestMapping("/register")
	public String ShowRegPage() {
		return "UomRegister";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUom(@ModelAttribute Uom uom, Model model) {

		Integer id =service.saveUom(uom);
		String message = "Uom," + id + "'saved";
		model.addAttribute("message", message);

		return "UomRegister";
	}

	@RequestMapping(value = "/all")
	public String getAllUoms(Model model) {
		List<Uom> list = service.getAllUoms();
		model.addAttribute("list", list);
		return "UomData";

	}

	@RequestMapping("/delete")
	public String deleteUom(@RequestParam("uid") Integer id, Model model) {

		service.deleteUom(id);
		String message = "Uom'" + id + "'Deleted";
		model.addAttribute(message, message);
		// fetch new data
		List<Uom> list = service.getAllUoms();
		model.addAttribute("list", list);
		return "uom";

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
