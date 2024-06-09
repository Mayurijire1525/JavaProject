package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.entities.Employee;
import com.app.utils.Validation;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			List<Employee> emplist=new ArrayList<>();
			boolean exit=false;
			while(!exit) {
				System.out.println("---Application Menu---");
				System.out.println("1.Add full time employee\r\n"
						+ "2.Add part time employee\r\n"
						+ "3.Delete an employee by Emp Id\r\n"
						+ "4.Search employee details by Aadhaar number\r\n"
						+ "5.Display all employee details\r\n"
						+ "6.Display all employee details sorted by date of joining\r\n"
						+ "7.Exit");
				System.out.println("Enter your choice");
			}
			try {
				switch(sc.nextInt()) {
				case 1:
					//Name, Date of joining, Phone Number, Aadhaar number  

					System.out.println("Enter Name Date of joining, Phone Number, Aadhaar number ,Monthly salary ");
					Employee e=Validation.inputValidation(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
					emplist.add(e);
					System.out.println("Employee Details added successfully");
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					System.out.println("Exiting------");
					break;
				default:
					System.out.println("Invalid input");
					
				}
			}
			catch(Exception e) {
				sc.nextLine();
				System.out.println(e);
			}
		
			
		}

	}

}
