package AbstractFactory.Button;

public class LinuxButton extends Button{

	public LinuxButton(String caption) {
		super(caption);
	}

	@Override
	public void render() {
		System.out.println("draw picture: "+caption + " /using Linux Rendering");
	}

}
