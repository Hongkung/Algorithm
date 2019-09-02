package day4;


class Data1 {
	int value;
	
	/*Data1(){
		기본 생성자(default constructor)
		사용자가 따로 선언하지 않으면 컴파일러가 자동생성한다. 
	}*/
	}

class Data2{
	int value;
	/*
	 * 따로 생성자를 선언하면 컴파일러는 자동으로 기본 생성자를 만들지 않는다. 
	 * 그래서 다른곳에서 인스턴트를 만들 경우 기본 생성자로 만들면 당연히 에러난다
	 * 아니면 기본생성자도 사용자가 하나 선언해주면 된다. 
	 * 그러면 인스턴트를 만들때 기본 생성자, 매개변수가 있는 생성자 어느쪽이든 만들수있다. 
	 * */
	Data2(){}
	Data2(int x){	//매개변수가 있는 생성자
		value = x;
		
	}
}
public class Constructor_1 {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		
		Data2 d2 = new Data2();
			
		Data2 d2_ = new Data2(10);
	}

}
