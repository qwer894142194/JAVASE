package com.lanou3g.main;

import test.Student;

public class Main {
		public static void main(String[] args) {
			Student  student = new Student();
			student.smile();
	  
			// student.cry();
			// cry ��private ���ε� ,, ,, ������student �������Ҳ���
			// cry�ǲ����� �� ----> �������������Ҳ�����-----> 
			// �������һ�仰 ���� ���ǾͿ��Կ����� public �� private �Ĳ���:
			// public ����Ȩ�����η�: ���εķ���:
			// private ˽�л�Ȩ�����η�:
			Student st ;
			st =student;
			System.out.println(st);
			/*
			 * angry��protected���ε�
			 * ������test���������Ҳ�����
			 * �����ͬ������
			 * ��Ϊmain���ڵİ�,,,��student�����
			 * ���ڵĲ���ͬһ����,,,���Բ�����
			 */
			//	st.angry(); // protected ���εķ���Ҳ�ᱨ��
			//st.sad();
			// sad����������,.,,û�����δ�
			// ��ʾĬ�ϵ�,,,ֻ��ͬ���¿���ʹ��
			for(int i = 0 ; i < 100 ; i++ ) {
				
				
			}	
			
	
			
			
		}
}