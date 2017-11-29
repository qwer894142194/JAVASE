package com.lanou3g;

import java.util.Scanner;

public class Branch {
		public static void main(String[] args) {
//			int score = 50;
//			if (score >= 80) {
//				System.out.println("良好");
//			} else if (score >= 60) {
//				System.out.println("中等");
//			} else {
//				System.out.println("差");
//			}
//			//
//			if (score > 48) {
//				System.out.println("你真的棒");
//			}
//	
//		 int time = 8;
//		 // 0 表示男  1 表示女
//		 int  genter = 0;
//		 if(time < 10 ) {
//			 System.out.println("进入决赛");
//		 }
//		 if(genter ==0){
//			 System.out.println("进入男子赛组");
//		 }
//		 else if(genter ==1) {
//			 System.out.println("进入女子赛组");
//		 }else{
//	     		System.out.println("pass");	
//		}
//				 
//				 
		int time  = 8;
		String sex = "男";
		if (time < 10 && sex == "男") {
			System.out.println("进入男子决赛组");
		}else if(time < 10 && sex =="女" ){
			System.out.println("进入女子决赛组");
		}
	    
		System.out.println("请输入时间");
		Scanner  sc = new Scanner(System.in);
		int input = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int input2 = sc2.nextInt();
		
		if(input < 10) {
			System.out.println("进入决赛");	
			System.out.println("请输入性别  / 1 -男  2-女");
			
		} if(input2 ==1){
			System.out.println("进入男子决赛组");
		} else if(input2==2) {
			System.out.println("进入女子决赛组");
		}else {
			System.out.println("输入错误");
		}
		 
	}	
}		

