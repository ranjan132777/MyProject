package com.nt.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.model.WhUserType;
import com.nt.service.IWhUserTypeService;
@Component
public class WhUserTypeValidator implements Validator {


	@Autowired
	private IWhUserTypeService service; //HAS-A
	
	@Override
	public boolean supports(Class<?> cls) {
		return WhUserType.class.equals(cls);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//Downcast to Actual Object
		WhUserType user=(WhUserType)target;
		
		//verify userCode with DB
		if(service.isUserCodeExist(user.getUserCode())) {
			errors.rejectValue("userCode", null, " User code '"+user.getUserCode()+"' already exist ");
		}
		
		//verify userMail with DB
		if(service.isUserMailExist(user.getUserMail())) {
			errors.rejectValue("userMail", null,"User Email '"+user.getUserMail()+"' already exist");
		}
		
		//verify userContact with Db
		if(service.isUserContactExist(user.getUserContact())) {
			errors.rejectValue("userContact", null,"User Contact '"+user.getUserContact()+"' already exist");
		}

	}

}
