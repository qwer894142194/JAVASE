package test;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * ��������˼��
 * �����б�,,,�����б�
 * ��һ���յ��б���һ��������б�Ҳ����
 * �������б��е���,���������б���,���ұ�֤�����б��������
 * 
 * 
 * 
 */
public class Interposition {
			public static void main(String[] args) {
				//����
				
				/*
						     0   1  0             1
						    0  1   1 0      1          1
						   0  1  2  1 0  
						  0 1  3  3  1 0 
						 0 1  4  6  4 1 0
						0 1  5 10 10 5 1 0 
				 * 
				 * 
				 */
				
					// �����ʼ������
					int [] array ={8,9,6,0,7,5,3,1,4,2};
//					Arrays.sort(array);
//					System.out.println(Arrays.toString(array));
					for(int i=1;i<array.length;++i){
						if(array[i]<array[i-1]){
							int temp = array[i];
							
							//���Ǳ걣�浽����m��
							// ��������m�ĸı�Ӱ�첻��i
							int m = i;
							for(int j = m-1; j>=0 && array[j]>temp;j--){
								array[j+1] = array[j];
								m--;
							}
							array[m] = temp;
						}
					}
					System.out.println(Arrays.toString(array));
					
				}
	
					
}
