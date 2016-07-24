
public class Ellipse implements Movable{
	
	private Position p;

	@Override
	public void setPosition(Position p) {
		this.p = p;
	}

	@Override
	public Position getPosition() {
		return this.p;
	}
}
