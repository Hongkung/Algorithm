package Chokkorism;

public class Ex1 {

	public static void main(String[] args) {
		//1~100까지 더하기, 뺴기를 반복하는 수열
		int i = 0, j = 0, sw =0;

		/*for (i = 0; i <= 100; i++) {

			if (i % 2 == 0) {
				j -= i;
			} else {
				j += i;
			}

		}*/

		//sw를 스위치로 쓰는 코드

		for (i = 1; i <= 100; i++) {

			if (sw == 0) {
				j += i;
				sw=1;
			} else if(sw != 0) {
				j -= i;
				sw = 0;
			}
		}
		System.out.println(j);
	
	}

}
