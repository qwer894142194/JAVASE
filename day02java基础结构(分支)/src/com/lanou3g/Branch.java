package com.lanou3g;

import java.util.Scanner;

public class Branch {
		public static void main(String[] args) {
//			int score = 50;
//			if (score >= 80) {
//				System.out.println("����");
//			} else if (score >= 60) {
//				System.out.println("�е�");
//			} else {
//				System.out.println("��");
//			}
//			//
//			if (score > 48) {
//				System.out.println("����İ�");
//			}
//	
//		 int time = 8;
//		 // 0 ��ʾ��  1 ��ʾŮ
//		 int  genter = 0;
//		 if(time < 10 ) {
//			 System.out.println("�������");
//		 }
//		 if(genter ==0){
//			 System.out.println("������������");
//		 }
//		 else if(genter ==1) {
//			 System.out.println("����Ů������");
//		 }else{
//	     		System.out.println("pass");	
//		}
//				 
//				 
		int time  = 8;
		String sex = "��";
		if (time < 10 && sex == "��") {
			System.out.println("�������Ӿ�����");
		}else if(time < 10 && sex =="Ů" ){
			System.out.println("����Ů�Ӿ�����");
		}
	    
		System.out.println("������ʱ��");
		Scanner  sc = new Scanner(System.in);
		int input = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int input2 = sc2.nextInt();
		
		if(input < 10) {
			System.out.println("�������");	
			System.out.println("�������Ա�  / 1 -��  2-Ů");
			
		} if(input2 ==1){
			System.out.println("�������Ӿ�����");
		} else if(input2==2) {
			System.out.println("����Ů�Ӿ�����");
		}else {
			System.out.println("�������");
		}
		 
	}	
}		

