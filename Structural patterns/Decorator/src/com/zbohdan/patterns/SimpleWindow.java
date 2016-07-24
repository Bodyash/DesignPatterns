package com.zbohdan.patterns;

public class SimpleWindow implements Window{
	
	public void draw(){
		System.out.println("Simple window draws");
	}
	
	public String getDescription(){
		return "It is a simple window";
	}
}
