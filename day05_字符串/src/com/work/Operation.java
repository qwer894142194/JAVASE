package com.work;

public class Operation {
		private int num;
		private	String name;
		private	double price;
		
		
		//num 添加的get set
		public void seNum(int n) {
			n = num;
		}
		public int getNum() {
			return num;
		}
		//名字的get set
		public void setName(String n) {
			n = name;
		}
		public String getName() {
			return name;
			
		//价格的set get	
		}
		public void setPrice(double n) {
			n = price;
		}
		
		
	
		public double getPreice() {
			return price;
		}
		
		public void add() {
			System.out.println("这是一个没有参数,返回值的 加法运算");
		}
		
		public String sub() {
			return "这是一个没有参数,有返回值的减法运算";
		}
		public String multiplication(int num) {
			return "这是一个有返回值,有参数的乘法运算" + num;
		}
		public void division(String s) {
			System.out.println("这是一个没有返回值,有参数的除数运算,,,参数是字符创类型");
		}
}
