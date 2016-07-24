package com;

public class WinFactory implements IGUIFactory{
	
	@Override
	public IButton CreateButton(){
		
		return new WinButton();
	}
}
