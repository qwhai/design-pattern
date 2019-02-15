package decorator.coffee;

import decorator.Beverage;

public class Espresso extends Beverage {

	private double mCost = 1.99;
	
	public Espresso() {
		mDescription = "Espresso";
	}
	
	@Override
	public double cost() {
		return mCost;
	}

}
