package com.lanou3g.sudy;

public class Main {
		public static void main(String[] args) {
			//我们一直写的new xxx();  
			//实际上这个xxx() 就是一个构造方法
			//只不过这个构造方法是没有参数的
			//每一个类中,都会有一个
			//默认的没有参数的构造方法
			//以后没有参数我们就简称空参
			//刚刚我们自己在Cat中写了一个带参数的构造方法
			//那么就会把默认的空参的构造方法覆盖
			//这里的new Cat()还是去找空参的 构造方法
			//这里找不到了 就会报错
			Person xiaowang = new Person();
			Cat cat = new Cat(xiaowang);
			
			// 这是在对象创建后,设置name 的属性.....
			cat.setName("小白");
			cat.setOwner(xiaowang);
			xiaowang.setName("张三");
			cat.showOwner();
			/*
			 * 构造方法
			 * 我们的要求是,每个猫对象创建出来时,
			 * 都已经有了一个主人
			 * 而set方法,在对象被创建出来后,才可以被调用
			 * 执行的...这不符合我们的要求
			 * 
			 * java给我们提供了  一个叫构造方法的东西
			 * 
//			 * 可以帮助我们,在对象初始时,给属性
			 * 
			 * 
			 */
			
		}
		
}
