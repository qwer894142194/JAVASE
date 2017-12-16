package com.lanou3g.extend;

public class Car {
	  private int wheel;
	  private String color;
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		System.out.println("-----------我是父类中的setColor"  + color);
		this.color = color;
	}
	//构造方法
	public Car() {
		
	}
	public Car(int wheel, String color) {
	  super();
		this.wheel = wheel;
		this.color = color;
	}
	public void speed() {
		System.out.print("我的父类的方法,,,,我在加速||||");
	}
}
