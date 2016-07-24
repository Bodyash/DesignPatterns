package com.zbohdan.patterns;

public class CircleShape extends Shape{
	
	private double x;
	private double y;
	private double radius;
	
	public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI){
			
		super(drawingAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		
		drawingAPI.drawCircle(x, y, radius);
	}

	@Override
	public void resizeByPercentage(double percent) {
		
		radius *= (1.0 + percent / 100.0);
	}

}
