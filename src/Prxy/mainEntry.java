package Prxy;

public class mainEntry {

	public static void main(String[] args) {
		//Display  display= new ScreenDisplay();
		Display  display= new BufferDisplay(5);
		
		display.print("hello");
		display.print("hello");
		display.print("hello");
		display.print("hello");
		display.print("hello");
		display.print("qwqwqw");
		display.print("asdasdasdasd");
		
		
		((BufferDisplay)display).flush();
		
	}

}
