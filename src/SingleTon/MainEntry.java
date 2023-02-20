package SingleTon;

public class MainEntry {

	public static void main(String[] args) {
		// King king = new King();
		King king1 = King.getInstance();
		King king2 = King.getInstance();
		
		king1.say();
		king2.say();
	

	}

}
