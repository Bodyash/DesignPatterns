
public class Main {

	public static Module console;
	
	public static void main(String[] args) {
		
		prepare();
		execute(args);
	}
	
	public static void prepare(){
		
		console = Module.getSingleton();
	}
	
	public static void unprepare(){
		
		console = null;
	}
	
	public static void execute(String[] args){
		
		console.printString("Hello from Module class!");
		console.printNewLine();
		console.scanNewLine();
	}

}
