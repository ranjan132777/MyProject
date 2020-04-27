package com.nt.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Part;
import com.nt.service.IPartService;

@RestController
@RequestMapping("/rest/part")
public class PartRestContoller {
	@Autowired
	private IPartService service;

	//1. fetch all Parts
	@GetMapping("/all")
	public ResponseEntity<?> getAllParts(){
		ResponseEntity<?> resp=null;
		try {
			List<Part> list=service.getAllPart();
			if(list==null || list.isEmpty()) {
				resp=new ResponseEntity<>( HttpStatus.NO_CONTENT);
			}else {
				resp=new ResponseEntity<List<Part>>(list, HttpStatus.OK);
			}
		} catch (Exception e) {
			resp=new ResponseEntity<String>("Unable to Fetch Parts!!", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}

	//2. fetch one by Id


	//3. save Part
	@PostMapping("/save")
	public ResponseEntity<String> savePart(
			@RequestBody Part part
			)
	{
		ResponseEntity<String> resp=null;
		try {
			Integer id=service.savePart(part);
			resp=new ResponseEntity<String>("Part saved with Id:"+id, HttpStatus.CREATED);
		} catch (Exception e) {
			resp=new ResponseEntity<String>("Unable to save Part", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}


	//4. update one part


	//5. Delete one part by Id
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removePart(
			@PathVariable("id")Integer id
			)
	{
		ResponseEntity<String> resp=null;
		try {
			service.deletePart(id);
			resp=new ResponseEntity<String>("Part '"+id+"' Deleted", HttpStatus.OK);
		} catch (Exception e) {
			resp=new ResponseEntity<String>("Part '"+id+"' Not Found", HttpStatus.BAD_REQUEST);
			e.printStackTrace();
		}
		return resp;
	}

}
/*----------------------------POSTMAN SCRREEN --------------------------

GET http://localhost:2019/MyProjectApp/rest/part/all  SEND

Output:
[
    {
        "id": 16,
        "partCode": "PARTA",
        "partLen": 5,
        "partWid": 5,
        "partHgt": 5,
        "baseCost": 25,
        "baseCurrency": "INR",
        "note": "TEST",
        "uomOb": {
            "id": 11,
            "uomType": "PACKING",
            "uomModel": "BOMF",
            "note": "SDSDSDSD"
        },
        "omSaleOb": {
            "orderId": 13,
            "orderMode": "Sale",
            "orderCode": "SALET",
            "orderType": "LIFO",
            "orderAcpt": [
                "Multi-Model",
                "Accept Return"
            ],
            "description": "dfsdfsdfsd"
        },
        "omPurcasheOb": {
            "orderId": 10,
            "orderMode": "Purchase",
            "orderCode": "NEWPUR",
            "orderType": "LIFO",
            "orderAcpt": [
                "Multi-Model",
                "Accept Return"
            ],
            "description": "NEWDATA"
        }
    }
]


*******************************SAVE OPERATION SCRREN*********************


POST http://localhost:2019/MyProjectApp/rest/part/save  SEND
    Body   
        (*) raw     JSON[application/json]

{
  "partCode" : "PENNEW",
  "partLen"  : 3.26,
  "partWid"  : 1.15,
  "partHgt"  : 6.65,

  "baseCost" : 50.25,
  "baseCurrency" : "INR",
  "note": "TESTRR",

  "uomOb" : {
     "id" :  11
  },

  "omSaleOb" : { 
     "orderId" :  14
  },

  "omPurcasheOb": {
    "orderId": 10
  }

}

Output: Part saved with Id:18
**** Note: In case of Integrations we need to pass child (HAS-A) PK value only

{
  //parnt data
  "childHasA": { "pkVariable" : pkValue }

}

****************************DELETE OPERATION SCREEN*******************************
DELETE  http://localhost:2019/MyProjectApp/rest/part/remove/17  SEND

Output:
Part '17' Deleted


}
*/