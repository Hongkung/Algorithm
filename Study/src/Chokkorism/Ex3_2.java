package Chokkorism;

public class Ex3_2 {
	public static void main(String[] args) {
		int i=0,j=1,k=0,l=-1;
		
		for(i=0; i<20; i++) {
			j+=i;
			
			System.out.println("i = "+i+", j = "+j);
			/*k*=l;
			System.out.println("k = "+k);
			
			j*=-1;
			System.out.println("k1 = "+k);
			*/
			k=(k*l)+j;
			System.out.println("k2 = "+k);
		/*결과 값은 k에 누적되고 내가 원하는것은 j의 수열이 -와+를 반복 계산 하는것이기 떄문에 
		 * 결국 계속해서 연산자가 계속 바뀌어야하는 것은 k이다.
		 * */
		}
		
		/*do {
			i++;
			j+=i;
			j*=l;
			k+=j;
		}while(i<19);
		*/System.out.println(k);
	} 
}
