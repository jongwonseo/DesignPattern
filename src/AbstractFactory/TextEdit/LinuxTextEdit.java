package AbstractFactory.TextEdit;

public class LinuxTextEdit extends TextEdit{

	public LinuxTextEdit(String value) {
		super(value);
	}

	@Override
	public void render() {
		System.out.println("Draw TextEdit: "+ this.value+ " /using Linux Rendering API");
		
	}

}
