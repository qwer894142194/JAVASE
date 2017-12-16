package com.lanou3g.extend;

public class Monkey extends Animal{

	public Monkey() {
		super("猴子");
		//super 超类
		// super() 就是在调用父类的空参的构造方法
		// super("猴子") 就在调用父类参数类型为String的构造方法
		System.out.println("i am a Great Sage Equalling Heaven ");
	}

	@Override
	public void sleep() {
		// super.sleep();
		// 就是在调用父类的sleep方法
		System.out.println("我是猴子的睡觉的方法");
		super.sleep();
	}


		
	
}
