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
	//class�� ��ü�� ���
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1�� ä���� "+t1.channel+"�Դϴ�. ");
		System.out.println("t2�� ä���� "+t2.channel+"�Դϴ�. ");
		
		t2 = t1;
		
		t1.channel = 7;
		System.out.println("t1�� ä���� "+t1.channel+"�� �����Ͽ����ϴ�. ");
		System.out.println("t1�� ä���� "+t1.channel+"�Դϴ�. ");
		System.out.println("t2�� ä���� "+t2.channel+"�Դϴ�. ");
*/	
		//////////////////////////////////////////////////////////////////////	

	//��ü �迭
		Tv[] tvArr = new Tv[3];//���̰� 3�� ��ü�迭 �����δ� TvŸ���� ���������� �迭�� ������������̴�. 
		//���������� ��ü�� ����� ������
		for(int i=0; i<3; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; //�� ��ü�� ä���� ����
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d]�� ä���� %d�Դϴ�.\n",i,tvArr[i].channel);
		}
	}
}
