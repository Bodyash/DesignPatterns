package com.zbohdan.patterns;

public class MicroUsbRecharger {
	
	private Iphone phone;
	private IphoneAdapter phoneAdapter;
	
	public MicroUsbRecharger(){
		
		System.out.println("Recharging iphone with generic recharger.");
		
		this.phone = new Iphone();
		this.phoneAdapter = new IphoneAdapter(this.phone);
		this.phoneAdapter.useMicroUsb();
		this.phoneAdapter.recharge();
		System.out.println("IPhone is ready for use.");
	}
	 
}
