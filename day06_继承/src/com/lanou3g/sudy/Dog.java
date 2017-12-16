package com.lanou3g.sudy;

public class Dog {
	/*
	 * 构造方法的重载
	 * 方法名相同(构造方法的方法名都是类名)
	 * 参数列表的不同
	 * 		参数的个数 , 参数的类型,参数的顺序
	 * 		这三个因素  ,只要有一个不同,那参数列表
	 * 		就是不同的
	 * 	啥叫做重载: 方法名的相同,参数列表的不同就叫做构造方法的重载
	 * 	
	 */
	
	//构造方法
	public Dog() {
		System.out.println("这是默认的空参的构造方法");
	}
	//方法的重载----------->方法的参数列表的不同-----参数类型,,参数个数,,,就可以叫做方法的重载!
	
	public Dog(String name) {
		System.out.println("这是带参数的构造方法,参数的name值是" + name);
	}
	public Dog(int age,String name) {
		System.out.println("我是带参数的构造方法,参数的类型是int型,我与上面的方法叫做方法的重载" + "我的年龄" + age +"我的名字是" +name);
	}
	/*
	 * 方法的重载
	 * 方法名相同,参数列表不同
	 * 与返回值与权限修饰符无关
	 * 
	 */
	
	private void eatBone(String boon,int n) {
		System.out.println("我叫你嗲");
	}
	
	public void eatBone() {
		eatBone("我",10);
		System.out.println("它以为它在吃骨头");
	}
	
	public String eatBone(String n){
		System.out.println("它以为它在吃骨头");
		return "骨头" + n;
	}
}
