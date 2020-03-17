package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Part;
import com.nt.model.PurchaseOrder;
import com.nt.service.IPartService;
import com.nt.service.IPurchaseOrderService;
import com.nt.service.IShipmentTypeService;
import com.nt.service.IWhUserTypeService;
import com.nt.util.CommonUtil;

@Controller
@RequestMapping("/po")

public class PurchaseOrderController {
	@Autowired
	private IPurchaseOrderService service;
	
@Autowired
private IShipmentTypeService shipmentservice;
@Autowired
private IWhUserTypeService WhUserTypeService;

@RequestMapping("/register")
public String ShowRegPage(Part part,Model model) {
	model.addAttribute("Part",new Part());

	return "PurchaseOrderRegister";

}
//it will show dropdowns at UI(Reg/edit )
private void CommonUi(Model model) {
List<Object[]> shipList=shipmentservice.getWhUserTypeIdAndCode("vendor");
Map<Integer,String> whvenmap=CommonUtil.convert(whvenmap);
model.addAttribute("WhVenMap" ,whvenmap);
}


@RequestMapping(value = "/save", method = RequestMethod.POST)

public String savePurchaseOrder(@ModelAttribute PurchaseOrder purchaseorder, Model model) {

	Integer result = service.savePurchaseOrder(purchaseorder);

	String message = "PurchaseOrder'" + result + "' saved";

	model.addAttribute("PurchaseOrder", new PurchaseOrder());
	//model.addAttribute("message", message);

	return "PurchaseOrderRegister";
}


@RequestMapping(value = "/all")
public String getAllPurchaseOrder(Model model) {
	List<PurchaseOrder> list = service.getAllPurchaseOrder();
	model.addAttribute("list", list);
	return "PurchaseOrderData";

}

@RequestMapping("/delete")
public String deletePurchaseOrder(@RequestParam("id") Integer id, Model model) {

	service.deletePurchaseOrder(id);
	String message = "PurchaseOrder'" + id + "'Deleted";
	model.addAttribute(message, message);
	// fetch new data
	List<PurchaseOrder> list = service.getAllPurchaseOrder();
	model.addAttribute("lis", list);
	return "PurchaseOrdertData";

}

@RequestMapping("/edit")
public String ShowEditPage(@RequestParam("id") Integer id, Model model) {
	PurchaseOrder st = service.getOnePurchaseOrder(id);
	model.addAttribute("purchaseorder", st);
	return "PurchaseOrderEdit";

}

@RequestMapping(value = "/update", method = RequestMethod.POST)
public String updatePurchaseOrder(@ModelAttribute PurchaseOrder purchaseorder, Model model) {
	service.updatePurchaseOrder(purchaseorder);
	
	String message = "PurchaseOrder'" + purchaseorder.getId() + "' Updated";
	model.addAttribute("message", message);

	List<PurchaseOrder> list = service.getAllPurchaseOrder();
	model.addAttribute("list", list);

	return "PurchaseOrderData";




}
}