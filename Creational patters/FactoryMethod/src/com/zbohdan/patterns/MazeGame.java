package com.zbohdan.patterns;

import java.util.List;
import java.util.ArrayList;

public abstract class MazeGame {
	
	private final List<Room> rooms = new ArrayList<>();
	protected abstract Room makeRoom();
	
	public MazeGame(){
		
		Room r1 = makeRoom();
		Room r2 = makeRoom();
		r1.connect(r2);
		rooms.add(r1);
		rooms.add(r2);
	}
}
