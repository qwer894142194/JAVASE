package com.lanou3g;

import javax.swing.text.Highlighter.Highlight;

public class Operation����� {
		public static void main(String[] args) {
			//+ - * / �Լ�-- ����++  ȡ��%
			int  big = 5;
			/*
			 *
			 *big��int���� 
			 *����big/2Ҳ����int���;ͻὫ2.5ȡ�� �õ�2
			 *
			 *  big��int�� 
			 *  2.0�Ǹ�����
			 *  ��ʱ��big/2.0�õ��ľ��Ǵ�
			 *  С����ĸ�����
			 *  Ҳ����2.5
			 */
			double result = big / 2.0;
			int result1 = big /2;
			System.out.println("result= " +result);
			System.out.println("result1= " +result1);
			 big++;
			 //  ����  
			System.out.println(big);
			int height = 180;
			//��
			
			int height1 = ++height;
			height++;
			System.out.println("height=" + height);
			System.out.println("height1= " + height1);
			System.out.println(height++);
				
			//5+9+21+40 =75	
			// ++ ��ǰ  �����Լ�,��ʹ��
			
			// ++ �ں�  ����ʹ��,���Լ�
					
					int v= 10;
					
			      System.out.println("v++��ֵ��"  + v++);
			      System.out.println();
			      
			      System.out.println("ʹ��v++���ֵv" +v);
			      
		 
			
		}
}
