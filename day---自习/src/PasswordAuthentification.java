import java.util.Scanner;

import javax.naming.ldap.SortControl;

/**
 * 今天作业:
在main方法中定义三个变量:账号，密码，用户昵称

账号密码用int类型即可

1.提示用户输入账号，账号正确后提示输入密码，若错误提示账号不正确请重新输入

2.用户输入密码后匹配密码是否正确，若正确提示:欢迎xxx登录系统
不正确则提示重新输入
		思路:
			1. 本体应用的知识点:
			 应该有scanner 的性质: 阻塞性
			   continue:
			   break : 
			   	俩个关键字的性质
 * @author java-201707211014 
 * 0000000000000
 *
 */
public class PasswordAuthentification {
		public static void main(String[] args) {
			int usename = 894142194;
			int password = 894142194;
			String name = "熊志祥";
			
			Scanner us = new Scanner(System.in);
			
			
//			switch (input) {
//			case 894142194:
//				System.out.println("账号输入正确");
//				System.out.println("请接着输入密码");
//				break;
//			default :
//				System.out.println("账号输入不正确,请重新输入");
//			}
			// 第一个for 循环是用来输入账号的
			for (int i = 0;i <10 ;i++ ) {
				System.out.println("请输入账号,友情提示:账号与你的QQ号有关");
				int input =  us.nextInt();
				if(input == usename) {
					
					System.out.println("账号输入正确,请继续输入密码");
					break;
					// break 是用来当账号正确时,跳出循环,走进下一个循环
				}else {
					System.out.println("傻逼,账号不正确,请继续输入账号");
					continue;
					// continue 是用来当账号输入不正确时,重新循环,继续输入账号
				}
			}
			// 第二个for循环是用来输入密码的
			for(int i = 0;i < 3;i++ ) {
				System.out.println("请输入密码,友情提示:密码 与你的qq号有关");
				int input =  us.nextInt();
				if(input == password) {
					
					System.out.println("密码输入正确");
					break;
					// break 是用来当密码输入正确时,跳出循环
				}else {
					System.out.println("傻逼,密码输入不正确,请继续输入密码");
					continue;
					// continue是用来当密码输入 不正确时,重新循环,继续输入密码
			
				}
			}
			// 因为scanner 是有阻塞性的,当前面俩个循环都没有完成时,该步骤就无法走到,也就不会输出 该语句
			System.out.println("欢迎" + name + "进入编程世界");
		}
}
