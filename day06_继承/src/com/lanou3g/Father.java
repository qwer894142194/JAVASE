package com.lanou3g;



public class Father {
		/*
		 * ��������һ������ һ������
		 * 
		 * ��������û��Mother���child��
		 * ��������ȥ����һ��
		 */
	private Mother wife;
	private Child  child;
	
	private String name;
	//wife  get set
	//father.setWife(mother) mother���������wife
	public void setWife(Mother wife) {
		this.wife = wife;
	}
//	public Mother getWife() {
//		return wife;
//	}
	//child get set
	public void setChild(Child child) {
		this.child = child;
	}
//	public Child getChild() {
//		return child;
//	}
	
	// �����ʾ���������
	//name set get ����
	public void  setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void showFamily() {
		System.out.println(name + "������:  ��" +wife.getName() + ";���ĺ�����" + child.getName());
	}
}



 
 

