package day4;


class Data1 {
	int value;
	
	/*Data1(){
		�⺻ ������(default constructor)
		����ڰ� ���� �������� ������ �����Ϸ��� �ڵ������Ѵ�. 
	}*/
	}

class Data2{
	int value;
	/*
	 * ���� �����ڸ� �����ϸ� �����Ϸ��� �ڵ����� �⺻ �����ڸ� ������ �ʴ´�. 
	 * �׷��� �ٸ������� �ν���Ʈ�� ���� ��� �⺻ �����ڷ� ����� �翬�� ��������
	 * �ƴϸ� �⺻�����ڵ� ����ڰ� �ϳ� �������ָ� �ȴ�. 
	 * �׷��� �ν���Ʈ�� ���鶧 �⺻ ������, �Ű������� �ִ� ������ ������̵� ������ִ�. 
	 * */
	Data2(){}
	Data2(int x){	//�Ű������� �ִ� ������
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
