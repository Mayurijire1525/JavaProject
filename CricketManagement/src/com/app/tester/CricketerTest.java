package com.app.tester;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.entity.Cricketer;
import com.app.utils.CricketUtils;
import com.app.validation.validationRule;

public class CricketerTest {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			
			Map<String,Cricketer> cricketermap= new HashMap<>();
			
			while(!exit) {
				try {
					System.out.println("1.Accept minimum 5 Cricketers in the collection\n 2.Modify Cricketer's rating\n 3.Search Cricketer by name\n 4. Display all Cricketers added in collection.\n 5.Display All Cricketers in sorted form by rating.\n ");
					System.out.println("Enter the choice:");
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter details name age email phoneno rating");
						Cricketer cm=validationRule.acceptCricketer(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),cricketermap);
						cricketermap.put(cm.getEmail(), cm);
						System.out.println("Cricketer details added succesfully");
						break;
					case 2:
						System.out.println("Enter email and rating to be modified");
						System.out.println(CricketUtils.updateRating(sc.next(),sc.nextInt(),cricketermap));
						break;
					case 3:
						System.out.println("Enter cricketer name");
						Cricketer c=CricketUtils.searchByName(sc.next(),cricketermap);
						System.out.println(c);
						break;
					case 4:
						for(Cricketer c1:cricketermap.values())
						System.out.println(c1);
						break;
					case 5:
						List<Cricketer> sortedList=CricketUtils.sortByRating(cricketermap);
						for(Cricketer c5:sortedList)
							System.out.println(c5);
						break;
					case 6:
						System.out.println("Exit-------");
						exit=true;
						break;
					}
				}
			
			catch(Exception e) {
				System.out.println(e);
				sc.nextLine();
			}
			}
		}
	}
}
