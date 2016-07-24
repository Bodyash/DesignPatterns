package com;

import java.util.List;
import java.util.Vector;

public class CoffeeShop {
	
	private final List<Order> orders = new Vector<Order>(); //Stores each client's order.
	private final Menu menu = new Menu(); // Stores the HashMap information about each type of coffee.
	
	/**
	 * When user wants to take an order he asks for some coffee using its name,
	 * then operator (or automatic coffee machine) stores this information in temporary memory,
	 * processes it and gives the result (desired coffee).
	 * In this case, this method creates an instance of CoffeeFlavour and looking for coffee name
	 * in menu. After this method need to treat this process as a new order so it creates an order instance.
	 * Then `orders` list need to add to itself new order to give full information about orders later on in
	 * the end of the program.
	 * */
	void takeOrder(String flavourName, int table){
		
		CoffeeFlavour flavour = menu.lookup(flavourName);
		Order order = new Order(table, flavour);
		orders.add(order);
	}
	
	/**
	 * After operator (or machine) has taken each order He need to service all of them so
	 * this method does this task. Using enhanced for loop it services each ordered coffee.
	 * */
	void service(){
		
		for(Order order : orders)
			order.serve();
	}
	
	/**
	 * After all jobs have done We need to report about orders made or report a progress.
	 * The method returns a total count of all orders made earlier while program was working.
	 * */
	String report(){
		
		return "\nTotal CoffeeFlaour objects made: " + menu.totalCoffeeFlavoursMade();
	}
}
