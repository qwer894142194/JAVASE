package com.lanou3g;

import java.util.Scanner;

public class Work2 {
		public  static void main(String[] args) {
			//1 
//			double n  = 1000000000;
//			double i = 0;
//			
//			while (n /2 !=0 ) {
//				i++;
//				
//				
//			System.out.println(i);
//			}
//			System.out.println("所花的天数是" + i);
			
//		 
			// 2
//			int i = 1;
//			int q = 2;
//			int w = 3;
//			 if(i ==1) {
//				System.out.println("******************"); 
//			 }if(q == 2) {
//				 System.out.println(" ***     JAVA   ***");
//			 }if(w ==3) {
//				 System.out.println("   ******************");
//			 }
		//3.判段奇数偶数
//			Scanner sc = new Scanner(System.in);
//			System.out.println("请输入一个正整数");
//			int num = sc.nextInt();
//			if(num % 2 ==0) {
//				System.out.println("该数是偶数");
//			}else {
//				System.out.println("该数是奇数");
//			}
			// 5.判断闰年
			// 判断闰年的方法
//			①、普通年能被4整除且不能被100整除的为闰年.
//			②、世纪年能被400整除的是闰年
//			③、对于数值很大的年份,这年如果能整除3200,并且能整除172800则是闰年.如172800年是闰年,86400年不是闰年
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个年份");
			int year = sc.nextInt();
			if(year == 86400 ){
				System.out.println(year + "年不是闰年");}
			else if(year % 4 ==0 && year % 100 !=0) {
				System.out.println(year + "年是闰年");
			}else if(year % 400 ==0) {
				System.out.println(year + "年是闰年");
			}else if (year % 3200 ==0 && year % 172800==0) {
				System.out.println(year + "年是闰年");
			} 
			else{
					System.out.println("该年不是闰年");
		}
			// 4.行李相关
//			Scanner sc = new Scanner(System.in);
//			System.out.println("请输入行李重量");
//			int weight = sc.nextInt();
//			double haulage = 0;
//			if(weight < 50) {
//				haulage = weight*0.15;
//				System.out.println("托运费是" +haulage);
//			}else if(weight > 50) {
//				haulage = 50*0.15 + (weight - 50)*0.25;
//				System.out.println("托运费是" + haulage);
//			}else {
//				System.out.println("输入错误");
//			}
			// 第二题   肯定是使用1 个 100 1个50 1个20 1个10 1个5 3个1 最少
			
//			System.out.println("100元的张数" + hi +"50元的张数" + fi + "20元的张数"+ twi +"10元的张数"+ tei+"5元的张数"+ fii + "一元的张数" +oi );
		}
}