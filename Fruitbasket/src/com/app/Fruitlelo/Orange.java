package com.app.Fruitlelo;

public class Orange extends Fruit {
	Orange(String colour,String name,double weight,boolean fresh){
		super(colour,name,weight,fresh);
	}
	
	public String taste(){
		return ("sour");
	}
	public void juice(){
		System.out.println(getName() + getWeight() + " juice piloo guyzzzzz" );
	}
}