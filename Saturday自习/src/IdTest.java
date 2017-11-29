import java.util.Scanner;

public class IdTest {
		public static void main(String[] args) {
			IdStore us = new IdStore();
			Id newid = new Id();
			while(true) {
			System.out.println("1.注册 2.登录");
			Scanner scanner  = new Scanner(System.in);
			String input = scanner.nextLine();
		
			switch (input) {
			
			
			case "1":
				System.out.println("请输入账号");
			newid.setUserName(scanner.nextLine());
				System.out.println("请输入密码");
			newid.setPassWord(scanner.nextLine());
			us.addId(newid);
			System.out.println("注册成功,是否选择登录");
			break;
			
			case "2":
				
				System.out.println("请输入你的账号");
				
				//这里添加一个for循环是为了当账号输入正确时,进去输入密码的步骤
				for(int i = 0; i<4;i++ ) {
					Id userName =us.quaryIdByUserName(scanner.nextLine());
				if(userName  !=null) {
					
					System.out.println("账号输入正确,请输入你的密码");
					break;
				}else {
					System.out.println("账号输入不正确,请重新输入账号");
					continue;
				}
				
				}
				
				Id passWord = us.quaryIdByPassword(scanner.nextLine());
				
				if (passWord !=null) {
					System.out.println("密码正确");
					System.out.println("欢迎来到辉腾集团");
				} else {
					System.out.println("请重新输入密码");
					String input2 = scanner.nextLine();
				}
				
				break;
			}
		}
	}

}