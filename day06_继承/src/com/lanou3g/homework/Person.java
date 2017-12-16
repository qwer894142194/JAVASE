package com.lanou3g.homework;
/*
 *  创建一个Person类
	在创建三个类继承它
	Person类有两个属性，两个方法
	子类有自己独有的属性和方法（个数任意）
	在创建一对父类子类（任意）
 */
public class Person {
		private String name;
		private String  sex;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public Person() {
			super();
			// TODO 自动生成的构造函数存根
		}
		public Person(String name, String sex) {
			super();
			this.name = name;
			this.sex = sex;
		}
		
		public void sleep() {
			System.out.println("我的的名称是" + getName() + ";我的性别是" + getSex() + ";我拥有的行为是:睡觉");
		}
		public void eat() {
			System.out.println("我的的名称是" + getName() + ";我的性别是" + getSex() + ";我拥有的行为是:吃饭");
		}
		
}
