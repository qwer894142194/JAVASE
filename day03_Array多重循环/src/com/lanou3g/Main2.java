package com.lanou3g;

import java.util.Arrays;

/**
 * 
 * 	@author java-201707211014
 *  ������ ����һ�� ��ֵ,��Ȼʹ�����鱣����������
 */
public class Main2 {
		public static void main(String[] args) {
			int[] a  = {40,50,60,70,80};
						
						/*
						 * 
						 */
			int[] b = new int[6];
			int r = 45;
			// ����ı���
			
			//  ΪʲôҪд  a.length -1 ��Ϊ ��i = 5  i+1 = 6 a[6]�ͻ�����Խ��
			// ����ΪʲôҪ ��b.length��? ��Ϊa�ĳ��Ȳ���ѭ������  ,b�ĳ��ȱ�a�Ĵ�
			for (int i = 0,j=0; i < b.length - 1; i++) {
//			if (i < a.length - 1) {
//				if (a[i] < r && a[i + 1] > r) {
//					// ������������ ��ô��˵��r��Ҫ����a[i] ��a[i+1]֮�� �������˵�i+1λ
//					a[i] = b[i];
//					b[i+1] = r;	
//					return; 
//				} else {
//					// ���������� �򲻲���r
//					b[i] = a[i];
//				}
//			}
			// ���һ��ֱ�Ӹ���
			//			b[i] = a[i];
				// ������� û�п����������,���ǲ����ֵ ����ֵ�еĶ�Ц,���򶼴��ʱ��,
				// ����������������,����������ʦ���߼�һ��,����ȡ
				if(a[i] < r) {
				b[i] = a[i];
				}
				else if(a[i] > r  && a[i-1] <r) {
				  b[i] = r ;
				  
				
				}
				b[i+1] = a[i];
			}
			System.out.println(Arrays.toString(b));
		}
}