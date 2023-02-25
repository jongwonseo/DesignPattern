package Mediator;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		SmartHome home = new SmartHome();
		
		Scanner scanner = new Scanner(System.in);
		do {
			home.report();
			
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
			System.out.println("6");
			System.out.println("7");
			System.out.println("8");
			
			System.out.print("command: ");
			int i = scanner.nextInt();
			
			
			if(i==1) home.door.open();
			else if(i==2) home.door.close();
			else if(i==3) home.window.open();
			else if(i==4) home.window.close();
			else if(i==5) home.aircon.on();
			else if(i==6) home.aircon.off();
			else if(i==7) home.boiler.on();
			else if(i==8) home.boiler.off();
			
		}while(true);


	}

}
