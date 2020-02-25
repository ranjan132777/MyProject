package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.OrderMethod;
import com.nt.service.IOrderMethodService;


@Controller
@RequestMapping("/order")
public class OrderMethodController {
	@Autowired
	private IOrderMethodService service;

	@RequestMapping("/register")
	public String ShowRegPage(OrderMethod ordermethod) {
		//Model.addAttribute("ShipmentType",new ShipmentType());

		return "OrderMethodRegister";

	}

	@RequestMapping(value = "save", method = RequestMethod.POST)

	public String saveOrderMethod(@ModelAttribute OrderMethod ordermethod, Model model) {

		Integer result = service.saveOrderMethod(ordermethod);

		String message = "OrderMethod'" + result + "' saved";

		//model.addAttribute("OrderMethod",new OrderMethod (result));
		model.addAttribute("message", message);

		return "OrderMethodRegister";
	}

	@RequestMapping(value = "/all")
	public String getAllOrderMethods(Model model) {
		List<OrderMethod> list = service.getAllOrderMethods();
		model.addAttribute("list", list);
		return "OrderMethodData";

	}

	@RequestMapping("/delete")
	public String deleteOrderMethod(@RequestParam("sid") Integer id, Model model) {

		service.deleteOrderMethod(id);
		String message = "OrderMethod'" + id + "'Deleted";
		model.addAttribute(message, message);
		// fetch new data
		List<OrderMethod> list = service.getAllOrderMethods();
		model.addAttribute("lis", list);
		return "OrderMethodRegister";

	}

	@RequestMapping("/edit")
	public String ShowEditPage(@RequestParam("sid") Integer id, Model model) {
		OrderMethod om = service.getOneOrderMethod(id);
		model.addAttribute("OrderMethod", om);
		return "OrderMethodEdit";

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)

	public String updateOrderMethod(@ModelAttribute OrderMethod ordermethod, Model model) {
		service.updateOrderMethod(ordermethod);
		String message = "OrderMethod'" + ordermethod + "' Updated";
		model.addAttribute("message", message);

		List<OrderMethod> list = service.getAllOrderMethods();
		model.addAttribute("list", list);

		return "OrderMethodData";

	}

	@RequestMapping("/view")
	public String ShowOneOrderMethod(@RequestParam("omid") Integer id, Model model) {
		OrderMethod om = service.getOneOrderMethod(id);
		model.addAttribute("obj", om);
		return "OrderMethodView";

	}
}