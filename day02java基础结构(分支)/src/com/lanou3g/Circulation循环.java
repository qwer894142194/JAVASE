package com.lanou3g;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Circulation循环 {
		public static void main(String[] args) {
//			//while 循环
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//			System.out.println("请输入你的成绩");
//		 while (num > 80 ) {
//			 System.out.println("你的成绩是优秀");
//			 break;
			 /*
			  * while询函
			  * 先判断括号中的内容,如果正确,是否为true
			  * 如果为true
			  * 则执行
			  * 大括号里面的内容
			  * ,然后在判断括号中的内容是否正确 ,如果正确
			  * 就一直执行
			  * 当条件为false时,则循环停止
			  * 
			  * 所以用while循环时,就需要在循环外面初始化一个变量
			  */
//		 }
//			System.out.println("1");
		   int i = 0;
		   int max = 0;
		   while(i < 100 ) {
			   // 大括号里面叫做循环体  
			   //小括号中叫做循环条件 
			   System.out.println(i);
////			   i++;
			   i = i+7;
			  // i*=7 -> i= i*7
			   max = i-7;
			   
			   // 循环增量
			   //为了跳出循环,防止出现死循环
			  
		   }
		   System.out.println("100中7的倍数最大值是" +max);
		   	//do{执循环体} while(循环条件) 循环
		   // 
			int progress = 1;
		   do{
			   progress+=2;
			   System.out.println(progress);
		   }while(progress > 10);
		  /*
		   * do-while 与while 的区别
		   * 
		   * do-while 是先执行一次循环体,然后在判断
		   * 
		   * 
		   * while是先判断 再执行循环体
		   */
		   
		   int w = 0;
		   do {
			  w++;
			  System.out.println("好好学习天天线上" +w);
		   }while(w < 100);
		}
}
