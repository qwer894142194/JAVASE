package com.lanou3g.sudy;

public class Dog {
	/*
	 * ���췽��������
	 * ��������ͬ(���췽���ķ�������������)
	 * �����б�Ĳ�ͬ
	 * 		�����ĸ��� , ����������,������˳��
	 * 		����������  ,ֻҪ��һ����ͬ,�ǲ����б�
	 * 		���ǲ�ͬ��
	 * 	ɶ��������: ����������ͬ,�����б�Ĳ�ͬ�ͽ������췽��������
	 * 	
	 */
	
	//���췽��
	public Dog() {
		System.out.println("����Ĭ�ϵĿղεĹ��췽��");
	}
	//����������----------->�����Ĳ����б�Ĳ�ͬ-----��������,,��������,,,�Ϳ��Խ�������������!
	
	public Dog(String name) {
		System.out.println("���Ǵ������Ĺ��췽��,������nameֵ��" + name);
	}
	public Dog(int age,String name) {
		System.out.println("���Ǵ������Ĺ��췽��,������������int��,��������ķ�����������������" + "�ҵ�����" + age +"�ҵ�������" +name);
	}
	/*
	 * ����������
	 * ��������ͬ,�����б�ͬ
	 * �뷵��ֵ��Ȩ�����η��޹�
	 * 
	 */
	
	private void eatBone(String boon,int n) {
		System.out.println("�ҽ�����");
	}
	
	public void eatBone() {
		eatBone("��",10);
		System.out.println("����Ϊ���ڳԹ�ͷ");
	}
	
	public String eatBone(String n){
		System.out.println("����Ϊ���ڳԹ�ͷ");
		return "��ͷ" + n;
	}
}
