package com.lanou3g;
/**
 * if��֧�к����{}�Ƿ����ʡ��
 * @author java-201707211014
 *  �߼������
 *  ��·�� &&     
 *  ��·�� ||
 *  ��·�� !
 *  �߼��� | 
 *  
 */
public class Branch��֧ {
		public static void main(String[] args) {
//			int a = 10;
//			int b = 54;
//			if(a < b) {
//				System.out.println("���ֵ��" + b);
//				System.out.println("��Сֵ��"  +a);
//			}
			int javaScore = 90;
			if(javaScore > 90 ) {
				System.out.println("����");
			}
			if(javaScore > 700) {
				System.out.println("¬��ΰţ��");
			}else {
				System.out.println("��ѧ�����,����");
			}
			if(javaScore < 60 )   // ʡ�Դ����ŵ����
			// ��Ҫִ�е����ֻ��һ��ʱ.,if������Ŀ��Բ�д{}	
				System.out.println("����Ҫ�ú�Ŭ����");
			 // ���ɼ�����100 ʱ�����Ҵ���80ʱ���ͻ���뵽������ִ�������ȥ
			// ͬʱ��������ִ��������
			//  ����Ƕ�·��
			
			// && ������ж�����������ʱ , �����ж��Ҳ������
			// &  ������ж�����������ʱ, ��Ȼ���ж��Ҳ������
			if(javaScore > 90 && javaScore < 100 ) {
				
				System.out.println("��������");
			}
			// ���������·��  ���߼���� ���
			//System.out.println("javaScore:" + ++javaScore);
			
			//  ||  �� | 
			if(++javaScore > 80 || ++javaScore > 90) {
				System.out.println("�ֵ�,�����");
				System.out.println("javaScore:" + javaScore);
			}
			if(++javaScore > 80 | ++javaScore > 90) {
				System.out.println("javaScore2: " +javaScore);
			}
			// ��·�� ���·��  ���һ��
			//  ֻҪ���������,�Ͳ����ж��Ҳ���������ȷ���
			
			// ! ��
			if (!(javaScore < 60)) {
				System.out.println("˵�� >>= 60");
			}
			
			
			//��ν�������������ֵ
			int a = 10;
			
			int b = 15;
			int  c = a;
			// ��a ��ֵ��c  ��Ϊc�Ǹ��ձ���
			a  = b;
			b = c;
			// �������ļӺ� ʵ�ֵ����ַ�����ƴ��
			System.out.println("a:" +a);
			System.out.println("b:"+b);
			// ��һ�ַ���:  
			// 1����һ���µı���c
			// 2��a��ֵ��ֵ��c
			
			// 3��b��ֵ��ֵ��a
			// 4��c��ֵ��ֵ��b
			
			// �ڶ��ַ���
			
			// ��ʹ�õ���������,ֱ��ʹ�üӼ���
			
			
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("a2:" +a);
			System.out.println("b2:" +b);
			 
			
			
			//�����ַ���
			// ��ʹ�õ���������,ʹ�����^
			// һ���������һ��������,������������
			// 5^6^6 = 5
			/*
			 * |����������
			 * ��һ����1,��������1
			 * 
			 * ^������������
			 * ���߲������Ϊ1  �����Ϊ0
			 * Ҳ���ǲ�ͬʱΪ1 ��0 
			 */
			System.out.println(26^23^23);
			/*
			 * 26�Ķ������Ƕ���?
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
