package com.lanou3g;

public class Test {
		public static void main(String[] args) {
			Shuju shuju = new Shuju();
			shuju.showInfo();
		}
}

 class Shuju{
	 int i;
	 byte b;
	 short s;
	 long l;
	 float f;
	 double d;
	 char c;
	 boolean boo;
	 
	 public void showInfo() {
		 System.out.println("���͵�Ĭ��ֵ : " + i + ";" + "�ֽڵ�Ĭ��ֵ��: " + b + ";" + "���͵�Ĭ��ֵ�� : " + s + ";"  + "�����͵�Ĭ���� : " + l + ";" + "�����͵�Ĭ��ֵ�� : " +f + ";" + "˫���ȸ����͵�Ĭ��ֵ�� : " + d + ";" + "�ַ���Ĭ��ֵ��: " +c + ";" + "�����͵�Ĭ��ֵ�� : " + boo);
	 }
 }