package com;

import java.util.HashMap;
import java.util.stream.Collectors;

public final class CommandFactory {
	
	private final HashMap<String, Command> commands;
	
	private CommandFactory(){
		commands = new HashMap<>();
	}
	
	public void addCommand(String name, Command command){
		
		commands.put(name, command);
	}
	
	public void executeCommand(String name){
		
		if(commands.containsKey(name))
			commands.get(name).apply();
	}
	
	public void listCommands(){
		System.out.println("Enabled commands " + commands.keySet().stream().collect(Collectors.joining(", ")));
	}
	
	public static CommandFactory init(){
		
		CommandFactory factory = new CommandFactory();
		
		factory.addCommand("Light on", () -> System.out.println("Light turned on"));
		factory.addCommand("Light off", () -> System.out.println("Light turned off"));
		
		return factory;
	}
	
}
