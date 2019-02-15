package decorator.condiment;

import decorator.Beverage;

public class Soy extends CondimentDecorator {

	private Beverage mBeverage = null;
	private double mCost = 0.15;
	
	public Soy(Beverage beverage) {
		mBeverage = beverage;
	}

	@Override
	public String getDescription() {
		return mBeverage.getDescription() + ", Soy";
	}

	public double cost() {
		return mCost + mBeverage.cost();
	}
}
