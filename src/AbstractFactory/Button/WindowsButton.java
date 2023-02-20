package AbstractFactory.Button;

public class WindowsButton extends Button{

	public WindowsButton(String caption) {
		super(caption);
	}
	
	@Override
	public void render() {
		System.out.println("draw picture: "+caption + " /using Windows Rendering");
		
	}
	
}
