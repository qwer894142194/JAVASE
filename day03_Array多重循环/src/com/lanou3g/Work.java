package com.lanou3g;

import java.util.Arrays;
import java.util.Scanner;

/*
	    *    *  i =1 j =1
	    *   *** i = 2  j= 3 i+i+1
	    *  ***** i= 3  j= 5
	    * *******i = 4  j= 7
	     ********* i = 5 j=9
	    ***********i = 6 j=11
	     ********* i = 7 j=9
	      ******* i =  8 j=7
	       ***** i =9   j=5
	       	***  i = 10  j= 3
	       	 *  i = 11 j=1
    */
public class Work {
		public static void main(String[] args) {
		
			// ������ҪǶ������forѭ��,��һ��forѭ����������ӡ�ո��
			// �����ʽ��������
			// �ڲ�������forѭ�� ���ǿ������е�����
			// �������for
			// ѭ������������������
			Scanner sc = new Scanner(System.in);
			System.out.println("����������Ҫ��ӡ������  ������������ ����-1Ӵ");
			int input = sc.nextInt();
			
			for(int i = 0;i<input;i++) {
				
					for(int l=0;l<input-i;l++) {
						System.out.print(" ");
					}
					for(int j=0; j< 2*i+1;j++) {
						System.out.print("*");
						
					}
				System.out.println();
				}
			// �����ǽ�����Ĵ�ӡ��������ӡһ��
			// ��Ҫע����� ��ֵ��΢�޸���
			 for(int i = 1;i < input;i++) {
					for(int j =0;j<i+1;j++) {
						System.out.print(" ");
					}
					for(int k= 2*i+1;k < 2*input ;k++) {
							System.out.print("*");
				}
					System.out.println();
				}
			

			 
			 
			 //�ڶ���:
//		int max = 0;
//		int sum = 0;
//		int[] student = new int[5];
//		Scanner input = new Scanner(System.in);
//		for(int i = 1; i <= student.length;i++) {
//			System.out.println("�������"  + i + "��ѧ���ĳɼ�");
//			
//			 int score = input.nextInt();
//			 student[i-1]  = score;
//			 sum+=score;
//			 // �����ֵ��ֵ�����ı���max
//			 if(score > max) {
//				 max = score;
//			 } 
//		}
//		Arrays.sort(student);
//		System.out.println("�ɼ��ܷ���" + sum);
//		System.out.println("�ɼ���������� :" + max);
//		System.out.println("ƽ���ɼ���"  + (sum/5));
//		System.out.println("�ɼ���͵���;" +student[0]);
//		
//		
		
		/*
		 * ˮ�ɻ�����Narcissistic number��Ҳ����Ϊ����ȫ���ֲ�������pluperfect digital invariant, PPDI����
		 * ������������������ķ˹׳����ķ˹��������Armstrong number����ˮ�ɻ�����ָһ�� n λ����n��3 ����
		 * ����ÿ��λ�ϵ����ֵ� n ����֮�͵������������磺1^3 + 5^3+ 3^3 = 153��
		 * 
		 */
			}
		
		}		
