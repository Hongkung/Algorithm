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
		/*��� ���� k�� �����ǰ� ���� ���ϴ°��� j�� ������ -��+�� �ݺ� ��� �ϴ°��̱� ������ 
		 * �ᱹ ����ؼ� �����ڰ� ��� �ٲ����ϴ� ���� k�̴�.
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
