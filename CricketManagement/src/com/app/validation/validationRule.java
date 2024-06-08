package com.app.validation;

import java.util.Map;

import com.app.customexception.CustomException;
import com.app.entity.Cricketer;

public class validationRule {

	public static Cricketer acceptCricketer(String name, int age, String email	, String phone, int rating,
			Map<String, Cricketer> cricmap) {
		checkForDup(email,cricmap);
		
		checkValidatePhone(phone);
		return new Cricketer(name,age,email,phone,rating);
	}

	private static int checkValidatePhone(String phone)throws CustomException {
		if(phone.length()!=10) {
			throw new CustomException("Number invalid");
		}else {
		int n=Integer.parseInt(phone);
		return n;
		}
	}

	private static void checkForDup(String email, Map<String, Cricketer> cmap) throws CustomException{
		if(cmap.containsKey(email))
			throw new CustomException("Email  registered");
		
	}

}
