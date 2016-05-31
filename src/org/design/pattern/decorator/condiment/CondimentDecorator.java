package org.design.pattern.decorator.condiment;

import org.design.pattern.decorator.Beverage;

public abstract class CondimentDecorator extends Beverage {

	@Override
	public double cost() {
		return 0;
	}

	public abstract String getDescription();
}
