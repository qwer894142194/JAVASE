package com.lanou3g;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ��ʶ����:������������
 * @author java-201707211014
 *
 */
public class Array {
		public static void main(String[] args) {
	// ����:��ͬ���͵����ݵ�һ������
	// ��Ҫһ����������������  new �ڶ��ڴ��п�����һ���µĿռ�
	//������е����ݾ����ڶ��ڴ��п�����һ�������Ŀռ�
		int[] arr = {98,85,858,12};
		
		/*
		 * arr ���Ǳ�ʶ�� ,��������������
		 * int ��ʾ ��������п���װ������
		 * int[]��ʾ������������
		 * 
		 * {}�е�����,����������������
		 * 
		 * 
		 * �±����Ԫ����������������λ��
		 * �±��Ǵ�0��ʼ��
		 * 			Ԫ���������е�λ��
		 * 			��0��ʼ����
		 * 		�����е����һ��Ԫ�ص��±�
		 *   		���鳤��-1
		 * 
		 */
		// ����̨����İ���

		
		// ��������ķ�ʽ1   ���巽ʽ1
		int[] array = {90,80,70,60,50};
		int a = array[0];  // ����дһ��array[0];  ���൱����дһ��  90;  û�и�ֵ�������ͻᱨ�� 
		System.out.println(array[0]);
		
		// ��������ķ�ʽ2
		// ����Ӳ������
		int[] array2 = new int[30];
		int[]	score= new int[3];// ����30������Ϊint ����
		//score[4] =50;
				//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
		//at com.lanou3g.Array.main(Array.java:46)          �����±곬���� ����(Խ��)
		Scanner input = new Scanner(System.in);
		System.out.println("������3��ѧ���ĳɼ�");
		for(int i= 0; i <score.length;i++ ) {
			// score.length ��ʾ����score�ĳ���
			// i < 3  3  ��������ĳ��� ���Խ���ĳ�����ĳ���   ������.length
			System.out.println("�������" + (i+1) + "��ѧ���ĳɼ�");
			
		int student =input.nextInt();
		//  �����ܵ�ֵ��ֵ��student;
			score[i] = student;
			if(student < 60) {
				System.out.println("��ͬѧ�ɼ�������");
			}else if(student > 75) {
				System.out.println("��ͬѧ�ɼ�����");
			}
			// ��student��ֵ��ֵ��score[i]
			System.out.println("��" + (i+1) + "��ѧ���ĳɼ�" +score[i]);
			// �̶�д�� ����ֱ�����score������  ******************
			System.out.println(Arrays.toString(score));
			
		}
		
		}
}