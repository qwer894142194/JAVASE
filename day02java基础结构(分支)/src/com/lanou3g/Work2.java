package com.lanou3g;

import java.util.Scanner;

public class Work2 {
		public  static void main(String[] args) {
			//1 
//			double n  = 1000000000;
//			double i = 0;
//			
//			while (n /2 !=0 ) {
//				i++;
//				
//				
//			System.out.println(i);
//			}
//			System.out.println("������������" + i);
			
//		 
			// 2
//			int i = 1;
//			int q = 2;
//			int w = 3;
//			 if(i ==1) {
//				System.out.println("******************"); 
//			 }if(q == 2) {
//				 System.out.println(" ***     JAVA   ***");
//			 }if(w ==3) {
//				 System.out.println("   ******************");
//			 }
		//3.�ж�����ż��
//			Scanner sc = new Scanner(System.in);
//			System.out.println("������һ��������");
//			int num = sc.nextInt();
//			if(num % 2 ==0) {
//				System.out.println("������ż��");
//			}else {
//				System.out.println("����������");
//			}
			// 5.�ж�����
			// �ж�����ķ���
//			�١���ͨ���ܱ�4�����Ҳ��ܱ�100������Ϊ����.
//			�ڡ��������ܱ�400������������
//			�ۡ�������ֵ�ܴ�����,�������������3200,����������172800��������.��172800��������,86400�겻������
			Scanner sc = new Scanner(System.in);
			System.out.println("������һ�����");
			int year = sc.nextInt();
			if(year == 86400 ){
				System.out.println(year + "�겻������");}
			else if(year % 4 ==0 && year % 100 !=0) {
				System.out.println(year + "��������");
			}else if(year % 400 ==0) {
				System.out.println(year + "��������");
			}else if (year % 3200 ==0 && year % 172800==0) {
				System.out.println(year + "��������");
			} 
			else{
					System.out.println("���겻������");
		}
			// 4.�������
//			Scanner sc = new Scanner(System.in);
//			System.out.println("��������������");
//			int weight = sc.nextInt();
//			double haulage = 0;
//			if(weight < 50) {
//				haulage = weight*0.15;
//				System.out.println("���˷���" +haulage);
//			}else if(weight > 50) {
//				haulage = 50*0.15 + (weight - 50)*0.25;
//				System.out.println("���˷���" + haulage);
//			}else {
//				System.out.println("�������");
//			}
			// �ڶ���   �϶���ʹ��1 �� 100 1��50 1��20 1��10 1��5 3��1 ����
			
//			System.out.println("100Ԫ������" + hi +"50Ԫ������" + fi + "20Ԫ������"+ twi +"10Ԫ������"+ tei+"5Ԫ������"+ fii + "һԪ������" +oi );
		}
}