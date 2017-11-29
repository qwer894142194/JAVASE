package com.lanou3g;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Student {
	// 这四个都是属性
//	 现在还没有值呢
	
		String name;
		int age;
		String school;
		int id;
	
		
		
	public void play() {
		System.out.println(name + "玩游戏去了");
		
	
	}
	public void goToSchool() {
		System.out.println(name  + "上学去了,学校是" + school);
	}
	
	/*
	 * public 权限修饰符号
	 * void   返回值类型   void ---指的是没有返回值  
	 * show  方法名
	 * 注意:(String str) 参数列表     传参数进去,比如说你这个方法所要用到的数据,字符 啥的
	 * 					参数列表中,是可以有多个参数的
	 *      String 是参数的的类型  
	 *      str    是参数的名字
	 *             是任意的,想怎么写 就怎么写
	 *             但是要见名知意
	 * 
	 *   
	 * {}   方法体  : 方法被调用时,所要执行的代码
	 *      循环体:  循环时,循环所要执行的内容
	 * 			
	 */
	public void show(String str) {
		
			
	}	
	public void buyFood(int money) {
		int money1 = 100;
		System.out.println("拿着老师给的钱"  + money + "去打游戏了");
		System.out.println();
	}
	// 让这个学生有假发运算的能力
	public void add() {
		System.out.println("请输入俩个数");
		Scanner scanner = new Scanner(System.in);
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		int sum = input1  + input2;
		System.out.println("输入的俩个数的和是 :" +sum );
		
	}
// String 是表示返回值的类型是字符串类型   
//  	 
	public String goSchool(String name) {
		
		
		return "正在上学的学生"  + name;
	}
}