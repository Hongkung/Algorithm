package Chokkorism;

public class Ex3 {

	public static void main(String[] args) {
		//1+2+4+7+11+16......로증가하는 수열의 20번째 항까지의 합
		
		int i,j=1,k=0;
		//i - 1씩 늘어나면서 j와 더한다. 
		//j - 1로 고정, 1씩 늘어나는 i와의 합을 누적한다.(그래서 위와같은 수열이 나옴)
		//k - 수열의 값을 다 더하는 변수
		
		for (i = 0; i < 20; i++) {
		//i<20인 이유는 0~19 까지가 20번이기때문에 0~20 이 아니라 19까지이다. 
			
			j += i;
			System.out.println(j);
			k += j;
		}
		
		i = 0;
		j = 1;
		k = 1;

		do {
			i++;
			j += i;
			System.out.println(j);
			k += j;
		} while (i < 19);
		//do~while 문이기 때문에 0~19 까지 돈다 제대로 20회 반복후 조건에 의해 빠져나감.
		/*위의 for문으로 푼 수열은 k=0, while 문으로 푼것은 k=1이다
		 * 어디가 다른 것인가?
		 * 일단 결과값 k는 같다. 
		 * 하지만 수열을 누적 하는 j가 다르다. 
		 * for문의 경우 j를 프린트하면 1+2+4+7+11+16.... 과 같은 수열도 출력된다. 
		 * while문의 경우 수열의 처음인 1이 생략된다.
		 * */
		
		System.out.println(k);
	}

}
