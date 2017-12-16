package com.lanou3g.homework;

public class Dog extends Animal{
	private int health = 100;
	private int intimacy = 0;
	private String kind;
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getIntimacy() {
		return intimacy;
	}
	public void setIntimacy(int intimacy) {
		this.intimacy = intimacy;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void sout() {
		System.out.println("宠物自述:");
		System.out.println("我的名字叫" + getName() + ",健康值是" +getHealth() +",和主人的亲密度是" + getIntimacy() + ",品种是" + getKind());
	}
	@Override
	public void show() {
		// TODO 自动生成的方法存根
		
	}
}
