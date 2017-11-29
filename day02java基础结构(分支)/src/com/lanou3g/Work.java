package com.lanou3g;

import java.util.Scanner;

public class Work {
		public static void main(String[] args) {
			/*
			 * 分析题意:
			 * 循环输入5门出成绩
			 * 输入: 肯定要使用scanner 这个关键字
			 * 
			 * 循环: 就需要用到循环
			 * 
			 */
			System.out.println("请输入5们成绩");
			
			System.out.println();
			Scanner sc = new Scanner(System.in);
			// 这里定义俩个变量是为了求平均分
			int sum = 0;
			int average;
			// 提示输出
			System.out.println("请输入第一门成绩");
			for(int i = 1; i< 6; i++) {
				
			int score = sc.nextInt();
			
			System.out.println("第"+ i + "门成绩分数是" +score);
			System.out.println("请输入第" +(i+1)+ "门成绩");
			sum = sum + score ;
			// 这一步是求5门的成绩和
			}
			// 这一步骤是求平均分的
			average = sum / 5;
			// 输出平均分
			System.out.println("五门平均分是"+average);
			
		}
}
