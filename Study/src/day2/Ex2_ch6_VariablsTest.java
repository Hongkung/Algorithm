package day2;

class Card{
	//�ν��Ͻ�����
	String kind;
	int number;
	//Ŭ��������
	static int width = 100;
	static int height = 250;
	
}
public class Ex2_ch6_VariablsTest {
	public static void main(String[] args) {
		System.out.println("Card.whith ="+Card.width);
		System.out.println("Card.height ="+Card.height);
		//Ŭ���������� ��ü �������� ����� �����ϴ�. 
		
		// c1�̶�� ī�带 �����ϰ� �Ӽ��� �ν��Ͻ������� �����Ѵ�. 
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spede";
		c2.number = 4;
		
		System.out.println("C1�� "+c1.kind+","+c1.number+"�̰� ũ��� ("+c1.width +", "+
								c1.height+" )");
		System.out.println("C2�� "+c2.kind+","+c2.number+"�̰� ũ��� ("+c2.width +", "+
				c2.height+" )");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("C1�� "+c1.kind+","+c1.number+"�̰� ũ��� ("+c1.width +", "+
				c1.height+" )");
		System.out.println("C2�� "+c2.kind+","+c2.number+"�̰� ũ��� ("+c2.width +", "+
				c2.height+" )");
		


	}
}
