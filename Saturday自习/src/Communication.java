import java.util.Scanner;

/**
	 * Communication  ͨѶ
	 * 			����:
	 *  ģ��һ��ͨѶϵͳ;ҵ��Χ����
	 *   1.¼��ͨѶ¼��Ϣ
	 *   2.��ʾ����ͨѶ¼��Ϣ
	 *   3.��������
	 *   4.�Ա�����
	 *   5.�绰����
	 *   6.�˳�����....
	 *   
	 *   Ҫ��:
	 *   1.¼��ͨѶ¼��������,�Ա�,�绰
	 * @author java-201707211014
	 *
	 */
public class Communication {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������һ��С��15������");
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
				
				System.out.println("����ɵ����? ������ô�������");
			}
		}
}
  

