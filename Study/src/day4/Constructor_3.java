package day4;

class Cars{
	String color;
	String gearType;
	int door;
	
	Cars(){
		/*/������ ���� ȣ�⿡���� this�� ����Ѵ�
		*�⺻ �����ڿ��� �Ű� ������ �ִ� �����ڸ� ȣ�� �����μ�
		*�ν���Ʈ�� ���� �Ҷ��� �⺻�����ڷ� �ص�
		*�⺻ �ɼ��� ���, ����, ��4�� �� ���� ���´�. 
		*
		*/this("white","auto",4);
		
	}
	Cars(String color){
		this(color,"auto",4);
	}
	Cars(String color, String gearType, int door){
		//���⼭ this.�� �������� �Ű�������� Ŭ���� ��� ������ �̸��� ���⶧���� ������ ���� ���δ�. 
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
