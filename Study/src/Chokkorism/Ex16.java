package Chokkorism;

public class Ex16 {

	public static void main(String[] args) {
	
		int cunt, sum, i;
		cunt =0;
		sum =0;
		i =0;

		do {
			i++;
			if(i % 5 ==0) {
				cunt++;
				sum +=i;
			}
		}while(i<100);
		
		System.out.println("5����� ���� : "+cunt);
		System.out.println("5����� �� : "+sum);
		
	}

}
