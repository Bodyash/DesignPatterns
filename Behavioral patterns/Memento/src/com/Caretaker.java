package com;

import java.util.List;
import java.util.ArrayList;

public class Caretaker {
	
	public static void main(String[] args){
		
		List<Originator.Memento> savedStates = new ArrayList<Originator.Memento>();
		
		Originator originator = new Originator();
		originator.set("State 1");
		originator.set("State 2");
		savedStates.add(originator.saveToMemento());
		originator.set("State 3");
		//It can be requested multiple mementoes and choose which
		// one should be rolled back.
		savedStates.add(originator.saveToMemento());
		originator.set("State 4");
		
		originator.restoreFromMemento(savedStates.get(1));
		
	}
	
}
