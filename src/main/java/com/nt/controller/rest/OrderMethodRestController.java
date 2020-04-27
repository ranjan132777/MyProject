package com.nt.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.OrderMethod;
import com.nt.service.IOrderMethodService;

@RestController
@RequestMapping("/rest/ordermethod")

public class OrderMethodRestController {
	@Autowired
	private IOrderMethodService service;
	
	//1. fetch all oms
	@GetMapping("/all")
	public ResponseEntity<?> fetchAllOrders(){
		ResponseEntity<?> resp=null;
		try {
			List<OrderMethod> list=service.getAllOrderMethods();
			if(list==null || list.isEmpty()) {
				//resp=new ResponseEntity<T>("No Data Found", HttpStatus.NO_CONTENT);
				resp=new ResponseEntity<>( HttpStatus.NO_CONTENT);
			}else {
				resp=new ResponseEntity<List<OrderMethod>>(list,HttpStatus.OK);
			}
		} catch (Exception e) {
			resp=new ResponseEntity<String>("Unable to Fetch Order Methods List", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	//2. fetch one om by using Id
	@GetMapping("/one/{id}")
	public ResponseEntity<?> getOneOrder(
			@PathVariable("id")Integer id
			)
	
	{
		ResponseEntity<?> resp=null;
		try {
			OrderMethod om=service.getOneOrderMethod(id);
			if(om==null) {
				resp=new ResponseEntity<String>("Order Method '"+id+"' Not Found", HttpStatus.BAD_REQUEST);
			}else {
				resp=new ResponseEntity<OrderMethod>(om,HttpStatus.OK);
			}
		} catch (Exception e) {
			resp=new ResponseEntity<String>("Unable to fetch on OM",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		
		return resp;
	}
	
	
	//3. delete one OM by using Id
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteOrder(
			@PathVariable("id")Integer id
			)
	{
		ResponseEntity<String> resp=null;
		try {
			service.deleteOrderMethod(id);
			resp=new ResponseEntity<String>("Order Method '"+id+"' Deleted",HttpStatus.OK);
		} catch (Exception e) {
			resp=new ResponseEntity<String>("Order Method '"+id+"' Not Found",HttpStatus.BAD_REQUEST);
			e.printStackTrace();
		}
		return resp;
	}
	
	//4. save one OM
	@PostMapping("/save")
	public ResponseEntity<String> saveOrder(
			@RequestBody OrderMethod orderMethod
			)
	{
		ResponseEntity<String> resp=null;
		try {
			Integer id=service.saveOrderMethod(orderMethod);
			//resp=new ResponseEntity<String>("Order Method saved with id:"+id, HttpStatus.OK);
			resp=new ResponseEntity<String>("Order Method saved with id:"+id, HttpStatus.CREATED);
		} catch (Exception e) {
			resp=new ResponseEntity<String>("Unable to Save Order", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	//5. update one OM by Id
	@PutMapping("/edit")
	public ResponseEntity<?> updateOrder(
			@RequestBody OrderMethod orderMethod
			)
	{
		ResponseEntity<?> resp=null;
		try {
			service.updateOrderMethod(orderMethod);
			//resp=new ResponseEntity<String>("Order Method '"+orderMethod.getOrderId()+"' Update", HttpStatus.OK);
			resp=new ResponseEntity<String>("Order Method '"+orderMethod.getOrdermethodId()+"' Update", HttpStatus.RESET_CONTENT);
		} catch (Exception e) {
			resp=new ResponseEntity<String>("Order Method '"+orderMethod.getOrdermethodId()+"' Not Found", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}

}
/*
 * 1. FETCH ALL OMS
 * 
 * GET http://localhost:2019/MyProjectApp/rest/ordermethod/all SEND
 * 
 * 2. FETCH ONE OM
 * 
 * GET http://localhost:2019/MyProjectApp/rest/ordermethod/one/9 SEND
 * 
 * 3. DELETE ONE OM
 * 
 * DELETE http://localhost:2019/MyProjectApp/rest/ordermethod/remove/9 SEND
 * 
 * 4. SAVE ONE OM
 * 
 * POST http://localhost:2019/MyProjectApp/rest/ordermethod/save SEND Body
 * (*)raw JSON(application/json) { "orderMode": "Purchase", "orderCode":
 * "PURBB", "orderType": "FIFO", "orderAcpt": [ "Multi-Model" ], "description":
 * "AAAABB" }
 * 
 * 5. UPDATE ONE OM
 * 
 * PUT http://localhost:2019/MyProjectApp/rest/ordermethod/edit SEND Body (*)raw
 * JSON(application/json) { "orderId": 10, "orderMode": "Purchase", "orderCode":
 * "NEWPUR", "orderType": "LIFO", "orderAcpt": [ "Multi-Model", "Accept Return"
 * ], "description": "NEWDATA" }
 */