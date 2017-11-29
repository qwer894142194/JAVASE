package com.lanou3g;
import java.awt.datatransfer.FlavorTable;
/**
 * 0. 写总结
 * 1. 
 */
import java.util.jar.Attributes.Name;

/**
 * 我是文档注释
 * @author java-201707211014
 *    你在干什么
 */
public class HelloWorld {
	
		public static void main(String[] args) {
//			System.out.println("你好                世界");
//			System.out.println("Hello friend");
//			System.out.println("第一个java程序" );
//			System.out.println("第二个解决程序  " );
	  		
			// -> 我是单行注释
			/*
			 *   -> 我是多行注释  使用方法  /*回车
			 */
				int a = 10;
				System.out.println("a=" + a);
				int age = 18;
				//定义一个变量,
				//变量的值就是18 
				// 18实在内存中的,
				//如果我们使用
				//内存地址去找18的话,那么就是太费劲了
				//如果我们使用一个变量去找他的话,
				//age就是变量名
				System.out.println("age=" +age);

				// 下面这行代码,就会将括号中内容 输出到控制台  输出的是18 而不是age  因为会根据age这个变量,找到18这个值  
				System .out.println("age=" +age);
				double score = 91.72;
				int increment = 2;
				double secondscore =(int)(score +increment);
				System.out.println("第二次的平均分" +secondscore);
				int d = 1;
				// int 占据4个字节
				// long占据8个字节
				long l = 1;
				short r = 1;
				// short 型占据俩个字节
				byte w = 1;
				int i = r;
				// 这里就是大字节的赋值小字节的值,不会报错,因为装的下小字节的值;r变量只占俩个字节
				int k = (int) l;//如果这里不写(int) 就是说没有进行强行转化的话  就会 报错
				//因为long型占据的空间比int 型大; 所以说只能将字节少的转化为字节所占空间大的;
				//  这个操作就是强制转化 简称强转
				
				
				// 定义一个字符
				char c = 'a';
				int ic = c;
				// 使用int类型的变量ic接受c的值
				// 根据ascii表输出的值
				System.out.println();
				System.out.println("c的值是:" + ic);
				//强制转化   数据类型 标量名  = (要转化的数据类型) 要转化的变量
				// 语法:
				// 数据类型 变量名 [=值] - > 括号中的内容可以省略
				
				// byte 占据一个字节  八个二进制位
				// 0 1 占据一个字节
				// 二进制中八位构成一个字节
				
				
				int s;
				 s=0;
				double f = 0.35;
				char h = '男';
				System.out.println(h);
				
				System.out.println(f);
				
				// 驼峰命名法:
				// 小驼峰: 第一个单词首字母小写 ,后面的单词首字母大写  helloWorld
				// 大驼峰: 第一个单词首字母也大写
				
				// 字符串
				// 就是多个字符串起来
				String myName = "儿童劫";
				// 初始化就是给一个变量赋值的过程;
				//  如果只创建了变量,但是没有给这个变量赋值的话,
				//那么这个过程就叫做声明  
				// 如果不写myName的值   就是不赋值的话,输出这个变量名就会报错
				//变量名命名  只能字母 下划线,$符号,其他符号都不行,变量名不能重复; 
				System.out.println(myName);
				
				float j = 1.9898989898f;
				float j2 = 22455.23156644f;
				System.out.println(j);
				System.out.println(j2);
				//1.989899
				//22455.232
				double d1 = 1.9898989898;
				double d2 = 22455.23156644;
				System.out.println(d1);
				System.out.println(d2);
				//1.9898989898
				//22455.23156644
				// 输出的区别如上
				
		}	
}
