package com.lanou3g;

import java.util.Arrays;
import java.util.Scanner;

/*
	    *    *  i =1 j =1
	    *   *** i = 2  j= 3 i+i+1
	    *  ***** i= 3  j= 5
	    * *******i = 4  j= 7
	     ********* i = 5 j=9
	    ***********i = 6 j=11
	     ********* i = 7 j=9
	      ******* i =  8 j=7
	       ***** i =9   j=5
	       	***  i = 10  j= 3
	       	 *  i = 11 j=1
    */
public class Work {
		public static void main(String[] args) {
		
			// 这里需要嵌套俩个for循环,第一个for循环是用来打印空格的
			// 是其格式像三角形
			// 内部的俩个for循环 都是控制行中的列数
			// 而外面的for
			// 循环是用来控制行数的
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入棱形要打印的行数  行数是你输入 俩倍-1哟");
			int input = sc.nextInt();
			
			for(int i = 0;i<input;i++) {
				
					for(int l=0;l<input-i;l++) {
						System.out.print(" ");
					}
					for(int j=0; j< 2*i+1;j++) {
						System.out.print("*");
						
					}
				System.out.println();
				}
			// 这里是将上面的打印倒过来打印一遍
			// 需要注意的是 将值稍微修改下
			 for(int i = 1;i < input;i++) {
					for(int j =0;j<i+1;j++) {
						System.out.print(" ");
					}
					for(int k= 2*i+1;k < 2*input ;k++) {
							System.out.print("*");
				}
					System.out.println();
				}
			

			 
			 
			 //第二题:
//		int max = 0;
//		int sum = 0;
//		int[] student = new int[5];
//		Scanner input = new Scanner(System.in);
//		for(int i = 1; i <= student.length;i++) {
//			System.out.println("请输入第"  + i + "个学生的成绩");
//			
//			 int score = input.nextInt();
//			 student[i-1]  = score;
//			 sum+=score;
//			 // 将大的值赋值给定的变量max
//			 if(score > max) {
//				 max = score;
//			 } 
//		}
//		Arrays.sort(student);
//		System.out.println("成绩总分是" + sum);
//		System.out.println("成绩最优秀的是 :" + max);
//		System.out.println("平均成绩是"  + (sum/5));
//		System.out.println("成绩最低的是;" +student[0]);
//		
//		
		
		/*
		 * 水仙花数（Narcissistic number）也被称为超完全数字不变数（pluperfect digital invariant, PPDI）、
		 * 自恋数、自幂数、阿姆斯壮数或阿姆斯特朗数（Armstrong number），水仙花数是指一个 n 位数（n≥3 ），
		 * 它的每个位上的数字的 n 次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）
		 * 
		 */
			}
		
		}		
