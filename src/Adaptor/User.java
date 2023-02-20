package Adaptor;

import java.util.ArrayList;

public class User {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog("DDD"));
		animals.add(new Cat("CCC"));
		animals.add(new Dog("QWQW"));
		animals.add(new TigerAdapter("TTTT"));

		for(Animal animal : animals) {
			animal.sound();
			
		}

	}

}
