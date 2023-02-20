package AbstractFactory.factory;

import AbstractFactory.Button.Button;
import AbstractFactory.CheckBox.CheckBox;
import AbstractFactory.TextEdit.TextEdit;

public abstract class ComponentFactory {
	public abstract Button createButton(String caption);
	public abstract CheckBox createCheckBox(boolean bChecked);
	public abstract TextEdit createTextEdit(String value);
	
}
