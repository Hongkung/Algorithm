package Chokkorism;
import java.util.*;
public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b,c,d,e,mok = 0,nmg;
		int[] a = new int[100];
		
		System.out.print("소인수 분해할 수는 ? ");
		b = sc.nextInt();
		c = -1;
		
		
		while (true) {

			d = 2;
			e = (int) Math.sqrt(b);// 제곱근 구하는 함수

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
			
			} // 2번 반복문
			c++;
			a[c] = d;
			if (b == d) {
				break;
			}
			b = mok;
		} // 1번 반복문

		for(int i = 0; i <=c; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
