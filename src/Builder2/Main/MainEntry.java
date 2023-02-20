package Builder2.Main;

import Builder2.Builder.Builder;
import Builder2.Builder.JSONBuilder;
import Builder2.Builder.PlainTextBuilder;
import Builder2.Data.Data;
import Builder2.Director.Director;


public class MainEntry {
	public static void main(String[] args) {
		Data data = new Data("Jane", 25);
		
		Builder builder = new PlainTextBuilder(data);
		Director director = new Director(builder);
		String result = director.build();
		
		System.out.println(result);
		
		builder = new JSONBuilder(data);
		director = new Director(builder);
		result = director.build();
		
		System.out.println(result);
		
	}
}
