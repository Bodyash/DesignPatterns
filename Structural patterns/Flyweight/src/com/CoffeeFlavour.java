package com;

public class CoffeeFlavour {
	
	private final String name;
	
	CoffeeFlavour(String newFlavor){
		
		name = newFlavor;
	}
	
	@Override
	public String toString(){
		return name;
	}
}
