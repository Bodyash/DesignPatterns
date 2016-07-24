package com.zbohdan.patterns;

import java.util.Random;

public class HardDrive {
	
	
/**
 * Very strange method that returns array of bytes with
 * specified size. If lba greater than or equals to 5 then assign to each byte element
 * in array random value in (0-1 bound)
 * When lba doesn't greater than or equal to 5 assign `1` to each elements and resulting array
 * will be `11111111` (with the size of 8).
 * */
	public byte[] read(long lba, int size){
		
		byte [] returnByte = new byte[size];
		Random rand = new Random();
		
		if(lba >= 5){
			
			for(int i = 0; i < (returnByte.length); i++){
				
				returnByte[i] = (byte) rand.nextInt(2);
			}
		}
		else{
			
			for(int i = 0; i < returnByte.length; i++){
				
				returnByte[i] = 1;
			}
		}
		
		return returnByte;
	}
	
	
}
