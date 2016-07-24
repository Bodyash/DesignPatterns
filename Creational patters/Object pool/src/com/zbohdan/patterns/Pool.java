package com.zbohdan.patterns;

import java.util.ArrayList;
import java.util.List;

public class Pool {
	
	private static List<PooledObject> available;
	private static List<PooledObject> inUse;
	
	public static PooledObject getObject(){
		
		available = new ArrayList<>();
		inUse = new ArrayList<>();
		
		synchronized(available){
			
			if(available.size() != 0){
				
				PooledObject po = available.get(0);
				inUse.add(po);
				available.remove(0);
				return po;
			} else {
				
				PooledObject po = new PooledObject();
				inUse.add(po);
				return po;
			}
		}
	}
	
	public static void releaseObject(PooledObject po){
		
		synchronized(available){
			
			available.add(po);
			available.remove(po);
		}
	}
	
}
