package Chokkorism;
import java.util.*;
public class Ex10 {

	public static void main(String[] args) {
		//��� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int[] a=new int[100];
		
		int b,c,d;
		int mok, nmg;
		
		
		System.out.print("����� ���� ���� : ");
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
