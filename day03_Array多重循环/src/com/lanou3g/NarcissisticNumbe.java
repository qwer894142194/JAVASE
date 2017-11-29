package com.lanou3g;

import java.util.Scanner;

/**
 * 水仙花数的打印
 * @author java-201707211014
 *
 */
public class NarcissisticNumbe {
		public static void main(String[] args) {
			/*
			 *什么叫做水仙花数
			 *水仙花数（Narcissistic number）也被称为超完全数字不变数（pluperfect digital invariant, PPDI）、
			 *自恋数、自幂数、阿姆斯壮数或阿姆斯特朗数（Armstrong number），水仙花数是指一个 n 位数（n≥3 ）
			 *，它的每个位上的数字的 n 次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）。 
		
			 */
			
			Scanner sc  = new Scanner(System.in);
		
		System.out.println("请输入3位数以上");
		int input =	sc.nextInt();
		if(input < 1000  && input > 100) {
		int hundredsDigit 	= input / 100;  // 获得百位数上的数字
		int t = input % 100;
		int tensDigit =  t / 10; // 获得10位数上 的数字
		int td = t % 10;
		
		int unitsDigit = td /1; 
		
			System.out.println(input +"的水仙花数是:" + hundredsDigit +"*"+ hundredsDigit +"*"+hundredsDigit +"+"+tensDigit+"*"+tensDigit +"*"+tensDigit+"+"+unitsDigit+"*"+unitsDigit
					+"*" +unitsDigit + "=" +input );
					
		}else if(input > 1000 && input < 10000) {
			int ThousandsOfDigits = input / 1000;// 或得千位数上那个数
			int to = input % 1000;
			int hundredsDigit = to /100;// 获得百位数上的数字
			int t = to % 100; 
			int tensDigit =  t / 10;// 或得100位数上那个数
			int ud = t%10;
			int unitsDigit = ud /1;  // 或得个位数上那个数
			System.out.println(input +"的水仙花数是:" +ThousandsOfDigits+"*"+ThousandsOfDigits+"*"+ThousandsOfDigits+"+" + hundredsDigit +"*"+ hundredsDigit +"*"+hundredsDigit +"+"+tensDigit+"*"+tensDigit +"*"+tensDigit+"+"+unitsDigit+"*"+unitsDigit
					+"*" +unitsDigit + "=" +input );
		}else{
			System.out.println("输入错误 请输入10000以内的数,本人比较懒,大于10000的真的不想写了");
		}
		}
		
		
}
