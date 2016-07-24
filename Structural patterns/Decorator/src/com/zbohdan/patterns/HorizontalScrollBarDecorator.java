package com.zbohdan.patterns;

public class HorizontalScrollBarDecorator extends WindowDecorator{
	
	public HorizontalScrollBarDecorator(Window windowToBeDecorated){
		
		super(windowToBeDecorated);
	}
	
	@Override
	public void draw(){
		
		super.draw();
		drawHorizontalScrollBar();
	}
	
	private void drawHorizontalScrollBar(){
		//TO - DO
	}
	
	@Override
	public String getDescription(){
		
		return super.getDescription() + ", including horizontal scrollbars";
	}
}
