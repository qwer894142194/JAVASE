package com.lanou3g;

public class Test {
		public static void main(String[] args) {
			Shuju shuju = new Shuju();
			shuju.showInfo();
		}
}

 class Shuju{
	 int i;
	 byte b;
	 short s;
	 long l;
	 float f;
	 double d;
	 char c;
	 boolean boo;
	 
	 public void showInfo() {
		 System.out.println("整型的默认值 : " + i + ";" + "字节的默认值是: " + b + ";" + "短型的默认值是 : " + s + ";"  + "长整型的默认是 : " + l + ";" + "浮点型的默认值是 : " +f + ";" + "双精度浮点型的默认值是 : " + d + ";" + "字符的默认值是: " +c + ";" + "布尔型的默认值是 : " + boo);
	 }
 }