package com.lanou3g.extend;

public class Animal {
		/*
		 * 什么是继承?
		 * java面向对象编程的三大特性之一
		 * 封装 , 继承 , 多态
		 * 封装:
		 * 在java中通过关键字private，protected和public实现封装。
		 * 什么是封装？
		 * 封装把对象的所有组成部分组合在一起，封装定义程序如何引用对象的数据，
		 * 封装实际上使用方法将类的数据隐藏起来，控制用户对类的修改和访问数据的程度。 
		 * 适当的封装可以让程式码更容易理解和维护，也加强了程式码的安全性。
		 * 
		 * 
		 * 继承:
		 * 子类继承父类
		 * 子类可以继承父类的属性和方法的
		 * 创建一个动物类
		 * 
		 * 再创建一个pig类
		 * 
		 * 
		 * 
		 * 继承的特性
		 */
	//表示种类
	private String kind;
	
	
	
	public void sleep() {
		System.out.println("我在睡觉");
	}
	public Animal() {
		super();
		System.out.println("--------欢迎来到动物世界--------");
	}
	public Animal(String kind) {
		System.out.println("这个动物的种类是 :" + kind);
	}
}
