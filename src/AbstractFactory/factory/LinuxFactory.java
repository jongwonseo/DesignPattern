package AbstractFactory.factory;


import AbstractFactory.Button.Button;
import AbstractFactory.Button.LinuxButton;
import AbstractFactory.CheckBox.CheckBox;
import AbstractFactory.CheckBox.LinuxCheckBox;
import AbstractFactory.TextEdit.LinuxTextEdit;
import AbstractFactory.TextEdit.TextEdit;



public class LinuxFactory extends ComponentFactory {

	@Override
	public Button createButton(String caption) {
		return new LinuxButton(caption);
	}

	@Override
	public CheckBox createCheckBox(boolean bChecked) {
		return new LinuxCheckBox(bChecked);
	}

	@Override
	public TextEdit createTextEdit(String value) {
		return new LinuxTextEdit(value);
	}

}
