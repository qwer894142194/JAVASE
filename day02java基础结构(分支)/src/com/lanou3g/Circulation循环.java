package com.lanou3g;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Circulationѭ�� {
		public static void main(String[] args) {
//			//while ѭ��
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//			System.out.println("��������ĳɼ�");
//		 while (num > 80 ) {
//			 System.out.println("��ĳɼ�������");
//			 break;
			 /*
			  * whileѯ��
			  * ���ж������е�����,�����ȷ,�Ƿ�Ϊtrue
			  * ���Ϊtrue
			  * ��ִ��
			  * ���������������
			  * ,Ȼ�����ж������е������Ƿ���ȷ ,�����ȷ
			  * ��һֱִ��
			  * ������Ϊfalseʱ,��ѭ��ֹͣ
			  * 
			  * ������whileѭ��ʱ,����Ҫ��ѭ�������ʼ��һ������
			  */
//		 }
//			System.out.println("1");
		   int i = 0;
		   int max = 0;
		   while(i < 100 ) {
			   // �������������ѭ����  
			   //С�����н���ѭ������ 
			   System.out.println(i);
////			   i++;
			   i = i+7;
			  // i*=7 -> i= i*7
			   max = i-7;
			   
			   // ѭ������
			   //Ϊ������ѭ��,��ֹ������ѭ��
			  
		   }
		   System.out.println("100��7�ı������ֵ��" +max);
		   	//do{ִѭ����} while(ѭ������) ѭ��
		   // 
			int progress = 1;
		   do{
			   progress+=2;
			   System.out.println(progress);
		   }while(progress > 10);
		  /*
		   * do-while ��while ������
		   * 
		   * do-while ����ִ��һ��ѭ����,Ȼ�����ж�
		   * 
		   * 
		   * while�����ж� ��ִ��ѭ����
		   */
		   
		   int w = 0;
		   do {
			  w++;
			  System.out.println("�ú�ѧϰ��������" +w);
		   }while(w < 100);
		}
}
