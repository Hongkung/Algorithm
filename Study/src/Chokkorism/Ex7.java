package Chokkorism;
import java.util.*;
public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
/*      내 방법
		int a;
		int i=2 ,j,sum=2;
		System.out.println("한계 수 : ");
		a=sc.nextInt();

		while (i <= a) {
			
			j = 2;
			
			while (i%j!=0) {
					j++;
				if (i ==j) {
					sum += i;
					break;
				}
			} // 2차while의 끝
			i++;
		} // main while의 끝
		System.out.println("소수의 총합 : " + sum);
*/
		
		int a, hap, k, j;
		
		System.out.print("Max : ");
		a= sc.nextInt();
		
		hap=0; k=2;
		
		
		while(true) {
			j=2;//언제나 2부터 시작해야되니까 반복문안에서 초기화 한다. 
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
