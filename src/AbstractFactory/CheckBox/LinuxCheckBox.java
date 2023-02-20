package AbstractFactory.CheckBox;

public class LinuxCheckBox extends CheckBox{

	public LinuxCheckBox(boolean bChecked) {
		super(bChecked);
	}

	@Override
	public void render() {
		System.out.println("Draw checkbox: "+ this.bChecked+ " /using Linux Rendering API");
		
	}

}
