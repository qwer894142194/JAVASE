package com.lanou3g;

import javax.swing.text.Highlighter.Highlight;

public class Operation运算符 {
		public static void main(String[] args) {
			//+ - * / 自减-- 自增++  取余%
			int  big = 5;
			/*
			 *
			 *big是int类型 
			 *所以big/2也就是int类型就会将2.5取整 得到2
			 *
			 *  big是int型 
			 *  2.0是浮点型
			 *  这时候big/2.0得到的就是带
			 *  小数点的浮点型
			 *  也就是2.5
			 */
			double result = big / 2.0;
			int result1 = big /2;
			System.out.println("result= " +result);
			System.out.println("result1= " +result1);
			 big++;
			 //  自增  
			System.out.println(big);
			int height = 180;
			//这
			
			int height1 = ++height;
			height++;
			System.out.println("height=" + height);
			System.out.println("height1= " + height1);
			System.out.println(height++);
				
			//5+9+21+40 =75	
			// ++ 在前  是先自加,再使用
			
			// ++ 在后  是先使用,再自加
					
					int v= 10;
					
			      System.out.println("v++的值是"  + v++);
			      System.out.println();
			      
			      System.out.println("使用v++后的值v" +v);
			      
		 
			
		}
}
