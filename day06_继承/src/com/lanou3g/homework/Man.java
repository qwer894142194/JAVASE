package com.lanou3g.homework;

 class Man extends Person {
	private	String brag;
	private String girlfriend;
	public String getBrag() {
		return brag;
	}
	public void setBrag(String brag) {
		this.brag = brag;
	}
	public String getGirlfriend() {
		return girlfriend;
	}
	public void setGirlfriend(String girlfriend) {
		this.girlfriend = girlfriend;
	}
	public Man(String brag, String girlfriend) {
		super();
		this.brag = brag;
		this.girlfriend = girlfriend;
	}
	public Man() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	public void smoking() {
		System.out.println("我的名字是" + getName() + ";我的性别是" + getSex() + ";我喜欢抽烟" );
	}
	
	public void fight() {
		System.out.println("我是名字是"+   getName() +";我的性别是:" + getSex() + ";我喜欢打架");
	}
}
