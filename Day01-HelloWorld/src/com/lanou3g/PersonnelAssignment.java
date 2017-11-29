package com.lanou3g;

import javax.naming.ldap.SortControl;

public class PersonnelAssignment {
   public static void main(String[] args) {
	   String[][]  arr = {
			   {"1","2","3","4","5",},
			   {"6","7","8","9","10"},
	   };
	    sort(arr);
}
   
   	public static void sort(String arr[][]) {
	     for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
				System.out.println();
		}
   }
}
