package com.zbohdan.patterns;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fruit {
	
	private static Map<FruitType, Fruit> types = new HashMap<>();
	
	private Fruit(FruitType type){}
	
	public static Fruit getFruitByTypeName(FruitType type){
		
		Fruit fruit;
		
		if(!types.containsKey(type)){
			
			fruit = new Fruit(type);
			types.put(type, fruit);
		} else {
			
			fruit = types.get(type);
		}
		
		return fruit;
	}
	
	public static Fruit getFruitByTypeNameHighConcurrentVerstion(FruitType type){
		
		if(!types.containsKey(type)){
			
			synchronized(types){
				
				if(!types.containsKey(type))
					types.put(type, new Fruit(type));
			}
		}
		return types.get(type);
	}
	
	public static void showAll(){
		
		if(types.size() > 0){
			
			System.out.println("Number of instances: " + types.size());
		
			for(Entry<FruitType, Fruit> entry : types.entrySet()){
				
				String fruit = entry.getKey().toString();
				fruit = Character.toUpperCase(fruit.charAt(0)) + fruit.substring(1);
				System.out.println(fruit);
			}
		}
		System.out.println();
	}
}
