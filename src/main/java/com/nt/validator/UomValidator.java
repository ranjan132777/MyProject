package com.nt.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.model.Uom;
import com.nt.service.IUomService;
@Component
public class UomValidator implements Validator {
	
	@Autowired
	private IUomService service; //HAS-A
	
	/**
	 * This method ask which model class objects
	 * are accepted for validation
	 */
	@Override
	public boolean supports(Class<?> cls) {
		return Uom.class.equals(cls);
	}
	
	/**
	 * Define Validation Logic here.
	 * Here target -> model class object
	 */
	@Override
	public void validate(Object target, Errors errors) {
		//down cast to Model
		Uom uom=(Uom)target;
		
		//TODO validation logic starts here....
		if(service.isUomModelExist(uom.getUomModel())) {
			errors.rejectValue("uomModel", null, "Uom Model '"+uom.getUomModel()+"' already exist");

			
	}

}
}