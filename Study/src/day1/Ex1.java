package day1;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		/*
		 * int Sum = 0; float aver = 0f;
		 * 
		 * int[] score = {100,90,80,70,60,50};
		 * 
		 * for (int i=0; i<score.length; i++) { Sum += score[i]; }
		 * 
		 * aver = Sum / (float)score.length; System.out.printf("result : %d\n",Sum);
		 * System.out.printf("aver : %f", aver);
		 * 
		 * int max =score[0]; int min =score[0];
		 * 
		 * for(int i = 0; i<score.length; i++) { if(score[i]>max) { max=score[i]; }else
		 * if(score[i]<min) { min=score[i]; } }//for문 종료
		 * 
		 * System.out.printf("Max : %d\n", max); System.out.printf("Min : %d", min);
		 * 
		 * 
		 * int[] numArr = new int[10];
		 * 
		 * for(int i=0; i<numArr.length; i++) { numArr[i] =i; //numArr에 숫자 채움
		 * System.out.print(numArr[i]); } System.out.println();
		 * 
		 * for(int i=0; i<100; i++) { int n = (int)(Math.random()*10);//0~9까지 임의의 수로 초기화
		 * int tem = numArr[0]; numArr[0] = numArr[n]; numArr[n] = tem; //numArr[0]의 값과
		 * [n]번째 인덱스의 값을 체인지 100회반복 }
		 * 
		 * for(int i=0; i<numArr.length; i++) { System.out.print(numArr[i]); }
		 * 
		 * int[] code = {-5 ,-6 ,2 ,5 ,13}; int[] arr = new int[10];
		 * 
		 * for(int i=0; i < arr.length; i++) { int tmp =
		 * (int)(Math.random()*code.length);//0~4 사이의 임의의 값을 tmp에 저장 arr[i] =
		 * code[tmp];//code의 랜덤한 인덱스의 값으로 arr배열을 불연속적으로 채운다. }
		 * 
		 * System.out.print(Arrays.toString(arr));
		 */
		//////////////////////////////////////////////////////////////////////
		// bubble sort
/*
*/		///////////////////////////////////////////////////////////////////////////////
	
		/*
		 * int[] numArr = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
			
			 * numArr[i]=(int)(Math.random()*10); System.out.print(numArr[i]);<< 위의 코드를 풀어서
			 * 쓰면 이렇게 된다.
			 
		}
		
		System.out.println();
		
		for(int i =0; i<numArr.length; i++) {
			counter[numArr[i]]++;
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.println(i+"의 개수 : "+counter[i]);
		}
		*/
		///////////////////////////////////////////////////////////////////
		
		//다차원배열
		
		int[][] score = {
				
				{100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
				
			};
		int sum =0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d\n", i,j,score[i][j]);
			}
		}
		
		for(int[] tmp : score) {
			for(int i : tmp) {
				sum += i;
			}
		}
		System.out.println("sum = "+sum);
	}

}
