import java.util.concurrent.ForkJoinPool;

public class ActiveObject {
	
	private double val;
	private final ForkJoinPool fj = new ForkJoinPool(1, ForkJoinPool.defaultForkJoinWorkerThreadFactory, null, true);
	
	public void doSomething() throws InterruptedException{	
		fj.execute(() -> val = 1.0); 
	}
	
	public void doSomethingElse() throws InterruptedException{
		fj.execute(() -> val = 2.0);
	}

}
