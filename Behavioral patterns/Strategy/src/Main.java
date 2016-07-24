
public class Main {

	public static void main(String[] args) {
		
		Customer firstCustomer = new Customer(new NormalStrategy());
		firstCustomer.add(1.0, 1);
		
		firstCustomer.setStrategy(new HappyHourStrategy());
		firstCustomer.add(1.0, 2);
		
		//Another customer
		Customer secondCustomer = new Customer(new HappyHourStrategy());
		secondCustomer.add(0.8, 1);
		
		//Printing bill for first customer
		firstCustomer.printBill();
		
		//End of happy hour
		secondCustomer.setStrategy(new NormalStrategy());
		secondCustomer.add(1.3, 2);
		secondCustomer.add(2.5, 1);
		//Finally print out the second's customer bill
		secondCustomer.printBill();
	}
	
}
