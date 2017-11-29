package com.lanou3g;
/**
 * if分支中后面的{}是否可以省略
 * @author java-201707211014
 *  逻辑运算符
 *  短路与 &&     
 *  短路或 ||
 *  短路非 !
 *  逻辑或 | 
 *  
 */
public class Branch分支 {
		public static void main(String[] args) {
//			int a = 10;
//			int b = 54;
//			if(a < b) {
//				System.out.println("最大值是" + b);
//				System.out.println("最小值是"  +a);
//			}
			int javaScore = 90;
			if(javaScore > 90 ) {
				System.out.println("优秀");
			}
			if(javaScore > 700) {
				System.out.println("卢本伟牛逼");
			}else {
				System.out.println("在学会儿吧,朋友");
			}
			if(javaScore < 60 )   // 省略大括号的情况
			// 当要执行的语句只有一条时.,if语句后面的可以不写{}	
				System.out.println("你需要好好努力了");
			 // 当成绩大于100 时，并且大于80时，就会进入到｛｝的执行语句中去
			// 同时成立才能执行输出语句
			//  这就是短路与
			
			// && 当左侧判断条件不成立时 , 不会判断右侧的条件
			// &  当左侧判断条件不成立时, 依然会判断右侧的条件
			if(javaScore > 90 && javaScore < 100 ) {
				
				System.out.println("可厉害了");
			}
			// 这里检测出短路与  和逻辑与的 差距
			//System.out.println("javaScore:" + ++javaScore);
			
			//  ||  和 | 
			if(++javaScore > 80 || ++javaScore > 90) {
				System.out.println("兄弟,你真棒");
				System.out.println("javaScore:" + javaScore);
			}
			if(++javaScore > 80 | ++javaScore > 90) {
				System.out.println("javaScore2: " +javaScore);
			}
			// 短路或 与短路与  情况一样
			//  只要左侧条件是,就不会判断右侧条件的正确与否
			
			// ! 非
			if (!(javaScore < 60)) {
				System.out.println("说明 >>= 60");
			}
			
			
			//如何交换俩个变量的值
			int a = 10;
			
			int b = 15;
			int  c = a;
			// 将a 赋值给c  因为c是个空变量
			a  = b;
			b = c;
			// 输出这里的加号 实现的是字符串的拼接
			System.out.println("a:" +a);
			System.out.println("b:"+b);
			// 第一种方法:  
			// 1定义一个新的变量c
			// 2将a的值赋值给c
			
			// 3将b的值赋值给a
			// 4将c的值赋值给b
			
			// 第二种方法
			
			// 不使用第三方变量,直接使用加减法
			
			
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("a2:" +a);
			System.out.println("b2:" +b);
			 
			
			
			//第三种方法
			// 不使用第三方变量,使用异或^
			// 一个数异或另一个数俩次,结果还是这个数
			// 5^6^6 = 5
			/*
			 * |操作二进制
			 * 有一个是1,则结果就是1
			 * 
			 * ^异或操作二进制
			 * 俩者不相等则为1  相等则为0
			 * 也就是不同时为1 或0 
			 */
			System.out.println(26^23^23);
			/*
			 * 26的二进制是多少?
			 *   26 
			 *   13  0
			 *   6   1
			 *   3   0
			 *   1   1
			 *   0   1 
			 *  a 26  11010
			 *  b 23  10111  
			 *    13  01101
			 */  //   11010
			      //  10111
			a = a ^b; //13
			b = a ^b; //26
			a = a ^b; //23
			
			
		}		
}
