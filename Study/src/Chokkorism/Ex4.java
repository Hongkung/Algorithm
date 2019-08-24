package Chokkorism;

public class Ex4 {

	public static void main(String[] args) {
		//팩토리얼 수열 합계
		int i = 1, j = 1, k = 1;
		do {
			i++;
			j *= i;
			/*
			 * 팩토리얼 수열의 합계라고 해서*
			 * 문제에 1!+2!+3!+4!....
			 * 라고 적혀있으니 헷깔림 조심할것
			 * (1*1)+(2*1)+(3*2*1)+(4*3*2*1)....
			 * 이라고만 생각했는대 아니였다.
			 * 증가 수인 i 를 j에 곱해서 누적한 수에 다음번 i의 수를 곱하면
			 * 자연스레 그 증가수의 팩토리얼 값이 나오는것.
			 * 그 결과를 그냥 k에 누적시켜주면 끝.
			 * 복잡하게 중복반복문으로 따로 팩토리얼 계산을 할 필요가 없다. 
			 *  */
			System.out.println(j);
			k += j;
		} while (i < 10);
		System.out.println(k);
	}

}
