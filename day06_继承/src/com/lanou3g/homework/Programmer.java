package com.lanou3g.homework;

public class Programmer {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Programmer(String name) {
		super();
		this.name = name;
	}

	public Programmer() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public void wirte() {
		System.out.println("����һ������Ա");
	}
}
