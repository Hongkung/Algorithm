package Chokkorism;

import java.util.*;

public class Ex9 {

	public static void main(String[] args) {
		// �ּҰ����, �ִ� ����� ���ϱ�

		Scanner sc = new Scanner(System.in);

		int a, b;//���� ������ �Է� �޴� ����
		int big, small;//�Է� ���� ���� �� ū���� �������� �����ϴ� ����
		int mok; //ū���� �������� ���� ��
		int nmg; //ū ���� ���� ���� ���������� ������
		int gcm, lcm; // �ִ� �����, �ּ� ������� ����� ����
		
		System.out.print("�� ���� ���� �Է� : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a <= b) {small = a;	big  = b;}
		else {big = a;	small = b;}
		
		while(true) {
		
		mok = big / small;

		nmg = big % small;
		
		if(nmg == 0) {
			gcm = small;
			lcm = (a*b)/gcm;
			System.out.println("�ִ����� : "+gcm);
			System.out.println("�ִ����� : "+lcm);
			
			break;
		}
		
			
			big = small;
			small = nmg;
			
			
		}
		
	}

}
