package Chokkorism;

import java.util.Iterator;

public class Ex2 {

	public static void main(String[] args) {

		float i, j = 0;
		for (i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				j += i / (i + 1f);
			System.out.println("+ : "+j);
			} else {
				j -= i / (i + 1f);
			System.out.println("- : "+j);
			}
		}
		
		System.out.printf("%f",j);

		
		
	}

}
