package AbstractFactory.TextEdit;

public class WindowsTextEdit extends TextEdit {

	public WindowsTextEdit(String value) {
		super(value);
	}

	@Override
	public void render() {
		System.out.println("Draw TextEdit: "+ this.value+ " /using Windows Rendering API");

	}

}
