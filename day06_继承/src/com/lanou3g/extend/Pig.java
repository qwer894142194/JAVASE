package com.lanou3g.extend;

public class Pig extends Animal {
/*
 * extends  关键字:继承
 * A extends B
 * 就是A类继承B类,只有在类的声明时使用
 * 
 * 
 * 
 * 
 * 
 */
	/*子类继承父类的属性和方法
	 * 然后又定义可自己独有的属性或方法
	 * 这个过程叫做扩展
	 * (言外之意就是子类可以有自己独有的属性,和方法....)
	 * 
	 * 
	 */
	
	//被杀掉吃肉了
		public void beKilledToMeat() {
			System.out.println("被杀掉吃了");
		}

		public Pig() {
			super("猪");
			// TODO 自动生成的构造函数存根
		}

		
		
}
