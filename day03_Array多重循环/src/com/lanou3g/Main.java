package com.lanou3g;

public class Main {
		public static void main(String[] args) {
			for(int i= 0; i<5;i++ ) {
				for(int j = 0 ; j < 5; j++) {
					System.out.print("*");
				}
					System.out.println();
			}
			
			// �˷��ھ��Ƶ����� 
			/*   �⳯��
			 *    *
			 *    **
			 *    ***
			 *    ****
			 *    *****
			 * 
			 */
			 
			for(int i = 0; i< 6; i++) {
				for(int j = 0; j  < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			/*
			 * �⳯��
			 *    *****
			 *    ****
			 *    ***
			 *    **
			 *    *
			 */
			System.out.println("-------------------------");
			for(int i =0; i < 5; i++) {
				for(int j =i; j <5;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("-----------------------");
			// д�˷��ھ�
			for(int i = 0;i <= 9; i ++) {
				// ���ѭ�� ��������
				for(int j = 1;j <=i ; j++) {
				// �ڲ�ѭ�� ��������  ,��˵ÿ�еĸ���
					// ��Ϊ�˷��ھ�ÿ�еĸ��������ε��� 1   
					    /*
					     *   * 
					     *   **
					     *   ***
					     *   ****
					     *   *****
					     *   ******
					     *   *******
					     *   ******** 
					     */
					System.out.print(j+  "*" + i + 		"=" + (i * j) + "\t");
					
				}
				System.out.println();
			}
			/*
			 * 
			 */
		}
}
