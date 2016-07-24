package com;

import java.util.ArrayList;

public class Switch {

	private ArrayList<Command> history = new ArrayList<Command>();
	
	public void storeAndExecute(Command cmd){
		
		this.history.add(cmd);
		cmd.execute();
	}
}
