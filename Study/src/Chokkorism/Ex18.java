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
			 * 2���� 5�ڸ��� �迭�� �Է��ϰ� 
			 * 1�� ������ �������  b1�� ����
			 * */
			i++;
			System.out.println("�迭�� ���� �� : ");
			a[i] = sc.nextInt();
			b1[i] = 1 - a[i];
		}while(i < 4);
			System.out.println("1�� ���� ���ϰ� ������ i : "+i);
		/*
		 * 2�� ���� ���ϱ� 1
		do {
			b2[i] = b1[i]+c;
			b2[i] = b2[i]%2;
			c = b1[i] * c;
			i--;
		}while(i>=0);
			*/
		
			//2�� ���� ���ϱ� 2
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
		
		System.out.print("�迭 A (2����) : ");
		for(int k =0; k < 5; k++) 
			System.out.print(a[k]);
			System.out.println("");
			
		System.out.print("�迭 B1 (1�� ����) : ");
		for(int k =0; k < 5; k++) 
			System.out.print(b1[k]);
			System.out.println("");
			
				
		
		System.out.print("�迭 B2 (2�� ����) : ");
		for(int k =0; k < 5; k++) 
			System.out.print(b2[k]);
			System.out.println("");
			
		}

	}
