package com.lanou3g;
import java.awt.datatransfer.FlavorTable;
/**
 * 0. д�ܽ�
 * 1. 
 */
import java.util.jar.Attributes.Name;

/**
 * �����ĵ�ע��
 * @author java-201707211014
 *    ���ڸ�ʲô
 */
public class HelloWorld {
	
		public static void main(String[] args) {
//			System.out.println("���                ����");
//			System.out.println("Hello friend");
//			System.out.println("��һ��java����" );
//			System.out.println("�ڶ����������  " );
	  		
			// -> ���ǵ���ע��
			/*
			 *   -> ���Ƕ���ע��  ʹ�÷���  /*�س�
			 */
				int a = 10;
				System.out.println("a=" + a);
				int age = 18;
				//����һ������,
				//������ֵ����18 
				// 18ʵ���ڴ��е�,
				//�������ʹ��
				//�ڴ��ַȥ��18�Ļ�,��ô����̫�Ѿ���
				//�������ʹ��һ������ȥ�����Ļ�,
				//age���Ǳ�����
				System.out.println("age=" +age);

				// �������д���,�ͻὫ���������� ���������̨  �������18 ������age  ��Ϊ�����age�������,�ҵ�18���ֵ  
				System .out.println("age=" +age);
				double score = 91.72;
				int increment = 2;
				double secondscore =(int)(score +increment);
				System.out.println("�ڶ��ε�ƽ����" +secondscore);
				int d = 1;
				// int ռ��4���ֽ�
				// longռ��8���ֽ�
				long l = 1;
				short r = 1;
				// short ��ռ�������ֽ�
				byte w = 1;
				int i = r;
				// ������Ǵ��ֽڵĸ�ֵС�ֽڵ�ֵ,���ᱨ��,��Ϊװ����С�ֽڵ�ֵ;r����ֻռ�����ֽ�
				int k = (int) l;//������ﲻд(int) ����˵û�н���ǿ��ת���Ļ�  �ͻ� ����
				//��Ϊlong��ռ�ݵĿռ��int �ʹ�; ����˵ֻ�ܽ��ֽ��ٵ�ת��Ϊ�ֽ���ռ�ռ���;
				//  �����������ǿ��ת�� ���ǿת
				
				
				// ����һ���ַ�
				char c = 'a';
				int ic = c;
				// ʹ��int���͵ı���ic����c��ֵ
				// ����ascii�������ֵ
				System.out.println();
				System.out.println("c��ֵ��:" + ic);
				//ǿ��ת��   �������� ������  = (Ҫת������������) Ҫת���ı���
				// �﷨:
				// �������� ������ [=ֵ] - > �����е����ݿ���ʡ��
				
				// byte ռ��һ���ֽ�  �˸�������λ
				// 0 1 ռ��һ���ֽ�
				// �������а�λ����һ���ֽ�
				
				
				int s;
				 s=0;
				double f = 0.35;
				char h = '��';
				System.out.println(h);
				
				System.out.println(f);
				
				// �շ�������:
				// С�շ�: ��һ����������ĸСд ,����ĵ�������ĸ��д  helloWorld
				// ���շ�: ��һ����������ĸҲ��д
				
				// �ַ���
				// ���Ƕ���ַ�������
				String myName = "��ͯ��";
				// ��ʼ�����Ǹ�һ��������ֵ�Ĺ���;
				//  ���ֻ�����˱���,����û�и����������ֵ�Ļ�,
				//��ô������̾ͽ�������  
				// �����дmyName��ֵ   ���ǲ���ֵ�Ļ�,�������������ͻᱨ��
				//����������  ֻ����ĸ �»���,$����,�������Ŷ�����,�����������ظ�; 
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
				// �������������
				
		}	
}
