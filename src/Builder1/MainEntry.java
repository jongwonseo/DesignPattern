package Builder1;

public class MainEntry {

	public static void main(String[] args) {
		Car car1 = new Car("V7", true, "Black", true, false);
		
		
		// Car builder로 구현(Method Chaining)
		Car car2 = new CarBuilder()
				.setAEB(false)
				.setAirbag(false)
				.setCameraSensor(true)
				.setColor("White")
				.setEngine("V9")
				.build();
		
		CarBuilder builder = new CarBuilder()
				.setAEB(false)
				//.setAirbag(false)
				.setCameraSensor(true)
				.setColor("White")
				.setEngine("V9");
				//build();
		
		// 객체의 생성을 늦출 수 있음(에어백 늦게 만듬)
		Car car3 = builder
				.setAirbag(true)
				.build();

	
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
	}
	

}
