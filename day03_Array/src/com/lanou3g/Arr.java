package com.lanou3g;

import java.util.Scanner;

public class Arr {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������һ������");
//			
//			
//			int[] arr= {0,1,2,3,4,5,6};
//			for(int i = 0; i <= sum ; i++) {
//				/*
//				 * 0+sum-0 = sum
//				 * 1+sum-1 = sum
//				 * 2+sum -2 = sum
//				 * *************
//				 * sum +sum-sum=sum
//				 * ��������ѭ������ 6 ��Ҫ�ĳ�sum
//				 */
//			System.out.println(i+ "+" + (sum - i) + "=" + sum);	
//			}	
//			for(int i = 0 , j = sum; i <= sum ; i++,j--) {
//				System.out.println(i +"+" + j + "=" +  sum);
//			}
			// �˷��ھ���
//			for(int i = 0;i <= 9; i ++) {
//				for(int j = 1;j <=i ; j++) {
//					
//					System.out.print(j+  "*" + i + 		"=" + (i * j) + "\t");
//				}
//				System.out.println();
//			}
//			   int  sum = 0;
//			 for(int i = 0; i< 5; i++) {
//				 // ѭ��������
//				 // ��һ���жϽ�������
//				 int score = sc.nextInt();
//				 
//				 if(score <0 ) {
//					 System.out.println("�������,�������");
//					 // ʹ��break�������ѭ�� 
//					 
//					 break;
//				 }
//				
//				sum+=score; 
//			 }
//			 System.out.println(sum/5);
			
			 int people = 0;
			 for(int i =  0 ; i < 10; i++) {
				int score = sc.nextInt();
//				if(score < 80) {
//					continue;
//				}else {
//					people++;
//				}
				
				
				if(score >= 80) {   
					people++;
				}else {
					
				}
			 }
			 System.out.println("����80�ֵ�������" + people);
		}
}