package com;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Menu {
	
	private Map<String, CoffeeFlavour> flavours = new ConcurrentHashMap<>();
	
	/**
	 * Method searches the flavour name and returns the result from
	 * the concurrentHashMap instance. If it doesn't consist any key
	 * with this name then just create the new one with that key.
	 * And in the end return either existing key or newly created.
	 * */
	CoffeeFlavour lookup(String flavorName){
		
		if(!flavours.containsKey(flavorName))
			flavours.put(flavorName, new CoffeeFlavour(flavorName));
		
		return flavours.get(flavorName);
	}
	
	/**
	 * This method is needed to calculate how many orders clients have made.
	 * */
	int totalCoffeeFlavoursMade(){
		
		return flavours.size();
	}
}
