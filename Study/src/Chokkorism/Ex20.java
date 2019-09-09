package Chokkorism;
import java.util.*;
public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, j, mok , nmg;
		int[] a= new int[12], b = new int[14];
		
		while(true) {
		for(i =0; i<=11; i++) 
			a[i] = sc.nextInt();
		
		
		if(a[0] == 0) {
			break;
		}else {
			for(i =0; i<=11; i ++) {
				b[i+2] = b[i+2] + a[i];
			}
		}
		
		
		}// 배열	채우는 1번째 반복문
		
		for(i = 13; i>=1; i--) {
			mok = (int)b[i]/10;
			//nmg = (int)b[i]%10;
			nmg = b[i] - mok*10;
			b[i]  = nmg;
			b[i-1] += mok;
		}
		
		if(b[0]==0) {
			j =1;
		}else {
			j=0;
		}
		
		for(i = j; i<=13; i++) {
			System.out.print(b[i]);
		}
		
	}

}
