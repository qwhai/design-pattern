package org.design.pattern.decorator.condiment;

import org.design.pattern.decorator.Beverage;

public class Milk extends CondimentDecorator {

	private Beverage mBeverage = null;
	private double mCost = 0.10;
	
	public Milk(Beverage beverage) {
		mBeverage = beverage;
	}

	@Override
	public String getDescription() {
		return mBeverage.getDescription() + ", Milk";
	}
	
	public double cost() {
		return mCost + mBeverage.cost();
	}

}
