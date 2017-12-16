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
		// TODO 自动生成的构造函数存根
	}
	
	public void wirte() {
		System.out.println("我是一名程序员");
	}
}
