package com.lanou3g;

import java.util.Arrays;

/**
 * 
 * 	@author java-201707211014
 *  数组中 插入一个 数值,仍然使该数组保持升降排序
 */
public class Main2 {
		public static void main(String[] args) {
			int[] a  = {40,50,60,70,80};
						
						/*
						 * 
						 */
			int[] b = new int[6];
			int r = 45;
			// 数组的遍历
			
			//  为什么要写  a.length -1 因为 当i = 5  i+1 = 6 a[6]就会数组越界
			// 这里为什么要 放b.length呢? 因为a的长度不够循环次数  ,b的长度比a的大
			for (int i = 0,j=0; i < b.length - 1; i++) {
//			if (i < a.length - 1) {
//				if (a[i] < r && a[i + 1] > r) {
//					// 如果满足该条件 那么久说明r就要放在a[i] 与a[i+1]之间 即放在了第i+1位
//					a[i] = b[i];
//					b[i+1] = r;	
//					return; 
//				} else {
//					// 不满足条件 则不插入r
//					b[i] = a[i];
//				}
//			}
			// 最后一个直接给治
			//			b[i] = a[i];
				// 这个程序 没有考虑俩种情况,就是插入的值 比数值中的都笑,或则都大的时候,
				// 加上这来个条件后,跟课堂上老师的逻辑一样,不可取
				if(a[i] < r) {
				b[i] = a[i];
				}
				else if(a[i] > r  && a[i-1] <r) {
				  b[i] = r ;
				  
				
				}
				b[i+1] = a[i];
			}
			System.out.println(Arrays.toString(b));
		}
}