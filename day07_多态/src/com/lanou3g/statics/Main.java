package com.lanou3g.statics;

public class Main {
			public static void main(String[] args) {
			
			int b = StaticDemo.a;
			
			
			
			StaticDemo s1  = new StaticDemo();
			s1.a = 200;
			s1.show();
			StaticDemo.show();
			
			StaticDemo s2 = new StaticDemo();
			StaticDemo.show();
			s2.a = 300;
			s2.show();
			
			StaticDemo.show();
			
			
			
			}
			
			
			

}