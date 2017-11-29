package com.lanou3g.main;

import test.Student;

public class Main {
		public static void main(String[] args) {
			Student  student = new Student();
			student.smile();
	  
			// student.cry();
			// cry 是private 修饰的 ,, ,, 所以在student 类外面找不到
			// cry是不可视 的 ----> 在其他类中是找不到的-----> 
			// 从上面的一句话 报错 我们就可以看出来 public 与 private 的差异:
			// public 公有权限修饰符: 修饰的方法:
			// private 私有化权限修饰符:
			Student st ;
			st =student;
			System.out.println(st);
			/*
			 * angry是protected修饰的
			 * 所以在test包外面是找不到的
			 * 这就做同包可用
			 * 因为main所在的包,,,与student这个类
			 * 所在的不是同一个包,,,所以不可用
			 */
			//	st.angry(); // protected 修饰的方法也会报错
			//st.sad();
			// sad方法声明中,.,,没有修饰词
			// 表示默认的,,,只有同包下可以使用
			for(int i = 0 ; i < 100 ; i++ ) {
				
				
			}	
			
	
			
			
		}
}