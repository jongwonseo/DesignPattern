package AbstractFactory.CheckBox;

public class WindowsCheckBox extends CheckBox{

	public WindowsCheckBox(boolean bChecked) {
		super(bChecked);
	}

	@Override
	public void render() {
		System.out.println("Draw checkbox: "+ this.bChecked+ " /using Windows Rendering API");
		
	}

}
