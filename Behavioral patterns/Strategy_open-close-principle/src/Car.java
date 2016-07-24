
public abstract class Car {
	
	protected IBrakeBehavior brakeBehavior;
	
	public void applyBrake(){
		brakeBehavior.brake();
	}
	
	public void setBrakeBehavior(IBrakeBehavior brakeType){
		this.brakeBehavior = brakeType;
	}
	
}
