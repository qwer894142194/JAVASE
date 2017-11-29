package com.lanou3g;

import java.util.Scanner;

public class Switch分支 {
   public static void main(String[] args) {
	   System.out.println("韩嫣,请输入你获得的 名次");
//	  int rank = 1;
	   Scanner scanner  = new Scanner(System.in);
	   int input = scanner.nextInt();
	  int n = 5;
	  switch(input){
		  case 1:
			  System.out.println("恭喜你:韩嫣你将获得麻省理工大学夏令营一个月");
			  break;
		  case 2:
			  System.out.println("恭喜你:韩嫣你将获得惠普笔记本电脑一台");
			  break;
		  case 3:
			 System.out.println("恭喜你:韩嫣你将获得英东硬盘");
			 break;
			 default:
				 System.out.println("输入错误");
				 break;
	  }
			// switch 语句
//			 switch(n){
//			 case 1:
//				 System.out.println("没错是1");
//				 break;
//				 // break 就是结束语句
//			 case 2:
//				 System.out.println("没错是2");
//				 break;
//			 case 3:
//				 System.out.println("没错是3");
//				 break;
//			default:
//				System.out.println("小样");
//				break;
//	  		}	 
//				 
		char ch = 'a';
		switch(ch) {
		case 'a':
			System.out.println("你是男人");
			break;
		case 'b':
			System.out.println("你是女人");
			break;
		case 'c':
			System.out.println("你是人妖");
			break;
		default:
			System.out.println("输入错误");
			break;
		}
	  
	  }

}
