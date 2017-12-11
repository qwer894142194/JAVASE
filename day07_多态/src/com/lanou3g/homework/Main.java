package com.lanou3g.homework;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
import java.util.Set;

public class Main {
		public static void main(String[] args) {
			System.out.println("欢迎来到~~~宠物店");
			System.out.println("输入宠物的昵称");
			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine();
			
			System.out.println("1.狗狗 2.企鹅");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
				switch(input) {
				case "1" :
				Dog dog = new Dog();
				System.out.println("1.聪明的阿布拉多犬  2.酷酷的雪纳瑞" );
				Scanner sc2 = new Scanner(System.in);
				String input2 = sc2.nextLine();
				switch (input2 ) {
				case "1":
				
				dog.setName(name);	
				dog.setKind("聪明的阿布拉多犬");
				dog.sout();
				System.out.println("熊志祥");
				break;
				case "2":
					dog.setName(name);
					dog.setKind("酷酷的雪纳瑞");
					dog.sout();
					System.out.println("熊志祥");
					break;
				
				}
				break;
				case "2":
				Penguin penguin = new Penguin();
				System.out.println("1.Q仔  2.Q妹");
				Scanner sc3 = new Scanner(System.in);
				String input3 = sc3.nextLine();
				switch (input3) {
				case "1":
					penguin.setName(name);
					penguin.setKind("Q仔");
					penguin.sout();
					System.out.println("熊志祥");
					break;
				case "2":
					penguin.setName(name);
					penguin.setKind("Q妹");
					penguin.sout();
					System.out.println("熊志祥");
					break;
				}
				break;
			}
		}
}
