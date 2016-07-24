package com.zbohdan.patterns;

public class Android implements IFormatAndroid{
	
	private boolean connectorOk = false;

	@Override
	public void recharge() {
		
		if(connectorOk){
			
			System.out.println("Recharge for Android completed.");
		} else
			System.out.println("Connected USB first");
	}

	@Override
	public void useMicroUsb() {
		
		connectorOk = true;
		System.out.println("MicroUsb connected.");
	}
	
	
}
