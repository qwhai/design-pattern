package decorator.coffee;

import decorator.Beverage;

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
