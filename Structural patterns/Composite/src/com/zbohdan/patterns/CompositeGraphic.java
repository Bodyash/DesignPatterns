package com.zbohdan.patterns;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic{
	
	private List<Graphic> childGraphics = new ArrayList<>();
	
	@Override
	public void print(){
		
		for(Graphic g : childGraphics){
			
			g.print();
		}
	}
	
	public void add(Graphic g){
		
		childGraphics.add(g);
	}
	
	public void remove(Graphic g){
		
		childGraphics.remove(g);
	}

}
