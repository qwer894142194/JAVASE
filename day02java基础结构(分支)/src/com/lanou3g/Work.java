package com.lanou3g;

import java.util.Scanner;

public class Work {
		public static void main(String[] args) {
			/*
			 * ��������:
			 * ѭ������5�ų��ɼ�
			 * ����: �϶�Ҫʹ��scanner ����ؼ���
			 * 
			 * ѭ��: ����Ҫ�õ�ѭ��
			 * 
			 */
			System.out.println("������5�ǳɼ�");
			
			System.out.println();
			Scanner sc = new Scanner(System.in);
			// ���ﶨ������������Ϊ����ƽ����
			int sum = 0;
			int average;
			// ��ʾ���
			System.out.println("�������һ�ųɼ�");
			for(int i = 1; i< 6; i++) {
				
			int score = sc.nextInt();
			
			System.out.println("��"+ i + "�ųɼ�������" +score);
			System.out.println("�������" +(i+1)+ "�ųɼ�");
			sum = sum + score ;
			// ��һ������5�ŵĳɼ���
			}
			// ��һ��������ƽ���ֵ�
			average = sum / 5;
			// ���ƽ����
			System.out.println("����ƽ������"+average);
			
		}
}
