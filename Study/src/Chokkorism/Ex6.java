package Chokkorism;
import java.util.*;
public class Ex6 {

	public static void main(String[] args) {
		//�Ҽ��Ǻ��ϱ�
		Scanner scan = new Scanner(System.in);
		/*int a=5; // �Ҽ����� �ƴ��� �Ǻ��� ��
		int i=a-1; //���� ��, �Ҽ��� 2~ a-1���� ���� ������������ 0�� �ƴ� ���̴ϱ� 2���� ����
		int j=2;   //������ ����.
		*/
		
		int a, j = 0, i;

		System.out.print("�Ǻ��� ���� : ");
		a = scan.nextInt();

	/*	
	 * �Ҽ����ϱ� 1
	 * �Ǻ� �ϰ��� �ϴ� ���� a�� 2 ~ a-1������ ���� �������� �� 
	 * ��� 0���� ������ ���������ʴ´ٸ� �� ���� �Ҽ��̴�.
	 * i = a - 1;
		j = 2;
		while (true) {
			if (j <= i) {
				if (a % j == 0) {
					System.out.println("�Ҽ� �ƴ�");
					break;
				} else if (a % j != 0) {
					j++;
					System.out.println("j++ : " + j);
				}
			} else {
				System.out.println("�Ҽ�");
				break;
			}
		}*/
		/*�ι�° 2���� a���� �Ѵܰ辿 ���� ����� 
		*ó�� 0 ���� ������������� a�� ������ �Ҽ�,
		*�ƴϸ� �Ҽ��� �ƴ� ��� 
		*/
		j=2;
		/*while(true) {
			if(j < a ) {
				if(a % j !=0 || a == j) {
					j++;
				}
			}else if(a % j == 0 || a == j){
				System.out.println("�Ҽ���.");
				break;
			}
		}*/
		while(a%j !=0) {
			j++;
			/*if(a%j != 0) {
				j++;
			}else if(a == j){
				System.out.println("�Ҽ�.");
				break;
			}else {
				System.out.println("�Ҽ��ȴ�");
				break;
			}*/
		}
		if(a ==j) {
			System.out.println("�Ҽ�");
		}else {
			System.out.println("�Ҽ��ƴ�");
		}
		
	}

}
