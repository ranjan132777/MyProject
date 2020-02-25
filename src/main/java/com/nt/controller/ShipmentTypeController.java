package com.nt.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nt.model.ShipmentType;
import com.nt.service.IShipmentTypeService;
import com.nt.view.ShipmentTypeExcelView;
import com.nt.view.ShipmentTypePdfView;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;

	@RequestMapping("/register")
	public String ShowRegPage(ShipmentType shipmentType) {
		//model.addAttribute("ShipmentType",new ShipmentType());

		return "ShipmentTypeRegister";

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)

	public String saveShipmentType(@ModelAttribute ShipmentType shipmentType, Model model) {

		Integer result = service.saveShipmentType(shipmentType);

		String message = "ShipmentType'" + result + "' saved";

		model.addAttribute("ShipmentType", new ShipmentType());
		model.addAttribute("message", message);

		return "ShipmentTypeRegister";
	}

	@RequestMapping(value = "/all")
	public String getAllShipmentTypes(Model model) {
		List<ShipmentType> list = service.getAllShipmentTypes();
		model.addAttribute("list", list);
		return "ShipmentTypeData";

	}

	@RequestMapping("/delete")
	public String deleteShipmentType(@RequestParam("sid") Integer id, Model model) {

		service.deleteShipmentType(id);
		String message = "Shipment'" + id + "'Deleted";
		model.addAttribute(message, message);
		// fetch new data
		List<ShipmentType> list = service.getAllShipmentTypes();
		model.addAttribute("lis", list);
		return "ShipmentTypeData";

	}

	@RequestMapping("/edit")
	public String ShowEditPage(@RequestParam("sid") Integer id, Model model) {
		ShipmentType st = service.getOneShipmentType(id);
		model.addAttribute("shipmentType", st);
		return "ShipmentTypeEdit";

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
public String updateShipmentType(@ModelAttribute ShipmentType shipmentType, Model model) {
		service.updateShipmentType(shipmentType);
		
		String message = "ShipmentType'" + shipmentType.getShipId() + "' Updated";
		model.addAttribute("message", message);

		List<ShipmentType> list = service.getAllShipmentTypes();
		model.addAttribute("list", list);

		return "ShipmentTypeData";

	}

	@RequestMapping("/view")
	public String ShowOneShipment(@RequestParam("sid") Integer id, Model model) {
		ShipmentType st = service.getOneShipmentType(id);
		model.addAttribute("ob", st);
		return "ShipmentTypeView";

	}

	@RequestMapping("/excel")
	public ModelAndView showExcel(@RequestParam(value="id",required=false)Integer id) {
		ModelAndView m = new ModelAndView();
		m.setView(new ShipmentTypeExcelView());
		if(id==null) {
			//exports all rows
		
		
		List<ShipmentType> list = service.getAllShipmentTypes();
		m.addObject("list", list);
	}
		else {
			//exports one row by id
			ShipmentType st=service.getOneShipmentType(id);
			m.addObject("list",Arrays.asList(st));
		}
		
			
		return m;

	}
	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam(value="id",required=false)Integer id) {
		ModelAndView m = new ModelAndView();
		m.setView(new ShipmentTypePdfView());
		if(id==null) { //Show all
			
		
		// fetching data from db
		List<ShipmentType> list = service.getAllShipmentTypes();
		//send data to pdf file
		
		m.addObject("list", list);
		}
		else { //show one
			ShipmentType st=service.getOneShipmentType(id);
				
			m.addObject("list",Arrays.asList(st));
		}
		return m;
		
}}
