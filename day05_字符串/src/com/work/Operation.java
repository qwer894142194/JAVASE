package com.work;

public class Operation {
		private int num;
		private	String name;
		private	double price;
		
		
		//num ��ӵ�get set
		public void seNum(int n) {
			n = num;
		}
		public int getNum() {
			return num;
		}
		//���ֵ�get set
		public void setName(String n) {
			n = name;
		}
		public String getName() {
			return name;
			
		//�۸��set get	
		}
		public void setPrice(double n) {
			n = price;
		}
		
		
	
		public double getPreice() {
			return price;
		}
		
		public void add() {
			System.out.println("����һ��û�в���,����ֵ�� �ӷ�����");
		}
		
		public String sub() {
			return "����һ��û�в���,�з���ֵ�ļ�������";
		}
		public String multiplication(int num) {
			return "����һ���з���ֵ,�в����ĳ˷�����" + num;
		}
		public void division(String s) {
			System.out.println("����һ��û�з���ֵ,�в����ĳ�������,,,�������ַ�������");
		}
}
