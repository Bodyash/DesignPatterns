package com.zbohdan.patterns;

public class Iphone implements IFormatIphone{
	
	private boolean connectorOk = false;
	
	@Override
	public void useLighting(){
		
		connectorOk = true;
		System.out.println("Lighting connected.");
	}
	
	@Override
	public void recharge(){
		
		if(connectorOk){
			
			System.out.println("Recharged comleted.");
		} else
			System.out.println("Connect light first.");
	}
}
