package com.lanou3g;

public class Main4 {
		public static void main(String[] args) {
			Student s1 = new Student();
			Teacher t1 = new Teacher();
			Courier c1 = new Courier();
			Salesclerk s = new Salesclerk();
			
			c1.expressDelivery("����");
			s.sellThings();
			String s2	= s1.goSchool("����");
			System.out.println(s2);
			
			t1.teach("����");
		}
}
 
