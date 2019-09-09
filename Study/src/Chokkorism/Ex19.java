package Chokkorism;
import java.util.*;
public class Ex19 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] input = new int[5];
		int[] cont = new int[4];
		int i;
		
		for(i =0; i <=4; i++)
		{
			input[i] = sc.nextInt();
		}	
		
		cont[0] = input[1];
		
		if(input[0] == 1) {
			
			for(i =0; i<=2; i++) {
				if(input[i+2]== cont[i]) {
					cont[i+1] = 0;
				}else {
					cont[i+1]=1;
				}
			}
			
		}else {
			for(i =0; i<=2; i++) {
				if(input[i+1] == input[i+2]) {
					cont[i+1] = 0;
				}else {
					cont[i+1] = 1;
				}
			}
		}
		
		if(input[0] == 1)
		{
			System.out.println("이진수");
		}else {
			System.out.println("그레이 코드");
		}
		
		for(i=0; i<=3; i++) {
			
			System.out.print(cont[i]);
		}
	}

}
