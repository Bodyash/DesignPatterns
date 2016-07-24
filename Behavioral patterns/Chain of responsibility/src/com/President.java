package com;

public class President extends PurchasePower{

	@Override
	protected double getAllowable() {
		return BASE * 60;
	}

	@Override
	protected String getRole() {
		return "President";
	}

}
