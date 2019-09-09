package Chokkorism;
import java.util.*;
public class Ex17 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int[] a = new int[10];
		
		int i,j,k,l,m = 0;
		
		for(i =0; i<=9; i++) {
			System.out.print(i+1+"번째 입력 : ");
			a[i] =sc.nextInt(); 
			}
		
		j = 9;
		
		for(k =1; k <= 9; k++) {
			
			if(a[k] < 7 ) {
				l = 7-a[k];
			}else {
				l = a[k] - 7; 
			}
			
			if(l <= j) {
				j = l;
				m = a[k];
			}
		}
		
		System.out.println(m);
		
	}

}
