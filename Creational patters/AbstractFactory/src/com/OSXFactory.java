package com;

public class OSXFactory implements IGUIFactory{

	@Override
	public IButton CreateButton() {
		
		return new OSXButton();
	}
}
