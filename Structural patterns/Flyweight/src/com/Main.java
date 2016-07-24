package com;

public class Main {
	
	public static void main(String[] args){
		
		CoffeeShop shop = new CoffeeShop();
		
		shop.takeOrder("Espresso", 4);
		shop.takeOrder("Moccaccino", 5);
		shop.takeOrder("Americano", 1);
		shop.takeOrder("Tea", 2);
		shop.takeOrder("Robusta", 7);
		
		shop.service();
		System.out.println(shop.report());
	}
}
