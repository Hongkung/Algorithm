package Chokkorism;
import java.util.*;
public class Ex10 {

	public static void main(String[] args) {
		//약수 구하기
		Scanner sc = new Scanner(System.in);
		int[] a=new int[100];
		
		int b,c,d;
		int mok, nmg;
		
		
		System.out.print("약수를 구할 정수 : ");
		b = sc.nextInt();
		
		c =0;
		//d =0;
		d=-1;
		while(c < b) {
			
			c++;
			mok = b/c;
			nmg = b%c;
			
			if(nmg == 0) {
				d++;
				//a[d-1] = c;
				a[d]=c;
			}
			
			
		}
		
		for(int i=0; i <=d; i++) {
			System.out.println(a[i]);
		}
		
	}

}
