package Chokkorism;
import java.util.*;
public class Ex14 {
	//2������ 10������ ��ȯ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, munja;
		double d, e;
		
		System.out.print("��ȯ�� 2���� 10�ڸ� : ");
		a = sc.nextLine();
		
		double b = 0;
		
		int c = -1;
		
		while(true) {
			c++;
			if(c <= 9) {
				munja = Character.toString(a.charAt(c));
				/*
				 * charAt()�޼ҵ��  �ش� ��ġ ���ڸ� �����´�.
				 * ������ �״�� ������ ���� char���� �̱⶧����
				 * CharacterŬ������ toString()�޼ҵ带 ��� ���ڿ��� ��ȯ�Ѵ�.
				 * */
				d = Integer.parseInt(munja);
				/*
				 * C����� atoi()��ž��� �ִ� �޼���
				 * ���ڿ�(String)���¸��μ��� ��밡���ϴ�. 
				 * */
				e = d * Math.pow(2, 4-c);//�������ִ� �Լ�
				
				b += e;
				
			}else {
				System.out.printf("%8.5f",b);
				break;
			}
		}
	}

	

}
