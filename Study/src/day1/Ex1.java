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
		 * if(score[i]<min) { min=score[i]; } }//for�� ����
		 * 
		 * System.out.printf("Max : %d\n", max); System.out.printf("Min : %d", min);
		 * 
		 * 
		 * int[] numArr = new int[10];
		 * 
		 * for(int i=0; i<numArr.length; i++) { numArr[i] =i; //numArr�� ���� ä��
		 * System.out.print(numArr[i]); } System.out.println();
		 * 
		 * for(int i=0; i<100; i++) { int n = (int)(Math.random()*10);//0~9���� ������ ���� �ʱ�ȭ
		 * int tem = numArr[0]; numArr[0] = numArr[n]; numArr[n] = tem; //numArr[0]�� ����
		 * [n]��° �ε����� ���� ü���� 100ȸ�ݺ� }
		 * 
		 * for(int i=0; i<numArr.length; i++) { System.out.print(numArr[i]); }
		 * 
		 * int[] code = {-5 ,-6 ,2 ,5 ,13}; int[] arr = new int[10];
		 * 
		 * for(int i=0; i < arr.length; i++) { int tmp =
		 * (int)(Math.random()*code.length);//0~4 ������ ������ ���� tmp�� ���� arr[i] =
		 * code[tmp];//code�� ������ �ε����� ������ arr�迭�� �ҿ��������� ä���. }
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
			
			 * numArr[i]=(int)(Math.random()*10); System.out.print(numArr[i]);<< ���� �ڵ带 Ǯ�
			 * ���� �̷��� �ȴ�.
			 
		}
		
		System.out.println();
		
		for(int i =0; i<numArr.length; i++) {
			counter[numArr[i]]++;
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.println(i+"�� ���� : "+counter[i]);
		}
		*/
		///////////////////////////////////////////////////////////////////
		
		//�������迭
		
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
