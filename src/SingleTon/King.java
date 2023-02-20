package SingleTon;

public class King {
	private King() {}
	
	private static King singleton = null;
	
	public synchronized static King getInstance() {
		if(singleton==null) {
			singleton = new King();
		}
		return singleton;
	}
	
	public void say() {
		System.out.println("I am only one...");
	}
}
