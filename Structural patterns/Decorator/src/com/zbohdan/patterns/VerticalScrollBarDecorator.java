package com.zbohdan.patterns;

public class VerticalScrollBarDecorator extends WindowDecorator{
	
	public VerticalScrollBarDecorator(Window windowToBeDecorated){
		
		super(windowToBeDecorated);
	}
	
	@Override
	public void draw(){
		super.draw();
		drawVerticalScrollBar();
	}
	
	private void drawVerticalScrollBar(){
		// to do
	}
	
	@Override
	public String getDescription(){
		
		return super.getDescription() + ", including vertical scrollbars";
	}
}
