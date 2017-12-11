package com.lanou3g;

public abstract class Person {
	/*
	 * 虽然没有抽象方法,但是有abstract关键字修饰
	 * 所以这Person类也是一个抽象类
	 * 这种做法的唯一意义
	 * 就是不可以直接创建Person的对象
	 */
		public void work() {
			System.out.println("工作是为了赚钱");
		}
}
