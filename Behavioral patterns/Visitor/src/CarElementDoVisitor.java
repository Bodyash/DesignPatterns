
public class CarElementDoVisitor implements CarElementVisitor{

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Kicking the " + wheel.getName());
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Starting the engine");
	}

	@Override
	public void visit(Body body) {
		System.out.println("Moving the body");
	}

	@Override
	public void visit(Car car) {
		System.out.println("Starting the car");
	}

}
