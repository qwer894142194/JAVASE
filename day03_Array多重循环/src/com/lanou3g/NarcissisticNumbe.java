package com.lanou3g;

import java.util.Scanner;

/**
 * ˮ�ɻ����Ĵ�ӡ
 * @author java-201707211014
 *
 */
public class NarcissisticNumbe {
		public static void main(String[] args) {
			/*
			 *ʲô����ˮ�ɻ���
			 *ˮ�ɻ�����Narcissistic number��Ҳ����Ϊ����ȫ���ֲ�������pluperfect digital invariant, PPDI����
			 *������������������ķ˹׳����ķ˹��������Armstrong number����ˮ�ɻ�����ָһ�� n λ����n��3 ��
			 *������ÿ��λ�ϵ����ֵ� n ����֮�͵������������磺1^3 + 5^3+ 3^3 = 153���� 
		
			 */
			
			Scanner sc  = new Scanner(System.in);
		
		System.out.println("������3λ������");
		int input =	sc.nextInt();
		if(input < 1000  && input > 100) {
		int hundredsDigit 	= input / 100;  // ��ð�λ���ϵ�����
		int t = input % 100;
		int tensDigit =  t / 10; // ���10λ���� ������
		int td = t % 10;
		
		int unitsDigit = td /1; 
		
			System.out.println(input +"��ˮ�ɻ�����:" + hundredsDigit +"*"+ hundredsDigit +"*"+hundredsDigit +"+"+tensDigit+"*"+tensDigit +"*"+tensDigit+"+"+unitsDigit+"*"+unitsDigit
					+"*" +unitsDigit + "=" +input );
					
		}else if(input > 1000 && input < 10000) {
			int ThousandsOfDigits = input / 1000;// ���ǧλ�����Ǹ���
			int to = input % 1000;
			int hundredsDigit = to /100;// ��ð�λ���ϵ�����
			int t = to % 100; 
			int tensDigit =  t / 10;// ���100λ�����Ǹ���
			int ud = t%10;
			int unitsDigit = ud /1;  // ��ø�λ�����Ǹ���
			System.out.println(input +"��ˮ�ɻ�����:" +ThousandsOfDigits+"*"+ThousandsOfDigits+"*"+ThousandsOfDigits+"+" + hundredsDigit +"*"+ hundredsDigit +"*"+hundredsDigit +"+"+tensDigit+"*"+tensDigit +"*"+tensDigit+"+"+unitsDigit+"*"+unitsDigit
					+"*" +unitsDigit + "=" +input );
		}else{
			System.out.println("������� ������10000���ڵ���,���˱Ƚ���,����10000����Ĳ���д��");
		}
		}
		
		
}
