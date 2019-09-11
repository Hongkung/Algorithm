package SortEx;
import java.util.*;

public class Bubble_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[10];
		int n,i,j,k;
		
/*		System.out.print("배열 입력 : ");
		for(i = 0; i<=9; i++) {
			data[i] = sc.nextInt();
		}
		n = 9;
		for(i = 0; i <= 9; i++) {
			
			for(j=0; j<n-i; j++) {
				
				if(data[j] > data[j+1]) {
					k = data[j];
					data[j] = data[j+1];
					data[j+1] = k;
				} 
			}
			
		}
		
		for(i =0; i<=9; i++) {
			System.out.print(data[i]);
		}
*/
		System.out.println("배열 입력 : ");
		n= -1;
		
		do {
			n++;
			data[n] = sc.nextInt();
		}while(n < 9);
		
		i = -1;
		
		do {
			i++;
			j = -1;
			do {
				j++;
				if(data[j] > data [j+1]) {
				k = data[j];
				data[j] = data[j+1];
				data[j+1] = k; 
				}
				 
			}while(j < 8-i);// do,while문은 8번 돌고 한번더돈다
		}while(i < 8);
	
	
	for(int x = 0; x <= 9; x++) {
		System.out.print(data[x]);
		}
	}
}
