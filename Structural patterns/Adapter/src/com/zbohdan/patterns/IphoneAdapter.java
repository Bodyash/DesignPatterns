package com.zbohdan.patterns;

public class IphoneAdapter implements IFormatAndroid{
	
	private IFormatIphone mobile;
	
	public IphoneAdapter(IFormatIphone mobile){
		
		this.mobile = mobile;
	}
	
	@Override
	public void recharge(){
		
		this.mobile.recharge();
	}
	
	@Override
	public void useMicroUsb(){
		
		System.out.println("MicroUSB is now connected.");
		this.mobile.useLighting();
	}

}
