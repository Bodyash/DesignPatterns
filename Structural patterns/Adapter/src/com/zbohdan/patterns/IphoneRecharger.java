package com.zbohdan.patterns;

public class IphoneRecharger {
	
	private Iphone phone;
	
	public IphoneRecharger(){
		
		System.out.println("Recharging Iphone with its recharger.");
		phone = new Iphone();
		phone.useLighting();
		phone.recharge();
		System.out.println("Iphone ready for use.");
	}
}
