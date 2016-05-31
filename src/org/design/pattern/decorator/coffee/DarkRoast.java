package org.design.pattern.decorator.coffee;

import org.design.pattern.decorator.Beverage;

public class DarkRoast extends Beverage {

	private double mCost = 0.99;
	
	public DarkRoast() {
		mDescription = "Dark Roast Coffee";
	}

	@Override
	public double cost() {
		return mCost;
	}

}
