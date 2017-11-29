package com.work;

public class Book {
	private String name;///书名
	private double price; // 书价
	private int  num;  //书编好
	
	//书名set get
	public void setName(String n) {
		n= name;
	}
	public String getName() {
		return name;
	}
	//书价set get
	public void setPrice(double s) {
		s = price;
		
	}
	public double getPrice() {
		return price;
	}
	//书编号 get set
	public void setNum(int n) {
		n = num;
	}
	public int getNum() {
		return num;
	}
	
	
	public void add() {
		System.out.println("这是一个没有返回值,没有参数的添加书籍的方法");
	}
	
	public void sub(String name) {
		System.out.println("这是一个有参数,没有返回值的 删除书籍的方法");
	}
	
	public String inquire(String name) {
		return "这是一个有参数,有返回值类型,,通过名字查询书籍的方法"  +name;
		
 	}
	
	public String change() {
		return "这是一个有返回值,没参数,,来改变书籍信息的方法" + name ;
	}
	
}
