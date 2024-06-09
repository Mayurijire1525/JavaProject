package com.app.utils;

import java.time.LocalDate;

import com.app.customexception.CustomException;
import com.app.entities.EmpType;
import com.app.entities.Employee;

public class Validation {

	public static Employee inputValidation(String name, String doj, String phoneNo, String adharNo, double msalary, int c) throws CustomException {
		LocalDate vdoj=LocalDate.parse(doj);
		if(!phoneNo.matches("^[0-9]*$")) {
			throw new CustomException("Invalid phone no");
		}
		if(!adharNo.matches("^[0-9]{12}$")) {
			throw new CustomException("Invalid adharNo");
		}
		if(c==1)
			return new Employee(name,vdoj,phoneNo,adharNo,EmpType.FTE,msalary,0.0);
		else
			return new Employee(name,vdoj,phoneNo,adharNo,EmpType.PTE,0.0,msalary);
	}
}
