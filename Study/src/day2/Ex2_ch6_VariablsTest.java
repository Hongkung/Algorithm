package day2;

class Card{
	//인스턴스변수
	String kind;
	int number;
	//클래스변수
	static int width = 100;
	static int height = 250;
	
}
public class Ex2_ch6_VariablsTest {
	public static void main(String[] args) {
		System.out.println("Card.whith ="+Card.width);
		System.out.println("Card.height ="+Card.height);
		//클래스변수는 객체 생성없이 사용이 가능하다. 
		
		// c1이라는 카드를 생성하고 속성을 인스턴스변수에 지정한다. 
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spede";
		c2.number = 4;
		
		System.out.println("C1은 "+c1.kind+","+c1.number+"이고 크기는 ("+c1.width +", "+
								c1.height+" )");
		System.out.println("C2는 "+c2.kind+","+c2.number+"이고 크기는 ("+c2.width +", "+
				c2.height+" )");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("C1은 "+c1.kind+","+c1.number+"이고 크기는 ("+c1.width +", "+
				c1.height+" )");
		System.out.println("C2는 "+c2.kind+","+c2.number+"이고 크기는 ("+c2.width +", "+
				c2.height+" )");
		


	}
}
