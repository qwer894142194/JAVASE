package com.lanou3g.extend;

public class Animal {
		/*
		 * ʲô�Ǽ̳�?
		 * java��������̵���������֮һ
		 * ��װ , �̳� , ��̬
		 * ��װ:
		 * ��java��ͨ���ؼ���private��protected��publicʵ�ַ�װ��
		 * ʲô�Ƿ�װ��
		 * ��װ�Ѷ����������ɲ��������һ�𣬷�װ�������������ö�������ݣ�
		 * ��װʵ����ʹ�÷���������������������������û�������޸ĺͷ������ݵĳ̶ȡ� 
		 * �ʵ��ķ�װ�����ó�ʽ�����������ά����Ҳ��ǿ�˳�ʽ��İ�ȫ�ԡ�
		 * 
		 * 
		 * �̳�:
		 * ����̳и���
		 * ������Լ̳и�������Ժͷ�����
		 * ����һ��������
		 * 
		 * �ٴ���һ��pig��
		 * 
		 * 
		 * 
		 * �̳е�����
		 */
	//��ʾ����
	private String kind;
	
	
	
	public void sleep() {
		System.out.println("����˯��");
	}
	public Animal() {
		super();
		System.out.println("--------��ӭ������������--------");
	}
	public Animal(String kind) {
		System.out.println("�������������� :" + kind);
	}
}
