package com.lanou3g;

import java.util.Arrays;
import java.util.Scanner;

public class Main5Sort {
	public static void main(String[] args) {
		/*
		 * 创建一个数组来接受成绩
		 */
		// 定义一个变量 用来存蓄最大值
		int max = 0;
		int[] student = new int[5];
		Scanner input = new Scanner(System.in);
		for(int i = 1; i <= student.length;i++) {
			System.out.println("请输入第"  + i + "个学生的成绩");
			
			 int score = input.nextInt();
			 student[i-1]  = score;
			 // 将大的值赋值给定的变量max
			 if(score > max) {
				 max = score;
			 }
		// 其实可以利用数组排序的方法  ; 下面调用的数组排序的方法是将数组中的值从小到大排序的  所以最大的值,就是数组下标最大的那个值	
		// 	 
		}
		 System.out.println("成绩最优秀的是 :"+max);
		// 对数组进行排序 固定写法
		Arrays.sort(student);
		// 应该是直接使用类名为Arrays(关于数组的类)中的方法sort(排序)  就是相当于直接使用该方法   // 应该是数组Arrays类 中sort的方法   arrays.sort
		System.out.println(Arrays.toString(student));	
		System.out.println("最优秀成绩是" + student[4]);
	}
}
