package com.app.Fruitlelo;

import java.util.*;
import java.util.Scanner;


public class Client {
   public static void main(String[] args) {
	   
//	   Mango m1= new Mango("sa","sad",43,true);
//	   Orange o1= new Orange("sa","sad",433,true);
//	   Apple a1= new Apple("sa","sad",423,false);
//	   
//	   System.out.println(m1.toString());
//	   System.out.println(o1.toString());
//	   System.out.println(a1.toString());
	   
	   Fruit[] f1 = new Fruit[10];
	   Scanner sc = new Scanner(System.in);
	   int a=0;
	   int i=0;
	   String name;
	   String colour;
	   double weight;
	   boolean fresh;
	   
	   
	  while(true){
		  System.out.println("Enter a choice");
		  System.out.println("1. add Mango");
		  System.out.println("2. add Apple");
		  System.out.println("3. add Orange");
		  System.out.println("4. Exit");
		  System.out.println("5. to Display name");
		  System.out.println("6. to Display all");
		  System.out.println("7. Invoke fruit specific functionality");
		  System.out.println("8. COUNT: ");
		  System.out.println("9. Check order type");
		  System.out.println("10. SET FRESHNESS");
		  a=sc.nextInt();
	   switch (a) {
	case 1:{
		System.out.println("Enter details");
		name=sc.next();
		colour=sc.next();
		weight=sc.nextDouble();
		fresh=sc.nextBoolean();
		f1[i]= new Mango(colour,name,weight,fresh);
		i++;
		System.out.println("added successfull");
		break;
	}
	case 2:{
		System.out.println("Enter details");
		name=sc.next();
		colour=sc.next();
		weight=sc.nextDouble();
		fresh=sc.nextBoolean();
		f1[i]= new Apple(colour,name,weight,fresh);
		i++;
		System.out.println("added successfull");
		break;
	}
	case 3:{
		System.out.println("Enter details");
		name=sc.next();
		colour=sc.next();
		weight=sc.nextDouble();
		fresh=sc.nextBoolean();
		f1[i]= new Orange(colour,name,weight,fresh);
		i++;
		System.out.println("added successfull");
		break;
	}
	case 4:{
		System.out.println("exitttedddddddd");
		break;
	}
	case 5:{
		System.out.println("ALL fruit in your Basket");
		for (int j = 0; j < i; j++) {
			System.out.println(f1[j].getName());
		}
		break;
	}
	case 6:{
		System.out.println("ALL fruit in your Basket");
		for (int j = 0; j < i; j++) {
			System.out.println(f1[j].toString());
		}
		break;
	}
	case 7:{
		System.out.println("Invoke fruit specific functionality");
		int q;
		q=sc.nextInt();
		if(f1[q] instanceof Mango) {
			Mango m1 = (Mango)(f1[q]);
			System.out.println(m1.taste());   
			m1.pulp();
		}
		else if(f1[q] instanceof Orange) {
			Orange o1 = (Orange)(f1[q]);
			System.out.println(o1.taste());
			o1.juice();
		}
		else if(f1[q] instanceof Apple) {
			Apple a1 = (Apple)(f1[q]);
			System.out.println(a1.taste());
			a1.jam();
		}
		break;
	}
	case 8:{
		
		System.out.println("Total no. of Fruits in basket" + i);
		break;
	}
	case 9:{
		System.out.println("Invoke fruit specific functionality");
		int q;
		q=sc.nextInt();
		if(f1[q].taste().equals("sour"))
		{
			System.out.println("fruit is sour in taste");
			f1[q].setFresh(false);
			System.out.println("updated");
		}
			
		break;
		
	}
	case 10:{
		System.out.println("updated");
		int q;
		q=sc.nextInt();
		f1[q].setFresh(false);
		if(!f1[q].isFresh()){
			System.out.println("shi jaa rhaa");
		};
		break;
		
	}
	default:
		System.out.println("wrong choice");
		break;
	}
	
	  }
	   
}
   
}
