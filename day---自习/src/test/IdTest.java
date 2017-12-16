package test;
import java.util.Scanner;

public class IdTest {
		public static void main(String[] args) {
			IdStore us = new IdStore();
			Id newid = new Id();
			// 创建一个id 对象
			//创建一个idStrore对象
			
			
			while(true) {
				//写这个循环的原因是在一直子啊这个登录系统里面
				
				
					//声明控制台
			System.out.println("1.注册 2.登录");
			Scanner scanner  = new Scanner(System.in);
			String input = scanner.nextLine();
		
			
			
			switch (input) {
			//switch语句 选择 登录 注册
			//1是注册 账号  ,,,然后idstore类中的方法 将账号密码保存起来
			case "1":
				System.out.println("请输入账号");
			newid.setUserName(scanner.nextLine());
				System.out.println("请输入密码");
			newid.setPassWord(scanner.nextLine());
			us.addId(newid);
			System.out.println("注册成功,是否选择登录");
			break;
			
			
			//2就是登录  调用idstore中的方法  查询 id这个数组中是否有这个账号,密码
			case "2":
				//最外层套一个循环的原因是当账号密码输入多重错误后,,重新来登录
				 haha:for(int q = 0; q < 5; q++) {
				System.out.println("请输入你的账号");
				
				//这里添加一个for循环是为了当账号输入正确时,进去输入密码的步骤
				
				//当账号输入错误 后,用循环重新输入
					for(int i = 3; i>0;i-- ) {
					Id userName =us.quaryIdByUserName(scanner.nextLine());
				if(userName  !=null) {
					
					System.out.println("账号输入正确,请输入你的密码");
					break;
				}else {
					if(i-1 !=0) {
					System.out.println("账号输入不正确,请重新输入账号还有" +(i-1) + "此机会");
					continue;
					} else {
						System.out.println("请重新登录");
					System.out.println("请重新输入账号");
						continue haha;
						// 这里就出现bug了  MD的账号就算输入错误了 他妈的也会直接跳到密码输入的循环中去了
						//解决bug的方法,,,就是在最外层循环哪里起个名字,,,然后当输入机会为0时,,,继续从新开始循环
					}
				}
				
				}
				
			//同上  密码的循环输入	
						for(int j= 3; j>0;j-- ) {
							Id passWord = us.quaryIdByPassword(scanner.nextLine());
						
						if (passWord !=null) {
							System.out.println("密码正确");
							System.out.println("欢迎来到辉腾集团");
							break;
						} else {
							if(j-1 !=0) {
							System.out.println("请重新输入密码,还有" + (j-1) + "次输入机会" );
							continue;
							}else {
								System.out.println("请重新登录");
								break;
								}
							}	
						}
					}
				break;
				}
			}
			
		}		
}