package com.lanou3g.main;

import test.Student;

public class StringDemo {
			public static void main(String[] args) {
				/*
				 * String ��
				 * ��ʾ�ַ���
				 * ע��: �ַ������ǻ�����������
				 * ������������
				 * int byte short long float double boolean char 
				 * 
				 * 
				 * 
				 * 
				 * ��������: 
				 */
				//ע��:::::: �ַ����ǲ��ɱ�� ,,,,��һ���ַ�����������,,,���������ٷ��ϱ仯
				// �����ַ�����������,,��data�оͻᱣ��  ,,,���ᷢ���ı�
				// ��Ҫ�޸�ʱ,,,ϵͳ���Ȳ鿴data���Ƿ�����Ҫ�ı���ַ���,,,���û��,,,�ͻ���data�����´�����һ���µ��ַ���
				String s1 = "S";
				String s2 = "s";
				Student student = new Student();
				
				String s3 = new String("S");
				String s4 = new String("s");
				System.out.println("���� s1:" +s1);
				System.out.println("����s2" + s2);
				System.out.println("����s3 " + s3);
				System.out.println("����s4"  + s4);
				// s1 = s2 �ǽ�s2 ��ֵ��ֵ��s1
				
				System.out.println(s1);
				System.out.println(s3 = s4);
				System.out.println(s3 == s4);
				System.out.println(s1 == s2);
				System.out.println("-------------------");
				// �ж������ַ����������Ƿ����
				
				System.out.println(s1.equalsIgnoreCase(s2));
				System.out.println(s1.equals(s2));
				
				
				int a= 1;
				String q = "ss";
				int b = 2;
				String w = "w";
				int c =3;
				int d = 4;
				int e = 5;
				
				
				System.out.println(a+q+b+w + c + d +e);
				
				
				
				
			}
}
