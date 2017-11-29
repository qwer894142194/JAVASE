package com.lanou3g;

public class Main {
		public static void main(String[] args) {
			for(int i= 0; i<5;i++ ) {
				for(int j = 0 ; j < 5; j++) {
					System.out.print("*");
				}
					System.out.println();
			}
			
			// 乘法口诀推倒过程 
			/*   尖朝上
			 *    *
			 *    **
			 *    ***
			 *    ****
			 *    *****
			 * 
			 */
			 
			for(int i = 0; i< 6; i++) {
				for(int j = 0; j  < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			/*
			 * 尖朝下
			 *    *****
			 *    ****
			 *    ***
			 *    **
			 *    *
			 */
			System.out.println("-------------------------");
			for(int i =0; i < 5; i++) {
				for(int j =i; j <5;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("-----------------------");
			// 写乘法口诀
			for(int i = 0;i <= 9; i ++) {
				// 外层循环 控制行数
				for(int j = 1;j <=i ; j++) {
				// 内层循环 控制列数  ,就说每行的个数
					// 因为乘法口诀每行的个数是依次递增 1   
					    /*
					     *   * 
					     *   **
					     *   ***
					     *   ****
					     *   *****
					     *   ******
					     *   *******
					     *   ******** 
					     */
					System.out.print(j+  "*" + i + 		"=" + (i * j) + "\t");
					
				}
				System.out.println();
			}
			/*
			 * 
			 */
		}
}
