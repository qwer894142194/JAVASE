package com.lanou3g.homework;

public class Women extends Person{
	private String bwh;//三围
	private String boyfriend; // 有男朋友
	public String getBwh() {
		return bwh;
	}
	public void setBwh(String bwh) {
		this.bwh = bwh;
	}
	public String getBoyfriend() {
		return boyfriend;
	}
	public void setBoyfriend(String boyfriend) {
		this.boyfriend = boyfriend;
	}
	public Women(String bwh, String boyfriend) {
		super();
		this.bwh = bwh;
		this.boyfriend = boyfriend;
	}
	public Women() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	//女人的行为
	public void buyClothes() {
		System.out.println("我的名字是 : " + getName() + ";我的性别是 : " + getSex() + ";我喜欢买衣服");
	}
	public void giveChild() {
		System.out.println("我的名字是 : " + getName() +";我的性别是 : " + getSex() + ";我会生孩子");
	}
	
	
}
