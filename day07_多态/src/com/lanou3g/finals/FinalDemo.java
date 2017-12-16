package com.lanou3g.finals;

public class FinalDemo {
			/*
			 * final关键字表示最终,不可变
			 * 
			 * 被final修饰的类,不可以被继承
			 * 别final修饰的方法,不可以被复写
			 * 被final修饰的变量,不可以被改变
			 * 
			 */
	// 不让子类修改 ,,复些该方法,,,就可以用final
		final int AGE=10;  // final修饰的变量一般全大写
		public final void show() {
			//AGE = 20;		//报错说明无法修改这个值
			System.out.println("哈哈");
		}
}
