package org.design.pattern.decorator.condiment;

import org.design.pattern.decorator.Beverage;

public class Mocha extends CondimentDecorator {

	private Beverage mBeverage = null;
	private double mCost = 0.20;
	
	public Mocha(Beverage beverage) {
		mBeverage = beverage;
	}

	@Override
	public String getDescription() {
		return mBeverage.getDescription() + ", Mocha";
	}

	public double cost() {
		return mCost + mBeverage.cost();
	}
}
