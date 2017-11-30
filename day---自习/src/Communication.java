import java.util.Scanner;

/**
	 * Communication  通讯
	 * 			需求:
	 *  模拟一个通讯系统;业务范围如下
	 *   1.录入通讯录信息
	 *   2.显示所有通讯录信息
	 *   3.姓名搜索
	 *   4.性别搜索
	 *   5.电话搜索
	 *   6.退出功能....
	 *   
	 *   要求:
	 *   1.录入通讯录包含姓名,性别,电话
	 * @author java-201707211014
	 *
	 */
public class Communication {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个小于15的数字");
			int input = sc.nextInt();
			
			if(input < 15 ) {
				for(int l = 0; l < 10; l++) {
			 for (int i =0; i < input; i++) {
				for(int j = 0;j< i;j++) {
				 System.out.print(" ");	
				}
				
				for(int k =0; k < 5; k++) {
					System.out.print("-");
				}
				System.out.println();
				
			 }
			 for (int i =0; i <= input; i++) {
					for(int j = i;j<input;j++) {
					 System.out.print(" ");	
					}
					
					for(int k =0; k < 5; k++) {
						System.out.print("-");
					}
					System.out.println();
					
	
			 }
				}
			}else {
				
				System.out.println("你是傻逼吗? 输入那么大的数字");
			}
		}
}
  

