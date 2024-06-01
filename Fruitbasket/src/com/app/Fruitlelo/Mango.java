package com.app.Fruitlelo;

public class Mango extends Fruit {
	Mango(String colour,String name,double weight,boolean fresh){
		super(colour,name,weight,fresh);
	}
	
	public String taste(){
		return ("sweet");
	}
	public void pulp(){
		System.out.println(getName() + "JAM bannn gyaaaaa" );
	}
}
