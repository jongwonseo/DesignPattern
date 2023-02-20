package AbstractFactory.Main;

import AbstractFactory.Button.Button;
import AbstractFactory.CheckBox.CheckBox;
import AbstractFactory.TextEdit.TextEdit;
import AbstractFactory.factory.ComponentFactory;
import AbstractFactory.factory.LinuxFactory;


public class MainEntry {
	
	public static void main(String[] args) {
		ComponentFactory factory = new LinuxFactory();

		//		ComponentFactory factory = new WindowsFactory();
		
		Button button = factory.createButton("ok");
		CheckBox checkBox = factory.createCheckBox(false);
		TextEdit textEdit = factory.createTextEdit("Design Pattern");
	
		button.render();
		checkBox.render();
		textEdit.render();
	}
}
