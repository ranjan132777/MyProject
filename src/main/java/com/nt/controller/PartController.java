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
import com.nt.model.Uom;
import com.nt.service.IOrderMethodService;
import com.nt.service.IPartService;
import com.nt.service.IUomService;
import com.nt.util.CommonUtil;

@Controller
@RequestMapping("/part")

public class PartController {
	@Autowired
	private IPartService service;
	
	@Autowired
	private IUomService uomService;
	@Autowired
	private IOrderMethodService OrderMethodService ;
	
	
	@RequestMapping("/register")
	public String ShowRegPage(Part part,Model model) {
		model.addAttribute("Part",new Part());

		return "PartRegister";

	}

	
	
	//it will show dropdowns at UI(Reg/edit )
	private void CommonUi(Model model) {
		
		  List<Uom> uomList = uomService.getAllUoms();
		  
		  model.addAttribute("uomList", uomList);
		
		List<Object[]> uomList1=uomService.getUomIdAndUomModel();
		Map<Integer,String> uomMap=CommonUtil.convert(uomList1);
		
		//model.addAttribute("uommap",uomMap);
	
		
	  List<Object[]> omsaleList=OrderMethodService.getOrderIdAndCode("sale");
	  Map<Integer,String> omSaleMap=CommonUtil.convert(omsaleList);
	  
	  model.addAttribute("OmSaleMap", omSaleMap);
	  
	

List<Object[]>omPurchaseList=OrderMethodService.getOrderIdAndCode("purchase");
	  Map<Integer,String> omPurchaseMap=CommonUtil.convert(omPurchaseList);
	  
	  model.addAttribute("OmPurchaseMap", omPurchaseMap); 
	 
   }
	  
	  
	  

	  @RequestMapping(value = "/save", method = RequestMethod.POST)

		public String savePart(@ModelAttribute Part part, Model model) {

			Integer result = service.savePart(part);

			String message = "Part'" + result + "' saved";

			model.addAttribute("Part", new Part());
			//model.addAttribute("message", message);

			return "PartRegister";
		}

	  
		@RequestMapping(value = "/all")
		public String getAllPart(Model model) {
			List<Part> list = service.getAllPart();
			model.addAttribute("list", list);
			return "PartData";

		}

		@RequestMapping("/delete")
		public String deletePart(@RequestParam("id") Integer id, Model model) {

			service.deletePart(id);
			String message = "Part'" + id + "'Deleted";
			model.addAttribute(message, message);
			// fetch new data
			List<Part> list = service.getAllPart();
			model.addAttribute("lis", list);
			return "PartData";

		}

		@RequestMapping("/edit")
		public String ShowEditPage(@RequestParam("sid") Integer id, Model model) {
			Part st = service.getOnePart(id);
			model.addAttribute("part", st);
			return "PartEdit";

		}

		@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updatePart(@ModelAttribute Part part, Model model) {
			service.updatePart(part);
			
			String message = "Part'" + part.getId() + "' Updated";
			model.addAttribute("message", message);

			List<Part> list = service.getAllPart();
			model.addAttribute("list", list);

			return "PartData";

		}

		}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  