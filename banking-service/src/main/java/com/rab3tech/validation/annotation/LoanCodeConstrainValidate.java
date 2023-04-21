package com.rab3tech.validation.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoanCodeConstrainValidate implements ConstraintValidator<LoanCodeForName,String>{

	private String nameVald;

	@Override
	public void initialize(LoanCodeForName rabin) {
		nameVald=rabin.Value();
	}

	@Override
	public boolean isValid(String rab, ConstraintValidatorContext shres) {
		//business logic
		boolean result;
		if(rab!=null) {
			//result=rab.startsWith(nameVald);
			result=rab.endsWith(nameVald);
		}else {
			result=true;
		}
		
		return result;
	}
	
	
}
