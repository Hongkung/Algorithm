package day3;

public class Test {

	public static void main(String[] args) {
		int i=10, sum= 0, t = 1;
		
		while(i>1) {
			i--;
			
			System.out.println(t+ "��° "+"I = "+i);
			
			if(i%3 == 1) {
				
				System.out.println(i%3);
				sum+=i;
				System.out.println(t+ "��° sum : "+sum);
			}
			t++;
		}
		System.out.println("���� ��� : "+sum);
		
		

	}

}
