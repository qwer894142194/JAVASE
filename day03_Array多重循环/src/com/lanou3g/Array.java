package com.lanou3g;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 标识符号:就是所命的名
 * @author java-201707211014
 *
 */
public class Array {
		public static void main(String[] args) {
	// 集合:相同类型的数据的一个集合
	// 需要一个容器来曾放数据  new 在堆内存中开劈了一个新的空间
	//数组的中的数据就是在堆内存中开辟了一堆连续的空间
		int[] arr = {98,85,858,12};
		
		/*
		 * arr 就是标识符 ,是这个数组的名字
		 * int 表示 这个数组中可以装的类型
		 * int[]表示这个数组的类型
		 * 
		 * {}中的内容,就是这个数组的内容
		 * 
		 * 
		 * 下标就是元素在数组中所处的位置
		 * 下标是从0开始的
		 * 			元素在数组中的位置
		 * 			从0开始计算
		 * 		数组中的最后一个元素的下标
		 *   		数组长度-1
		 * 
		 */
		// 控制台输入的案例

		
		// 创建数组的方式1   定义方式1
		int[] array = {90,80,70,60,50};
		int a = array[0];  // 单独写一个array[0];  就相当单独写一个  90;  没有赋值给变量就会报错 
		System.out.println(array[0]);
		
		// 创建数组的方式2
		// 死记硬背就行
		int[] array2 = new int[30];
		int[]	score= new int[3];// 保存30个类型为int 的数
		//score[4] =50;
				//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
		//at com.lanou3g.Array.main(Array.java:46)          数组下标超过了 界限(越界)
		Scanner input = new Scanner(System.in);
		System.out.println("请输入3个学生的成绩");
		for(int i= 0; i <score.length;i++ ) {
			// score.length 表示数组score的长度
			// i < 3  3  就是数组的长度 所以将其改成数组的长度   数组名.length
			System.out.println("请输入第" + (i+1) + "个学生的成绩");
			
		int student =input.nextInt();
		//  将接受的值赋值给student;
			score[i] = student;
			if(student < 60) {
				System.out.println("该同学成绩不及格");
			}else if(student > 75) {
				System.out.println("该同学成绩优秀");
			}
			// 将student的值赋值给score[i]
			System.out.println("第" + (i+1) + "个学生的成绩" +score[i]);
			// 固定写法 可以直接输出score的内容  ******************
			System.out.println(Arrays.toString(score));
			
		}
		
		}
}