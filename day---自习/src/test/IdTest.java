package test;
import java.util.Scanner;

public class IdTest {
		public static void main(String[] args) {
			IdStore us = new IdStore();
			Id newid = new Id();
			// ����һ��id ����
			//����һ��idStrore����
			
			
			while(true) {
				//д���ѭ����ԭ������һֱ�Ӱ������¼ϵͳ����
				
				
					//��������̨
			System.out.println("1.ע�� 2.��¼");
			Scanner scanner  = new Scanner(System.in);
			String input = scanner.nextLine();
		
			
			
			switch (input) {
			//switch��� ѡ�� ��¼ ע��
			//1��ע�� �˺�  ,,,Ȼ��idstore���еķ��� ���˺����뱣������
			case "1":
				System.out.println("�������˺�");
			newid.setUserName(scanner.nextLine());
				System.out.println("����������");
			newid.setPassWord(scanner.nextLine());
			us.addId(newid);
			System.out.println("ע��ɹ�,�Ƿ�ѡ���¼");
			break;
			
			
			//2���ǵ�¼  ����idstore�еķ���  ��ѯ id����������Ƿ�������˺�,����
			case "2":
				//�������һ��ѭ����ԭ���ǵ��˺�����������ش����,,��������¼
				 haha:for(int q = 0; q < 5; q++) {
				System.out.println("����������˺�");
				
				//�������һ��forѭ����Ϊ�˵��˺�������ȷʱ,��ȥ��������Ĳ���
				
				//���˺�������� ��,��ѭ����������
					for(int i = 3; i>0;i-- ) {
					Id userName =us.quaryIdByUserName(scanner.nextLine());
				if(userName  !=null) {
					
					System.out.println("�˺�������ȷ,�������������");
					break;
				}else {
					if(i-1 !=0) {
					System.out.println("�˺����벻��ȷ,�����������˺Ż���" +(i-1) + "�˻���");
					continue;
					} else {
						System.out.println("�����µ�¼");
					System.out.println("�����������˺�");
						continue haha;
						// ����ͳ���bug��  MD���˺ž������������ �����Ҳ��ֱ���������������ѭ����ȥ��
						//���bug�ķ���,,,�����������ѭ�������������,,,Ȼ���������Ϊ0ʱ,,,�������¿�ʼѭ��
					}
				}
				
				}
				
			//ͬ��  �����ѭ������	
						for(int j= 3; j>0;j-- ) {
							Id passWord = us.quaryIdByPassword(scanner.nextLine());
						
						if (passWord !=null) {
							System.out.println("������ȷ");
							System.out.println("��ӭ�������ڼ���");
							break;
						} else {
							if(j-1 !=0) {
							System.out.println("��������������,����" + (j-1) + "���������" );
							continue;
							}else {
								System.out.println("�����µ�¼");
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