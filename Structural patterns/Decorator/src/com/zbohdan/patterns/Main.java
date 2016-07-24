package com.zbohdan.patterns;

public class Main {
	
	public static void main(String[] args){
		
		Window decoratedWindow = new HorizontalScrollBarDecorator(
				new VerticalScrollBarDecorator(new SimpleWindow()));
		
		System.out.println(decoratedWindow.getDescription());
	}
}
