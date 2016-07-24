package com;

public class Main {
	
	public static void main(String [] args){
		
		String appearance = "osx";
		IGUIFactory factory = null;
		IButton btn = null;
		
		switch(appearance){
		
			case "win":
				factory = new WinFactory();
				System.out.println("Windows factory completed!");
				break;
			case "osx":
				factory = new OSXFactory();
				System.out.println("OSX Factory completed!");
				break;
			default:
				System.out.println("There's no options");
				break;
		}
		btn = factory.CreateButton();
		
	}
}
