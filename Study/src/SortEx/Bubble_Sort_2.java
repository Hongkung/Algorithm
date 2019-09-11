package SortEx;
import java.util.*;

public class Bubble_Sort_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		int n,i,j,sw,cnt,k;
/*		
		n = -1;
		System.out.print("INPUT : ");
		do {
			n++;
			data[n] = sc.nextInt();
		}while(n < 4);
		
		cnt =0;
		
		for(i =0; i <= 4; i++) {
			sw =0;
			for(j =0; j< 4-i; j++) {
				if(data[j] > data[j+1]) {
				k = data[j];
				data[j] = data[j+1];
				data[j+1] = k;
				cnt++;
				sw =1;
				}
			}//j for
			if(sw == 0) {
				break;
			}	
		}
		System.out.println("CNT : "+ cnt);
		
		for(int x = 0; x <= 4; x++) {
			System.out.print(data[x]);
		}
	//중간종료방식
*/
		
		int shift=0, left, right, buf;
		
		System.out.print("INPUT : ");
		for(i =0; i <= 4; i++) {
			data[i] = sc.nextInt();
		}
		n= 4;
		left = 0;
		right = n;
		
		while(left < right) {
			
			for(i = left; i <= right -1; i++) {
				if(data[i] > data[i+1]) {
					buf = data[i];
					data[i] = data[i+1];
					data[i+1] = buf;
					shift = i;
				}
			}//왼쪽에서 오른쪽으로 정렬
			
			right = shift;
			
			for(i = right; i >= left+1; i--) {
				if(data[i-1] > data[i]) {
					buf = data[i-1];
					data[i-1] = data[i];
					data[i] = buf;
					shift = i;
				}
			}
			left = shift;
		}
		
		for(int x =0; x<=4; x++)
		System.out.print(data[x]);
		
		
		}

}
