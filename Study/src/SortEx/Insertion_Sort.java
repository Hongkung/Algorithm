package SortEx;
import java.util.*;
public class Insertion_Sort {
//��������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int key, j, i, k;
		/*���������� �ι�° �ڷ���� ���� �� ���� Ű�� �ؼ� ����
		������ �����ϴ� �����̴�. 
		*/
///////////////////////////////////////////	
	/*	
		System.out.print("INPUT : ");
		for(i =0; i <= 4; i++) {
			a[i] = sc.nextInt();
		}//�迭�� ���� �޾� �����Ѵ�.
		
		for(i = 1; i <= 4; i++) {
			key = a[i];
			//
			for(j = i-1; j >= 0 ; j--) {
				if(a[j] > key) {
					k = a[j];
					a[j] = key;
					a[j+1] = k; 		
				}
			}
		}
		for(i = 0; i <= 4; i++) {
			System.out.print(a[i]);
		}
	*/
///////////////////////////////////////////////////		
	
		System.out.print("INPUT : ");
		for(i = 0; i<=4; i++) {
			a[i] = sc.nextInt();
		}
		
		i =1;
		
		do {
			
			key = a[i];
			k = i-1;
			do {
				if(key < a[k]) {
					a[k+1] =a[k];
					k--;
				}else {
					break;
				}
			}while(k >= 0);
			
			a[k+1] =key;
			i++;
		}while(i <= 4);
		
		for(i =0; i<=4; i++) {
			System.out.print(a[i]);
		}
	}

}
