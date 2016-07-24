
public class Car implements CarElement{
	
	public CarElement[] elements;
	
	public Car(){
		
		this.elements = new CarElement[]{
				
				new Wheel("Front left"),
				new Wheel("Front right"),
				new Wheel("Back left"),
				new Wheel("Back right"),
				new Body(),
				new Engine(),
		};
	}
	
	@Override
	public void accept(CarElementVisitor visitor) {
		
		for(CarElement e : elements){
			e.accept(visitor);
		}
		visitor.visit(this);
	}

}
