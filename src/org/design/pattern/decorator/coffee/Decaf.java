package org.design.pattern.decorator.coffee;

import org.design.pattern.decorator.Beverage;

public class Decaf extends Beverage {

	private double mCost = 1.05;
	
	public Decaf() {
		mDescription = "Decaf Coffee";
	}

	@Override
	public double cost() {
		return mCost;
	}

}
