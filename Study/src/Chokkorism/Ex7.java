package Chokkorism;
import java.util.*;
public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
/*      �� ���
		int a;
		int i=2 ,j,sum=2;
		System.out.println("�Ѱ� �� : ");
		a=sc.nextInt();

		while (i <= a) {
			
			j = 2;
			
			while (i%j!=0) {
					j++;
				if (i ==j) {
					sum += i;
					break;
				}
			} // 2��while�� ��
			i++;
		} // main while�� ��
		System.out.println("�Ҽ��� ���� : " + sum);
*/
		
		int a, hap, k, j;
		
		System.out.print("Max : ");
		a= sc.nextInt();
		
		hap=0; k=2;
		
		
		while(true) {
			j=2;//������ 2���� �����ؾߵǴϱ� �ݺ����ȿ��� �ʱ�ȭ �Ѵ�. 
			while(k%j!=0) {j++;}
			
			if(k==j) {hap+=k;}
			
			if(k<a) {
				k++;
			}else {
				System.out.println("Result : "+hap);
				break;
				}		
			}
		}
	
	}
