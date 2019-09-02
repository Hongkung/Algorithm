package day4;

class Car{
	
	String color;
	String gearType;
	int door;
	
	Car(){}
	
	Car(String c, String g, int d){
		
		color = c;
		gearType =g;
		door = d;
		
	}
}
public class Constructior_2 {

	public static void main(String[] args) {
		// TODO 매개변수가 있는 생성자 예제
		/*
		 * 기본 생성자로 인스턴트 생성 후 인스턴스 값을 변경하기보단. 
		 * 매개변수가 있는 생성자로 생성할때 바로 인스턴스 값을 변경해 주는 편이 코드가 간단해진다. 
		 * 
		 * */
		Car car1 = new Car();
		car1.color = "white";
		car1.gearType = "auto";
		car1.door = 4;
		
		Car car2 = new Car("white","auto",2);
	
		System.out.println("car1 color = "+car1.color+ "gearType = "+car1.gearType+"door = "+car1.door);
		System.out.println("car2 color = "+car2.color+ "gearType = "+car2.gearType+"door = "+car2.door);
		
	}

}
