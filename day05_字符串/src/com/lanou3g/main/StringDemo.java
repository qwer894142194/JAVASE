package com.lanou3g.main;

import test.Student;

public class StringDemo {
			public static void main(String[] args) {
				/*
				 * String 类
				 * 表示字符串
				 * 注意: 字符串不是基本数据类型
				 * 基本数据类型
				 * int byte short long float double boolean char 
				 * 
				 * 
				 * 
				 * 
				 * 匿名对象: 
				 */
				//注意:::::: 字符串是不可变的 ,,,,当一个字符串被创建后,,,它不可能再发上变化
				// 就是字符串被创建后,,在data中就会保存  ,,,不会发生改变
				// 当要修改时,,,系统会先查看data中是否有所要改变的字符串,,,如果没有,,,就会在data中重新创建出一个新的字符串
				String s1 = "S";
				String s2 = "s";
				Student student = new Student();
				
				String s3 = new String("S");
				String s4 = new String("s");
				System.out.println("我是 s1:" +s1);
				System.out.println("我是s2" + s2);
				System.out.println("我是s3 " + s3);
				System.out.println("我是s4"  + s4);
				// s1 = s2 是将s2 的值赋值给s1
				
				System.out.println(s1);
				System.out.println(s3 = s4);
				System.out.println(s3 == s4);
				System.out.println(s1 == s2);
				System.out.println("-------------------");
				// 判断俩个字符串的内容是否相等
				
				System.out.println(s1.equalsIgnoreCase(s2));
				System.out.println(s1.equals(s2));
				
				
				int a= 1;
				String q = "ss";
				int b = 2;
				String w = "w";
				int c =3;
				int d = 4;
				int e = 5;
				
				
				System.out.println(a+q+b+w + c + d +e);
				
				
				
				
			}
}
