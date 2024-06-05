package com.app.Fruitlelo;

public class Apple extends Fruit {
	Apple(String colour,String name,double weight,boolean fresh){
		super(colour,name,weight,fresh);
	}
	
	public String taste(){
		return ("sweet n sour");
	}
	
	public void jam(){
		System.out.println(getName() + getColour() + "pulp bn gya" );
	}
}