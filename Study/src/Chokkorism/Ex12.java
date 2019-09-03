package Chokkorism;
import java.util.*;
public class Ex12 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,cunt;
	int mok, nmg;
	int[] c = new int[10];
	
	System.out.print("10진수 정수 : ");
	a = sc.nextInt();
	b = 2;
	cunt = 0;
	
	do {

		mok = a/b;
		
		nmg = a%b;
		
		c[cunt] = nmg;
		
		cunt++;
		
		a = mok;
	}while(mok !=0);
	
		
		for(int i = cunt-1; i>=0; i--) {
			System.out.print(c[i]);
		}
	}

}
