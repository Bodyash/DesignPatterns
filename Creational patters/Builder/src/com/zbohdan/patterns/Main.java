package com.zbohdan.patterns;

import java.awt.Color;
import java.awt.Point;

public class Main {
	
	public static void main(String[] args){
		
		StreetMap map = new StreetMap.Builder(new Point(50, 50), new Point(100, 100)).waterColor(Color.BLUE.brighter()).landColor(Color.GRAY).build();
	}
}
