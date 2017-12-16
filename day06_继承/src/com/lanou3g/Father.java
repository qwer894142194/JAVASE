package com.lanou3g;



public class Father {
		/*
		 * 父里面有一个妻子 一个孩子
		 * 
		 * 现在我们没有Mother类和child类
		 * 所以我们去创建一个
		 */
	private Mother wife;
	private Child  child;
	
	private String name;
	//wife  get set
	//father.setWife(mother) mother就是这里的wife
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
	
	// 这个表示付清的名字
	//name set get 方法
	public void  setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void showFamily() {
		System.out.println(name + "的妻子:  是" +wife.getName() + ";他的孩子是" + child.getName());
	}
}



 
 

