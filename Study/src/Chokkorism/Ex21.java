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
	
	z=0;//�ڸ��ø��� �߻����� �Ǵ�
	c=0;//�ڸ��ø��� ����
	j=9;//�迭 ��ġ ����
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
		System.out.println("��� : ");
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
