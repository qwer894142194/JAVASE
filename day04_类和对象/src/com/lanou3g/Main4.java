package com.lanou3g;

public class Main4 {
		public static void main(String[] args) {
			Student s1 = new Student();
			Teacher t1 = new Teacher();
			Courier c1 = new Courier();
			Salesclerk s = new Salesclerk();
			
			c1.expressDelivery("老李");
			s.sellThings();
			String s2	= s1.goSchool("老王");
			System.out.println(s2);
			
			t1.teach("老王");
		}
}
 
