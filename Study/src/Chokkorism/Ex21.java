package Chokkorism;
import java.util.*;
public class Ex21 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] x = new int[10];
	int[] y = new int[10];
	int[] a = new int[10];
	
	int z, c, j;
	System.out.println("X : ");
	for(int i = 0; i <= 9; i++) {
		
		x[i] = sc.nextInt();
	}
	
	System.out.println("Y : ");
	for(int i = 0; i <= 9; i++) {
		y[i] = sc.nextInt();
	}
	
	z=0;//자리올림수 발생여부 판단
	c=0;//자리올림수 저장
	j=9;//배열 위치 지정
	do {
		System.out.println("AAAA");
		 z = x[j] + y [j] + c;
		 if(z < 2) {
			 c = 0;
			 a[j] = z;
		 }else {
			 c = 1;
			 a[j] = z-2;
		 }
		 j--;
	}while(j >= 0);
	
	if(c == 0 ) {
		System.out.println("결과 : ");
		do {
			j++;
			System.out.print(a[j]);
		}while(j<9);
		
		}
	else {
		System.out.println("OVERFLOW!!");
	}
	}

}
