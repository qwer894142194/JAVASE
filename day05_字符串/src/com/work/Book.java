package com.work;

public class Book {
	private String name;///����
	private double price; // ���
	private int  num;  //����
	
	//����set get
	public void setName(String n) {
		n= name;
	}
	public String getName() {
		return name;
	}
	//���set get
	public void setPrice(double s) {
		s = price;
		
	}
	public double getPrice() {
		return price;
	}
	//���� get set
	public void setNum(int n) {
		n = num;
	}
	public int getNum() {
		return num;
	}
	
	
	public void add() {
		System.out.println("����һ��û�з���ֵ,û�в���������鼮�ķ���");
	}
	
	public void sub(String name) {
		System.out.println("����һ���в���,û�з���ֵ�� ɾ���鼮�ķ���");
	}
	
	public String inquire(String name) {
		return "����һ���в���,�з���ֵ����,,ͨ�����ֲ�ѯ�鼮�ķ���"  +name;
		
 	}
	
	public String change() {
		return "����һ���з���ֵ,û����,,���ı��鼮��Ϣ�ķ���" + name ;
	}
	
}
