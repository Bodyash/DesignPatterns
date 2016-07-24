package com;

import java.util.Observable;
import java.util.Observer;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter text: ");
		EventSource eventSource = new EventSource();
		
		eventSource.addObserver(new Observer(){
			
			public void update(Observable obj, Object arg){
				System.out.println("Received response: " + arg);
			}
		});
		
		new Thread(eventSource).start();
	}

}
