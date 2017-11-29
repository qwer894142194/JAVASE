package test;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * 插入排序思想
 * 有序列表,,,无序列表
 * 将一个空的列表当做一个有序的列表也可以
 * 将无序列表中的数,插入有序列表中,并且保证有序列表的有序性
 * 
 * 
 * 
 */
public class Interposition {
			public static void main(String[] args) {
				//这里
				
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
				
					// 这里初始化数组
					int [] array ={8,9,6,0,7,5,3,1,4,2};
//					Arrays.sort(array);
//					System.out.println(Arrays.toString(array));
					for(int i=1;i<array.length;++i){
						if(array[i]<array[i-1]){
							int temp = array[i];
							
							//将角标保存到变量m上
							// 这样变量m的改变影响不到i
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
