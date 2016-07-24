package com.zbohdan.patterns;

public class Memory {
	
	public void load(long position, byte[] data){
		
		System.out.printf("Loading at %s position\n", position);
		
		System.out.print("[ ");
		
		for(int i = 0; i < data.length; i++){
			
			System.out.print(data[i] + ", ");
		}
		
		System.out.print("]");
		
		System.out.println();

	}
}
