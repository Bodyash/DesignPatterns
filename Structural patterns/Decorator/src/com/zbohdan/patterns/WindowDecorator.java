package com.zbohdan.patterns;

public class WindowDecorator implements Window{
	
	protected Window windowToBeDecorated;
	
	public WindowDecorator(Window windowToBeDecorated){
		
		this.windowToBeDecorated = windowToBeDecorated;
	}
	
	@Override
	public void draw(){
		windowToBeDecorated.draw();
	}
	
	@Override
	public String getDescription(){
		return windowToBeDecorated.getDescription();
	}
}
