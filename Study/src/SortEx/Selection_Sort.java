package SortEx;
import java.util.*;
public class Selection_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Data= new int[10];
		int m, i, j, k, x;
		
		/*
		 * M = �Է¹��� ���� ī����
		 * I = 1�� �ݺ���
		 * J = 2�� �ݺ���
		 * K = 
		 * X = 
		 * */
		
/*		m=-1;
		System.out.print("�迭 �Է� : ");
		do {
			
			m++;
			Data[m] = sc.nextInt(); 
			
		}
		while(m < 9);
	
	
		for(i = 0; i<8; i++) {
			
			for(j = i+1; j<9; j++) {
				
				
				if(Data[i] > Data[j]) {
					k = Data[i];
					Data[i] = Data[j];
					Data[j] = k;
				}
			}
		}//1�ݺ��� ��
		
		for(i =0; i < 9; i++) {
			System.out.print(Data[i]);
		}
 1.
*/	
		
	m=-1;
	
	do {
		m++;
		Data[m] = sc.nextInt();
	}while(m < 9);
	
	i = -1;
	
	do {
		i++;
		j=i;
		do {
			j++;
			if(Data[i]> Data[j]) {
				k = Data[i];
				Data[i] = Data[j];
				Data[j] = k;
			}
		}while(j<9);
	}while(i < 8 );
	
	for(x = 0; x<=9; x++) {
		System.out.print(Data[x]);
		}
	//2.
	}

}
