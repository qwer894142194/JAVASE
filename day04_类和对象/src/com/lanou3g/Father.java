package com.lanou3g;
/**
 * 属性:
 * 姓名
 * 年龄
 * 工资
 * 
 * 
 * 
 * 
 * @author java-201707211014
 *
 */
public class Father {
		String name;
		int age;
		double price;
		/*
		 * 什么叫做方法:
		 * 就是对象的行为
		 */
	public void showInfo() {
		System.out.println("爸爸的名字: " + name + ";" + "爸爸的年龄 : " + age+ ";"  + "爸爸的工资  : " + price+ ":" );
}
}