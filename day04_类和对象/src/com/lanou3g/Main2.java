package com.lanou3g;

import java.util.Scanner;

public class Main2 {
		public static void main(String[] args) {
			
//			 ����һ������
			Father f = new Father();
			Mother m = new Mother();
			Child  c = new Child();
			//
//			Child xzx = null;
//			xzx.name = "xzx";
//			System.out.println(xzx.name);
//			Exception in thread "main" java.lang.NullPointerException
//			at com.lanou3g.Main2.main(Main2.java:13)
//          �����ͻ���ֿ�ָ���쳣
//			������ �����Ը�ֵ:
			f.age = 45;
			f.name = "f";
			f.price = 1000000;
			
			
			m.name = "m";
			m.age = 40;
			m.price = 10000;
			m.specialtyDish = "������";
			
			
			c.age = 22;
			c.girlFriend = "û��";
			c.school = "��ʦ";
			c.alimony = 1.0E7;
			c.name = "c";
		
//		System.out.println("������1 �� 2");	
//			Scanner  scanner= new Scanner(System.in);
//			int laowang =scanner.nextInt();
//			if(laowang == 1) {
//			System.out.println("����һ����, �̵��㷢��");
//			}else if (laowang == 2) {
//					System.out.println("��������žžž������, ��˵���ܲ��ڳ����");
//		}
			
//			 ʹ�ö���,�������ķ���ȥ��һЩ����	
//			������.������();
//	
//			f.showInfo();
//			������.���� ���ø��ݸ��ഴ�������Ķ���ĵ�����
			
//			System.out.println("�ְֵ�����: " + f.name);
//			m.showInfo();
//			c.showInfo();
			
			Student laoWang = new Student();
			laoWang.name = "����";
			laoWang.school = "����ѧ";
			laoWang.age = 22;
//			������.������ = ����ֵ;  ���Ǹ������е����Ը�ֵ�Ĺ���
			System.out.println(laoWang.name);
			laoWang.play();
			laoWang.goToSchool();
//		    	������.������  ���÷����� �������
			laoWang.name = "����";
			System.out.println(laoWang.name);
			laoWang.buyFood(100);
//			System.out.println("w");
//			laoWang.play();
//			System.out.println();
			laoWang.add();
		
			
			
		}
}