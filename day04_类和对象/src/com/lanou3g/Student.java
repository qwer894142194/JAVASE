package com.lanou3g;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Student {
	// ���ĸ���������
//	 ���ڻ�û��ֵ��
	
		String name;
		int age;
		String school;
		int id;
	
		
		
	public void play() {
		System.out.println(name + "����Ϸȥ��");
		
	
	}
	public void goToSchool() {
		System.out.println(name  + "��ѧȥ��,ѧУ��" + school);
	}
	
	/*
	 * public Ȩ�����η���
	 * void   ����ֵ����   void ---ָ����û�з���ֵ  
	 * show  ������
	 * ע��:(String str) �����б�     ��������ȥ,����˵�����������Ҫ�õ�������,�ַ� ɶ��
	 * 					�����б���,�ǿ����ж��������
	 *      String �ǲ����ĵ�����  
	 *      str    �ǲ���������
	 *             �������,����ôд ����ôд
	 *             ����Ҫ����֪��
	 * 
	 *   
	 * {}   ������  : ����������ʱ,��Ҫִ�еĴ���
	 *      ѭ����:  ѭ��ʱ,ѭ����Ҫִ�е�����
	 * 			
	 */
	public void show(String str) {
		
			
	}	
	public void buyFood(int money) {
		int money1 = 100;
		System.out.println("������ʦ����Ǯ"  + money + "ȥ����Ϸ��");
		System.out.println();
	}
	// �����ѧ���мٷ����������
	public void add() {
		System.out.println("������������");
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		int sum = input1  + input2;
		System.out.println("������������ĺ��� :" +sum );
		
	}
// String �Ǳ�ʾ����ֵ���������ַ�������   
//  	 
	public String goSchool(String name) {
		
		
		return "������ѧ��ѧ��"  + name;
	}
}