import java.util.Scanner;

import javax.naming.ldap.SortControl;

/**
 * ������ҵ:
��main�����ж�����������:�˺ţ����룬�û��ǳ�

�˺�������int���ͼ���

1.��ʾ�û������˺ţ��˺���ȷ����ʾ�������룬��������ʾ�˺Ų���ȷ����������

2.�û����������ƥ�������Ƿ���ȷ������ȷ��ʾ:��ӭxxx��¼ϵͳ
����ȷ����ʾ��������
		˼·:
			1. ����Ӧ�õ�֪ʶ��:
			 Ӧ����scanner ������: ������
			   continue:
			   break : 
			   	�����ؼ��ֵ�����
 * @author java-201707211014 
 * 0000000000000
 *
 */
public class PasswordAuthentification {
		public static void main(String[] args) {
			int usename = 894142194;
			int password = 894142194;
			String name = "��־��";
			
			Scanner us = new Scanner(System.in);
			
			
//			switch (input) {
//			case 894142194:
//				System.out.println("�˺�������ȷ");
//				System.out.println("�������������");
//				break;
//			default :
//				System.out.println("�˺����벻��ȷ,����������");
//			}
			// ��һ��for ѭ�������������˺ŵ�
			for (int i = 0;i <10 ;i++ ) {
				System.out.println("�������˺�,������ʾ:�˺������QQ���й�");
				int input =  us.nextInt();
				if(input == usename) {
					
					System.out.println("�˺�������ȷ,�������������");
					break;
					// break ���������˺���ȷʱ,����ѭ��,�߽���һ��ѭ��
				}else {
					System.out.println("ɵ��,�˺Ų���ȷ,����������˺�");
					continue;
					// continue ���������˺����벻��ȷʱ,����ѭ��,���������˺�
				}
			}
			// �ڶ���forѭ�����������������
			for(int i = 0;i < 3;i++ ) {
				System.out.println("����������,������ʾ:���� �����qq���й�");
				int input =  us.nextInt();
				if(input == password) {
					
					System.out.println("����������ȷ");
					break;
					// break ������������������ȷʱ,����ѭ��
				}else {
					System.out.println("ɵ��,�������벻��ȷ,�������������");
					continue;
					// continue���������������� ����ȷʱ,����ѭ��,������������
			
				}
			}
			// ��Ϊscanner ���������Ե�,��ǰ������ѭ����û�����ʱ,�ò�����޷��ߵ�,Ҳ�Ͳ������ �����
			System.out.println("��ӭ" + name + "����������");
		}
}
