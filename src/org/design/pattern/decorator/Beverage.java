package org.design.pattern.decorator;

public abstract class Beverage {

	public String mDescription = "UnKnown Beverage";
	private int size = 0;
	
	public String getDescription() {
		return mDescription;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public abstract double cost();
}
