
public class MoveServant {
	
	public void moveTo(Movable serviced, Position where){
		
		serviced.setPosition(where);
	}
	
	public void moveBy(Movable serviced, int dx, int dy){
		
		dx += serviced.getPosition().xPosition;
		dy += serviced.getPosition().yPosition;
		serviced.setPosition(new Position(dx, dy));
	}
}
