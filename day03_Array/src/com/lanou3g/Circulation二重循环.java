package com.lanou3g;

import java.util.Scanner;

public class Circulation����ѭ�� {
		public static void main(String[] args) {
				
			
			Scanner sc = new Scanner( System.in);
			//��һ��ѭ�� ��ʾ�༶	
			for(int i = 1;i <= 4 ; i++) {
				System.out.println("�������" + i + "���༶ѧ���ĳɼ�" );
				// �ڶ���ѭ��  ÿ��ѭ��  ��Ҫ����һ��ѧ���ĳɼ�
				//  
				int classScore = 0;
				for(int j = 1; j <=5;j++) {
				int score = sc.nextInt();
				
				classScore = classScore + score;
				// ��ô�ܰѽ��ܵ��Ĳ�����������
				
				}
				
				System.out.println("��" + i + "���༶��ƽ���ɼ���:" + (classScore/5) );
				/*
				 * ���ĸ��༶, ÿ���༶��5��ͬѧ
				 */
			}
			
		}
}
