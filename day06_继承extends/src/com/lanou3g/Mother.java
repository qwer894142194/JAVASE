package com.lanou3g;

public class Mother {
	private String name;
	private Child child;
	private Father father;
	//child set
	public void setChild(Child child ) {
		this.child = child;
	}
	//father set
	public void setFather(Father father) {
		this.father = father;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showFamily() {
		System.out.println(name  + "的儿子:  是" + child.getName() + ";她丈夫是 :" +father.getName());
	}
	
}
