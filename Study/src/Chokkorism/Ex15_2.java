package Chokkorism;
import java.util.*;
public class Ex15_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m, min, max, hap, avg;
		int[] a = new int[7];
		
		m=-1;
		
		do {
			m++;
			System.out.println(m+1+"��° �л��� ���� : ");
			a[m] = sc.nextInt(); 
		}while(m<6);
		
		max =a[0];
		min =a[0];
		hap =a[0];
		
		for(int i =0; i<7; i++) {
			if(max < a[i]) {
				max=a[i];
			}else if(min > a[i]) {
				min = a[i];
			}
			hap += a[i];
		}
		
		hap -= max+min;
		avg = hap/5;
		
		System.out.println("�ְ��� : "+max);
		System.out.println("������ : "+min);
		System.out.println("5�� ���� : "+hap);
		System.out.println("5�� ���: "+avg);
		
	}

}
