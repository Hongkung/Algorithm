package Chokkorism;
import java.util.*;
public class Ex13 {
//정처기 실기p208 10진수 임의 진수로 변환.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	/*	
	 * 2진수만 가능함
	 * int a,b,mok, nmg, cunt;
		int[] c = new int [16];
		
		System.out.print("10진수 : ");
		a = sc.nextInt();
		
		b = 1;
		cunt =0;
		while(b<a) {	b*=2;	}
		
		b = b /2; //여기서 입력받은 정수의 누승이 구해진상태
		
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
	
	System.out.println("변환할 진수와 10진수 정수 : ");
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
