package Chokkorism;
import java.util.*;
public class Ex13 {
//��ó�� �Ǳ�p208 10���� ���� ������ ��ȯ.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	/*	
	 * 2������ ������
	 * int a,b,mok, nmg, cunt;
		int[] c = new int [16];
		
		System.out.print("10���� : ");
		a = sc.nextInt();
		
		b = 1;
		cunt =0;
		while(b<a) {	b*=2;	}
		
		b = b /2; //���⼭ �Է¹��� ������ ������ ����������
		
		do {
			
			mok = a/b;
			nmg = a%b;
			
			c[cunt]=mok;
			
			b/=2;
			
			a = nmg;
			
			cunt++;
			if(b == 1) {
				break;
			}
		}	while(true);
		
		for(int i = 0; i <= cunt; i++ )
		{
			System.out.print(c[i]);
		}*/
	
	int b, c, d, e ,f;
	char a[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	
	System.out.println("��ȯ�� ������ 10���� ���� : ");
	b=sc.nextInt();
	c=sc.nextInt();
	
		d = 1;

		while (d <= c) {
			d *= b;
		}
		while (true) {

			if (d > 1) {
				d /= b;
			}

			e = c / d; // mok
			f = c - e * d; // nmg

			System.out.print(a[e]);

			if (d != 1) {
				c = f;
			} else {
				break;
			}

		}
	}

}
