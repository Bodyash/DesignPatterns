package com;

public class Main {

	public static void main(String[] args) {
		
		CommandFactory factory = CommandFactory.init();
		factory.executeCommand("Light on");
		factory.listCommands();
	}

}
