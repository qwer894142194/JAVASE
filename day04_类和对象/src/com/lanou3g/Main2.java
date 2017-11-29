package com.lanou3g;

import java.util.Scanner;

public class Main2 {
		public static void main(String[] args) {
			
//			 创建一个对象
			Father f = new Father();
			Mother m = new Mother();
			Child  c = new Child();
			//
//			Child xzx = null;
//			xzx.name = "xzx";
//			System.out.println(xzx.name);
//			Exception in thread "main" java.lang.NullPointerException
//			at com.lanou3g.Main2.main(Main2.java:13)
//          这样就会出现空指针异常
//			对象中 的属性赋值:
			f.age = 45;
			f.name = "f";
			f.price = 1000000;
			
			
			m.name = "m";
			m.age = 40;
			m.price = 10000;
			m.specialtyDish = "红烧肉";
			
			
			c.age = 22;
			c.girlFriend = "没有";
			c.school = "二师";
			c.alimony = 1.0E7;
			c.name = "c";
		
//		System.out.println("请输入1 和 2");	
//			Scanner  scanner= new Scanner(System.in);
//			int laowang =scanner.nextInt();
//			if(laowang == 1) {
//			System.out.println("爱是一到光, 绿到你发光");
//			}else if (laowang == 2) {
//					System.out.println("我听见了啪啪啪的声音, 你说你跑步在冲刺了");
//		}
			
//			 使用对象,调用它的方法去做一些事情	
//			对象名.方法名();
//	
//			f.showInfo();
//			对象名.属性 调用根据该类创建出来的对象的的属性
			
//			System.out.println("爸爸的名字: " + f.name);
//			m.showInfo();
//			c.showInfo();
			
			Student laoWang = new Student();
			laoWang.name = "老王";
			laoWang.school = "理工大学";
			laoWang.age = 22;
//			对象名.属性名 = 属性值;  就是给对象中的属性赋值的过程
			System.out.println(laoWang.name);
			laoWang.play();
			laoWang.goToSchool();
//		    	对象名.方法名  调用方法名 这个方法
			laoWang.name = "张三";
			System.out.println(laoWang.name);
			laoWang.buyFood(100);
//			System.out.println("w");
//			laoWang.play();
//			System.out.println();
			laoWang.add();
		
			
			
		}
}