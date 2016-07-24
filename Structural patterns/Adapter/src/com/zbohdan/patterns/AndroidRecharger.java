package com.zbohdan.patterns;

public class AndroidRecharger {
	
	Android phone;
	
	public AndroidRecharger(){
		
		System.out.println("Recharging android phone with generic recharger.");
		phone = new Android();
		phone.useMicroUsb();
		phone.recharge();
		System.out.println("Android is now ready for use.");
	}
}
