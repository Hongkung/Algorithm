package Chokkorism;
import java.util.*;
public class Ex14 {
	//2진수를 10진수로 변환
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, munja;
		double d, e;
		
		System.out.print("변환할 2진수 10자리 : ");
		a = sc.nextLine();
		
		double b = 0;
		
		int c = -1;
		
		while(true) {
			c++;
			if(c <= 9) {
				munja = Character.toString(a.charAt(c));
				/*
				 * charAt()메소드로  해당 위치 문자를 가져온다.
				 * 하지만 그대로 가지고 오면 char형태 이기때문에
				 * Character클래스의 toString()메소드를 사용 문자열로 변환한다.
				 * */
				d = Integer.parseInt(munja);
				/*
				 * C언어의 atoi()대신쓸수 있는 메서드
				 * 문자열(String)형태만인수로 사용가능하다. 
				 * */
				e = d * Math.pow(2, 4-c);//제곱해주는 함수
				
				b += e;
				
			}else {
				System.out.printf("%8.5f",b);
				break;
			}
		}
	}

	

}
