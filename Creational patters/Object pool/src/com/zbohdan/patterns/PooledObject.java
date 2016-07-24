package com.zbohdan.patterns;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PooledObject {
	
	DateFormat dateFormat;
	
	public DateFormat createdAt(){
		
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	}
	
}
