package Decorator;

public class MainEntry {
	public static void main(String[] args) {
		Strings strings = new Strings();
		
		strings.add("Hello~");
		strings.add("My name is jong.");
		strings.add("I am a boy");
		strings.add("Design-pattern is tool.");
		
		//strings.print();
		
		Item decorator = new SideDecorator(strings, '@');
		decorator.print();
		
		Item decorator2 = new LineNumberDecorator(strings);
		decorator2.print();
		
		Item decorator3 = new BoxDecorator(strings);
		decorator3.print();
	}
}
