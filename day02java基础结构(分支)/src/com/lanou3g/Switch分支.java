package com.lanou3g;

import java.util.Scanner;

public class Switch��֧ {
   public static void main(String[] args) {
	   System.out.println("����,���������õ� ����");
//	  int rank = 1;
	   Scanner scanner  = new Scanner(System.in);
	   int input = scanner.nextInt();
	  int n = 5;
	  switch(input){
		  case 1:
			  System.out.println("��ϲ��:�����㽫�����ʡ����ѧ����Ӫһ����");
			  break;
		  case 2:
			  System.out.println("��ϲ��:�����㽫��û��ձʼǱ�����һ̨");
			  break;
		  case 3:
			 System.out.println("��ϲ��:�����㽫���Ӣ��Ӳ��");
			 break;
			 default:
				 System.out.println("�������");
				 break;
	  }
			// switch ���
//			 switch(n){
//			 case 1:
//				 System.out.println("û����1");
//				 break;
//				 // break ���ǽ������
//			 case 2:
//				 System.out.println("û����2");
//				 break;
//			 case 3:
//				 System.out.println("û����3");
//				 break;
//			default:
//				System.out.println("С��");
//				break;
//	  		}	 
//				 
		char ch = 'a';
		switch(ch) {
		case 'a':
			System.out.println("��������");
			break;
		case 'b':
			System.out.println("����Ů��");
			break;
		case 'c':
			System.out.println("��������");
			break;
		default:
			System.out.println("�������");
			break;
		}
	  
	  }

}
