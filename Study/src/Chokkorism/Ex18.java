package Chokkorism;
import java.util.*;
public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		int[] b1 = new int[5];
		int[] b2 = new int[5];
		
		int i, c;
		
		i=-1;
		c=1;
		
		do {
			/*
			 * 2진수 5자리를 배열에 입력하고 
			 * 1의 보수로 만들어저  b1에 저장
			 * */
			i++;
			System.out.println("배열에 넣을 수 : ");
			a[i] = sc.nextInt();
			b1[i] = 1 - a[i];
		}while(i < 4);
			System.out.println("1의 보수 구하고 난뒤의 i : "+i);
		/*
		 * 2의 보수 구하기 1
		do {
			b2[i] = b1[i]+c;
			b2[i] = b2[i]%2;
			c = b1[i] * c;
			i--;
		}while(i>=0);
			*/
		
			//2의 보수 구하기 2
		do {
			if(a[i] == 1) {break;}
			b2[i] = a[i];
			i--;
		}while(i >= 0);
		
		b2[i] = a[i];
		System.out.println("i:"+i);
		
		for(int j =i-1; j>=0; j--) {
			b2[j] =1 -a[j];
		}
		
		System.out.print("배열 A (2진수) : ");
		for(int k =0; k < 5; k++) 
			System.out.print(a[k]);
			System.out.println("");
			
		System.out.print("배열 B1 (1의 보수) : ");
		for(int k =0; k < 5; k++) 
			System.out.print(b1[k]);
			System.out.println("");
			
				
		
		System.out.print("배열 B2 (2의 보수) : ");
		for(int k =0; k < 5; k++) 
			System.out.print(b2[k]);
			System.out.println("");
			
		}

	}
