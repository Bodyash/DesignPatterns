public final class Module {
	
	private static Module singleton = null;
	
	public Module(){}
	
	public static Module getSingleton(){
		
		if(Module.singleton == null)
			Module.singleton = new Module();
		
		return Module.singleton;
	}
	
	public void printNewLine(){
		System.out.println();
	}
	
	public void printString(String s){
		System.out.println(s);
	}
	
	public void printInt(int n){
		System.out.println(n);
	}
	
	public void printBoolean(boolean b){
		System.out.println(b);
	}
	
	public void scanNewLine(){}
	
	public void scanString(String s){}
	
	public void scanInt(int n){}
	
	public void scanBoolean(boolean b){}
	
}
