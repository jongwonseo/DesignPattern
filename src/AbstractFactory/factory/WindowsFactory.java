package AbstractFactory.factory;

import AbstractFactory.Button.Button;
import AbstractFactory.Button.WindowsButton;
import AbstractFactory.CheckBox.CheckBox;
import AbstractFactory.CheckBox.WindowsCheckBox;
import AbstractFactory.TextEdit.TextEdit;
import AbstractFactory.TextEdit.WindowsTextEdit;


public class WindowsFactory extends ComponentFactory{

	@Override
	public Button createButton(String caption) {
		return new WindowsButton(caption);
	}

	@Override
	public CheckBox createCheckBox(boolean bChecked) {
		return new WindowsCheckBox(bChecked);
	}

	@Override
	public TextEdit createTextEdit(String value) {
		return new WindowsTextEdit(value);
	}

}
