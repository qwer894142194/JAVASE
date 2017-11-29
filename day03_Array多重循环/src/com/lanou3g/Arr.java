package com.lanou3g;

import java.util.Scanner;

public class Arr {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输如一个整数");
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
//				 * 所以这里循环条件 6 将要改成sum
//				 */
//			System.out.println(i+ "+" + (sum - i) + "=" + sum);	
//			}	
//			for(int i = 0 , j = sum; i <= sum ; i++,j--) {
//				System.out.println(i +"+" + j + "=" +  sum);
//			}
			// 乘法口诀表
//			for(int i = 0;i <= 9; i ++) {
//				for(int j = 1;j <=i ; j++) {
//					
//					System.out.print(j+  "*" + i + 		"=" + (i * j) + "\t");
//				}
//				System.out.println();
//			}
//			   int  sum = 0;
//			 for(int i = 0; i< 5; i++) {
//				 // 循环接收器
//				 // 做一个判断接受条件
//				 int score = sc.nextInt();
//				 
//				 if(score <0 ) {
//					 System.out.println("输入错误,程序结束");
//					 // 使用break语句跳出循环 
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
			 System.out.println("大于80分的人数是" + people);
		}
}