package AbstractFactory.Button;

public abstract class Button {
	protected String caption;
	
	public Button(String caption) {
		this.caption = caption;
	}
	
	public void clickEvent() {
		System.out.println(caption+" Click!!");
	}
	
	public abstract void render();
}
