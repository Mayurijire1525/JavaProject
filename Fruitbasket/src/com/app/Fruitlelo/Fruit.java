package com.app.Fruitlelo;

public abstract class Fruit {
     private String colour;
     private String name;
     private double weight;
     private boolean fresh;
     
     Fruit(String colour,String name,double weight,boolean fresh )
     {
    	this.colour=colour;
    	this.name=name;
    	this.fresh=fresh;
    	this.weight=weight;
     }

	@Override
	public String toString() {
		return "Fruit [colour=" + colour + ", name=" + name + ", weight=" + weight + "]";
	}
	
    public abstract String taste();

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
 }
