package com.lanou3g.abs;
/*
 * abstract 抽象
 * 放在class前面
 */
public abstract class  Weather {
		
		/*
		 * abstract 关键字: 抽象的
		 * 解释一下抽象:
		 * 		 没有具体的对象,就是抽象
		 * --------	抽象是一个思维过程
		 * 
		 * java抽象: 
		 * 官方定义:
		 * 使用了关键词abstract声明的类叫作“抽象类”。
		 * 如果一个类里包含了一个或多个抽象方法，
		 * 类就必须指定成abstract（抽象）。
		 * “抽象方法”,属于一种不完整的方法，只含有一个声明，没有方法主体。
		 * 
		 * 
		 * abstract修饰的类就是抽象类
		 * 抽象类的特点:
		 * 不能直接同过new关键字创建该抽象类的对象
		 * 也就是说,抽象类不能new对象
		 * 
		 * 有抽象方法的类一定是一个抽象类
		 * 但是并不是说,抽象类一定有抽象方法
		 */
			//普通的方法
	public void show() {
		
	}
			// 这个就是抽象方法: 
	// 抽象方法与普通方法的区别:
	// 在权限修饰符后面加了一个abstract 关键字
	  public abstract void description();
	  // 抽象方法: 没有方法体的方法就是抽象方法
	  // 抽选方法一定要有abstract关键字修饰
}
