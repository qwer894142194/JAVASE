package com.lanou4g;

import java.util.Scanner;

/**
 * ������
 * @author java-201707211014
 * @version 1.0.1
 */	
public class domo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ע��Ķ�����ʽ 
		//		1.����
		//		2.����    
		//		3.�ĵ���ʽ
		/*
		 * ����ע�� 
		 */
		/*
		 * 
		 */
		/**
		 * �ĵ�ע��
		 */ 
		//	����һ������ 
		//	�������� ������ = ��ֵ��
		//  ����һ�����ͱ���
		int a = 10; 
		//  ��ӡʱ  �ַ������κ�����һ��ƴ��
		//	��ӡ�����Ķ����ַ���
		System.out.println("a��ֵ�ǣ�"  + a);
		int b = 16 ; 
		System.out.println("a= " + a + ", b= " +b);
		
		//byte�ֽ�
		//��ʽת��
		//���ͽ���������С���� �����������ͣ�
		//ǿ��ת��
		byte c = 5;
//		�Զ�����Ϊ2��int���͵�ֵ ���   
		c = (byte)(c + 2);
		System.out.println(c);
		
		// �����
		// + - * / %
		//�������� �����������»��� ��$������������ſ�ͷ
		// ����˼��
		// û�г�ʼֵ�ı����ǲ���ʹ�õ�
		int num1 = 10,num2;
		num2= 5;
		System.out.println(num2);
		
		int num3 = 5;
		int num4 = 2;
		// 	˫���ȸ�����
		double num5 = 5.0;
		double num6 = 2.0;
		int num7 = 0;
		int num8 = num3 / num4;
		System.out.println(num8);
		//��������������ֻ��������
		
		
		double num9 = num5 / num6;
		System.out.println(num9);
		
		// int num10 = num3/num7;
		// ��0��Ϊ������ʱ  ���벻�ᷢ������
		// ��ʱ���е�ʱ�� �ᱨ��
		// System.out.println(num10);
		
		//�����ȸ�����(��Ҫĩβ��1 ��Сf ����ʾ��������ǵ����ȸ�����)
		float f = 3.1f;
		
		boolean b1 = true;
		
		// ȡ������
		// ��1ȡ�� ֵΪ0��
		// �Ա��Լ���� ֵ�� ֵΪ����
		// �������<�ұ��� ʱ ȡ���ֵ ������ߵ���
		// ����Ը��������� ȡ������ʱ
		// �Գ����ķ��� Ϊȡ����ֵ�ķ���  ��ֵͬΪ��ߵ���������
		
		System.out.println(-5 % 3);
		
		// �����Լ� ��++����--��
		// a++�� ==>a = a + 1��
		// ++��ǰ ����ʱ �������ڽ��������ֵ  ++�ں�����ʱ  �Ȳ������� �ٽ���������
		// 
		int i = 5;
		int k = i++;
		System.out.println("i = " + i + " ��k = " + k );
		
		
		// ����̨����  �������� ���ԣ� 
		// ��������������������ԣ�
		
		Scanner scannerLanOu = new Scanner(System.in);
		// ȡ������̨�����ֵ
		int m = scannerLanOu.nextInt();
		System.out.println(m);
		// �ر�scanner
		scannerLanOu.close();
		
		// �ַ�����'a' ʹ�õ�����
		// �ַ��ͺ����Ϳ����໥ת����
		// ASCII
		char ch='a';
		System.out.println(ch);
		System.out.println((char)(ch + 1));
		
	     
		
				
				
	}

}
