package com.lanou3g.statics;
/*
 * 应用:
 * 多个对象共享同一个数据时
 * 当只需要使用类中的方法时,就可以用static方法,,不需要通过创建对象来调用方法
 */
public  class StaticDemo {
	    public	static String name = "熊志祥";
		 public  static int a = 10;
		  public int b = 1;
		
//		  System.out.println(b);
		  //static 修饰: 该方法是静态方法:
		  //  说明----静态的不依赖于对象 -----
		   // ------ -非静态的 依赖于对象
		public static void show() {
			System.out.println(a);
			// 这个时候就会报错  ,,,因为这个不能对非静态字段b进行静态引用                                
		}
}
