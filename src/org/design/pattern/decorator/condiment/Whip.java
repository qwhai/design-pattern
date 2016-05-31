package org.design.pattern.decorator.condiment;

import org.design.pattern.decorator.Beverage;

public class Whip extends CondimentDecorator {

	private Beverage mBeverage = null;
	private double mCost = 0.10;
	
	public Whip(Beverage beverage) {
		mBeverage = beverage;
	}

	@Override
	public String getDescription() {
		return mBeverage.getDescription() + ", Whip";
	}

	public double cost() {
		return mCost + mBeverage.cost();
	}
}
