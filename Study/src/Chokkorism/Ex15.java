package Chokkorism;
import java.util.*;
public class Ex15 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int i, j, max;
		int[] a = new int[10];
		
		j =-1; max =0;
		do {
			j++;
			System.out.println(j+1+"번째 정수 입력 : ");
			
			a[j] = sc.nextInt();
			
			
			
		}while(j < 9);
		
		for(i = 0; i < a.length; i++) {
			if(max < a[i]) {
			max = a[i];
			}
		}
		System.out.println("MAX : "+max);
	}

}
