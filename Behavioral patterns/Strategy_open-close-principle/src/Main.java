
public class Main {

	public static void main(String[] args) {
		
		Car sedanCar = new Sedan(); //Simple brake by default
		sedanCar.applyBrake(); //Using simple brake
		
		Car suvCar = new SUV(); //ABS Brake by default
		suvCar.applyBrake(); // ABS Brake
		
		suvCar.setBrakeBehavior(new Brake()); //Set to simple brake
		suvCar.applyBrake(); //Using simple brake
	}

}
