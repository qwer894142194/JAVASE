package com.lanou4g;

import java.util.Scanner;

/**
 * 测试类
 * @author java-201707211014
 * @version 1.0.1
 */	
public class domo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//注册的多种形式 
		//		1.单行
		//		2.多行    
		//		3.文档形式
		/*
		 * 多行注释 
		 */
		/*
		 * 
		 */
		/**
		 * 文档注释
		 */ 
		//	定义一个变量 
		//	变量类型 变量名 = 初值；
		//  定义一个整型变量
		int a = 10; 
		//  打印时  字符串与任何类型一起拼接
		//	打印出来的都是字符串
		System.out.println("a的值是："  + a);
		int b = 16 ; 
		System.out.println("a= " + a + ", b= " +b);
		
		//byte字节
		//隐式转化
		//类型进行提升（小类型 提升到大类型）
		//强制转化
		byte c = 5;
//		自动提升为2个int类型的值 相加   
		c = (byte)(c + 2);
		System.out.println(c);
		
		// 运算符
		// + - * / %
		//变量名： 不能以数字下划线 除$以外的其他符号开头
		// 见名思意
		// 没有初始值的变量是不能使用的
		int num1 = 10,num2;
		num2= 5;
		System.out.println(num2);
		
		int num3 = 5;
		int num4 = 2;
		// 	双精度浮点型
		double num5 = 5.0;
		double num6 = 2.0;
		int num7 = 0;
		int num8 = num3 / num4;
		System.out.println(num8);
		//俩个整型运算结果只能是整型
		
		
		double num9 = num5 / num6;
		System.out.println(num9);
		
		// int num10 = num3/num7;
		// 当0作为被除数时  编译不会发生错误
		// 当时运行的时候 会报错
		// System.out.println(num10);
		
		//单精度浮点型(需要末尾加1 个小f 来表示这个变量是单精度浮点型)
		float f = 3.1f;
		
		boolean b1 = true;
		
		// 取余运算
		// 对1取余 值为0；
		// 对比自己大的 值除 值为自声
		// 当左边数<右边数 时 取余的值 等于左边的数
		// 当你对负数参数的 取余运算时
		// 以除数的符号 为取余后的值的符号  即值同为左边的数的正负
		
		System.out.println(-5 % 3);
		
		// 自增自减 （++）（--）
		// a++； ==>a = a + 1；
		// ++在前 运算时 先自增在进行运算或赋值  ++在后运算时  先参与运算 再进行自增；
		// 
		int i = 5;
		int k = i++;
		System.out.println("i = " + i + " ，k = " + k );
		
		
		// 控制台输入  （参照物 电脑） 
		// （输入和输出）参照物：电脑；
		
		Scanner scannerLanOu = new Scanner(System.in);
		// 取出控制台输入的值
		int m = scannerLanOu.nextInt();
		System.out.println(m);
		// 关闭scanner
		scannerLanOu.close();
		
		// 字符类型'a' 使用单引号
		// 字符型和整型可以相互转化；
		// ASCII
		char ch='a';
		System.out.println(ch);
		System.out.println((char)(ch + 1));
		
	     
		
				
				
	}

}
