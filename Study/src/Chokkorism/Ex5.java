package Chokkorism;

public class Ex5 {

	public static void main(String[] args) {

		/*int a = 1, b = 1, c = 0, cut = 2, sum = 2;
		do {
			피보나치수열의 20번째 항까지의 합계
			 * 카운터와 합계의 시작 초기화값이 2인것을 주목하자
			 * 이미 a , b 가 1번째항, 2번째 항이기 때문에 
			 * 카운터도 2부터 시작하고 합계도 2부터 시작하는것.
			 * 
			c = a + b;
			sum += c;
			a = b;
			b = c;
			cut++;
		} while (cut < 20);
		System.out.println(sum);
		 */
		int a=1 ,b=1;
		int sum, cut, c;
		/*피보나치의 수열은 1 1 2 3 5 8 13...순서기때문에 1번항, 2번항은 1로 정해져있다
		 * 그래서 a,b 는 1로 시작하느것. 
		 * 그리고 합인 sum은 1과 1을 더한 2로 시작을 한다. 
		 * 카운터의 경우 이미 2번째 항까지 계산을 하고 시작하기 때문에 
		 * 카운터 역시 2로 시작하는것.
		 */
		sum = 2;
		cut = 2;
		while (true) {
			c = a + b;
			sum += c;

			cut++;
			if (cut < 20) {
				a = b;
				b = c;
			} else {
				System.out.println("합계: " + sum);
				break;
			}
		}
	}

}
