package Chokkorism;

import java.util.*;

public class Ex9 {

	public static void main(String[] args) {
		// 최소공배수, 최대 공약수 구하기

		Scanner sc = new Scanner(System.in);

		int a, b;//각각 정수를 입력 받는 변수
		int big, small;//입력 받은 정수 중 큰수와 작은수를 저장하는 변수
		int mok; //큰수를 작은수로 나눈 몫
		int nmg; //큰 수를 작은 수로 나누었을때 나머지
		int gcm, lcm; // 최대 공약수, 최소 공배수가 저장될 변수
		
		System.out.print("두 가지 정수 입력 : ");
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
			System.out.println("최대공약수 : "+gcm);
			System.out.println("최대공배수 : "+lcm);
			
			break;
		}
		
			
			big = small;
			small = nmg;
			
			
		}
		
	}

}
