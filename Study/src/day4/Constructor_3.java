package day4;

class Cars{
	String color;
	String gearType;
	int door;
	
	Cars(){
		/*/생성자 간의 호출에서는 this를 사용한다
		*기본 생성자에서 매개 변수가 있는 생성자를 호출 함으로서
		*인스턴트를 생성 할때는 기본생성자로 해도
		*기본 옵션이 흰색, 오토, 문4개 인 차가 나온다. 
		*
		*/this("white","auto",4);
		
	}
	Cars(String color){
		this(color,"auto",4);
	}
	Cars(String color, String gearType, int door){
		//여기서 this.는 생성자의 매개변수명과 클래스 멤버 변수의 이름이 같기때문에 구분을 위해 붙인다. 
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class Constructor_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
