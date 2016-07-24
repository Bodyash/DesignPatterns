package com.zbohdan.patterns;

public class Main {
	
	public static void main(String[] args){
		
		Ellipse e1 = new Ellipse();
		Ellipse e2 = new Ellipse();
		Ellipse e3 = new Ellipse();
		Ellipse e4 = new Ellipse();
		
		CompositeGraphic g1 = new CompositeGraphic();
		CompositeGraphic g2 = new CompositeGraphic();
		CompositeGraphic g3 = new CompositeGraphic();
		
		g2.add(e1);
		g2.add(e2);
		g2.add(e3);
		
		g3.add(e4);
		
		g1.add(e1);
		g1.add(g2);
		
		g1.print();
	}
}
