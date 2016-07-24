package com;

public class Main {
	
	public static void main(String[] args){
		
		//Set console argument explicitly not to be bothered.
		args = new String[1];
		args[0] = "OFF";
		
		if(args.length != 1){
			
			System.out.println("Argument on or off is required");
			System.exit(-1);
		}
		
		Light lamp = new Light();
		Command switchUp = new FlipUpCommand(lamp);
		Command switchDown = new FlipDownCommand(lamp);
		
		Switch mySwitch = new Switch();
		
		switch(args[0]){
		
			case "ON":
				mySwitch.storeAndExecute(switchUp);
				break;
			case "OFF":
				mySwitch.storeAndExecute(switchDown);
				break;
			default:
				System.err.println("Argument ON of OFF required");
				System.exit(-1);
		}
	}
}
