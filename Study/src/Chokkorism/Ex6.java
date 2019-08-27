package Chokkorism;
import java.util.*;
public class Ex6 {

	public static void main(String[] args) {
		//소수판별하기
		Scanner scan = new Scanner(System.in);
		/*int a=5; // 소수인지 아닌지 판별할 수
		int i=a-1; //나눌 수, 소수는 2~ a-1까지 나눈 나머지가전부 0이 아닌 것이니까 2부터 시작
		int j=2;   //제수를 저장.
		*/
		
		int a, j = 0, i;

		System.out.print("판별할 숫자 : ");
		a = scan.nextInt();

	/*	
	 * 소수구하기 1
	 * 판별 하고자 하는 정수 a에 2 ~ a-1까지의 수를 나누었을 때 
	 * 모두 0으로 나누어 떨어지지않는다면 그 수는 소수이다.
	 * i = a - 1;
		j = 2;
		while (true) {
			if (j <= i) {
				if (a % j == 0) {
					System.out.println("소수 아님");
					break;
				} else if (a % j != 0) {
					j++;
					System.out.println("j++ : " + j);
				}
			} else {
				System.out.println("소수");
				break;
			}
		}*/
		/*두번째 2부터 a까지 한단계씩 전부 나누어서 
		*처음 0 으로 나누어떨어진수가 a와 같으면 소수,
		*아니면 소수가 아닌 방법 
		*/
		j=2;
		/*while(true) {
			if(j < a ) {
				if(a % j !=0 || a == j) {
					j++;
				}
			}else if(a % j == 0 || a == j){
				System.out.println("소수다.");
				break;
			}
		}*/
		while(a%j !=0) {
			j++;
			/*if(a%j != 0) {
				j++;
			}else if(a == j){
				System.out.println("소수.");
				break;
			}else {
				System.out.println("소수안님");
				break;
			}*/
		}
		if(a ==j) {
			System.out.println("소수");
		}else {
			System.out.println("소수아님");
		}
		
	}

}
