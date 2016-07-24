
abstract public class Game {
	
	protected int playersCount;
	
	//Abstract methods
	abstract void initializeGame();
	abstract void makePlay(int player);
	abstract boolean endOfGame();
	abstract void pritnWinner();
	
	//Template method
	public final void playOneGame(int playersCount){
		
		this.playersCount = playersCount;
		initializeGame();
		
		int j = 0;
		while(!endOfGame()){
			
			makePlay(j);
			j = (j + 1) % playersCount;
		}
		pritnWinner();
	}
}
