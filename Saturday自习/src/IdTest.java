import java.util.Scanner;

public class IdTest {
		public static void main(String[] args) {
			IdStore us = new IdStore();
			Id newid = new Id();
			while(true) {
			System.out.println("1.ע�� 2.��¼");
			Scanner scanner  = new Scanner(System.in);
			String input = scanner.nextLine();
		
			switch (input) {
			
			
			case "1":
				System.out.println("�������˺�");
			newid.setUserName(scanner.nextLine());
				System.out.println("����������");
			newid.setPassWord(scanner.nextLine());
			us.addId(newid);
			System.out.println("ע��ɹ�,�Ƿ�ѡ���¼");
			break;
			
			case "2":
				
				System.out.println("����������˺�");
				
				//�������һ��forѭ����Ϊ�˵��˺�������ȷʱ,��ȥ��������Ĳ���
				for(int i = 0; i<4;i++ ) {
					Id userName =us.quaryIdByUserName(scanner.nextLine());
				if(userName  !=null) {
					
					System.out.println("�˺�������ȷ,�������������");
					break;
				}else {
					System.out.println("�˺����벻��ȷ,�����������˺�");
					continue;
				}
				
				}
				
				Id passWord = us.quaryIdByPassword(scanner.nextLine());
				
				if (passWord !=null) {
					System.out.println("������ȷ");
					System.out.println("��ӭ�������ڼ���");
				} else {
					System.out.println("��������������");
					String input2 = scanner.nextLine();
				}
				
				break;
			}
		}
	}

}