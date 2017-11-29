package com.lanou3g;

import java.util.Scanner;

public class Circulation二重循环 {
		public static void main(String[] args) {
				
			
			Scanner sc = new Scanner( System.in);
			//第一层循环 表示班级	
			for(int i = 1;i <= 4 ; i++) {
				System.out.println("请输入第" + i + "个班级学生的成绩" );
				// 第二层循环  每次循环  都要接受一个学生的成绩
				//  
				int classScore = 0;
				for(int j = 1; j <=5;j++) {
				int score = sc.nextInt();
				
				classScore = classScore + score;
				// 怎么能把接受到的插层剂保存起来
				
				}
				
				System.out.println("第" + i + "个班级的平均成绩是:" + (classScore/5) );
				/*
				 * 有四个班级, 每个班级有5名同学
				 */
			}
			
		}
}
