package Chokkorism;

public class Ex5 {

	public static void main(String[] args) {

		int a = 1, b = 1, c = 0, cut = 2, sum = 2;
		do {
			/*피보나치수열의 20번째 항까지의 합계
			 * 카운터와 합계의 시작 초기화값이 2인것을 주목하자
			 * 이미 a , b 가 1번째항, 2번째 항이기 때문에 
			 * 카운터도 2부터 시작하고 합계도 2부터 시작하는것.
			 * */
			c = a + b;
			sum += c;
			a = b;
			b = c;
			cut++;
		} while (cut < 20);
		System.out.println(sum);

	}

}
