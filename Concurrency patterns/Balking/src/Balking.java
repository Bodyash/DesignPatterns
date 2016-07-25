
public class Balking {
	
	private boolean jobInProgress = false;
	
	public void job(){
		
		synchronized(this){
			
			if(jobInProgress)
				return;
			
			jobInProgress = true;
		}
	}
	
	public void jobCompleted(){
		
		synchronized(this){
			jobInProgress = false;
		}
	}
	
}
