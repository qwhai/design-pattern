package org.design.pattern.decorator.coffee;

import org.design.pattern.decorator.Beverage;

public class HouseBlend extends Beverage {

	private double mCost = 0.89;
	
	public HouseBlend() {
		mDescription = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return mCost;
	}

}
