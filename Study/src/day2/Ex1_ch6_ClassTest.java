package day2;

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power=!power;}
	void channelUp()	{++channel;}
	void channelDown()	{--channel;}
}


public class Ex1_ch6_ClassTest {
	public static void main(String[] args) {
/*	
	//class와 객체의 사용
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 채널은 "+t1.channel+"입니다. ");
		System.out.println("t2의 채널은 "+t2.channel+"입니다. ");
		
		t2 = t1;
		
		t1.channel = 7;
		System.out.println("t1의 채널을 "+t1.channel+"로 변경하였습니다. ");
		System.out.println("t1의 채널은 "+t1.channel+"입니다. ");
		System.out.println("t2의 채널은 "+t2.channel+"입니다. ");
*/	
		//////////////////////////////////////////////////////////////////////	

	//객체 배열
		Tv[] tvArr = new Tv[3];//길이가 3인 객체배열 실제로는 Tv타입인 참조변수의 배열이 만들어졌을뿐이다. 
		//참조변수에 객체를 만들어 저장함
		for(int i=0; i<3; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; //각 객체의 채널을 변경
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d]의 채널은 %d입니다.\n",i,tvArr[i].channel);
		}
	}
}
