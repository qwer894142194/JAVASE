package com.lanou3g;

import java.util.Arrays;
import java.util.Scanner;

public class Main5Sort {
	public static void main(String[] args) {
		/*
		 * ����һ�����������ܳɼ�
		 */
		// ����һ������ �����������ֵ
		int max = 0;
		int[] student = new int[5];
		Scanner input = new Scanner(System.in);
		for(int i = 1; i <= student.length;i++) {
			System.out.println("�������"  + i + "��ѧ���ĳɼ�");
			
			 int score = input.nextInt();
			 student[i-1]  = score;
			 // �����ֵ��ֵ�����ı���max
			 if(score > max) {
				 max = score;
			 }
		// ��ʵ����������������ķ���  ; ������õ���������ķ����ǽ������е�ֵ��С���������  ��������ֵ,���������±������Ǹ�ֵ	
		// 	 
		}
		 System.out.println("�ɼ���������� :"+max);
		// ������������� �̶�д��
		Arrays.sort(student);
		// Ӧ����ֱ��ʹ������ΪArrays(�����������)�еķ���sort(����)  �����൱��ֱ��ʹ�ø÷���   // Ӧ��������Arrays�� ��sort�ķ���   arrays.sort
		System.out.println(Arrays.toString(student));	
		System.out.println("������ɼ���" + student[4]);
	}
}
