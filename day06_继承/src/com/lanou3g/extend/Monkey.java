package com.lanou3g.extend;

public class Monkey extends Animal{

	public Monkey() {
		super("����");
		//super ����
		// super() �����ڵ��ø���ĿղεĹ��췽��
		// super("����") ���ڵ��ø����������ΪString�Ĺ��췽��
		System.out.println("i am a Great Sage Equalling Heaven ");
	}

	@Override
	public void sleep() {
		// super.sleep();
		// �����ڵ��ø����sleep����
		System.out.println("���Ǻ��ӵ�˯���ķ���");
		super.sleep();
	}


		
	
}
