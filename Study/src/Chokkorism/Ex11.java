package Chokkorism;
import java.util.*;
public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b,c,d,e,mok = 0,nmg;
		int[] a = new int[100];
		
		System.out.print("���μ� ������ ���� ? ");
		b = sc.nextInt();
		c = -1;
		
		
		while (true) {

			d = 2;
			e = (int) Math.sqrt(b);// ������ ���ϴ� �Լ�

			while (true) {

				if (d > e) {
					d = b;
					break;
				}


			mok = b / d;

			nmg = b - mok * d;
			if (nmg == 0) {
				break;
			} else {
				d++;
			}
			
			} // 2�� �ݺ���
			c++;
			a[c] = d;
			if (b == d) {
				break;
			}
			b = mok;
		} // 1�� �ݺ���

		for(int i = 0; i <=c; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
