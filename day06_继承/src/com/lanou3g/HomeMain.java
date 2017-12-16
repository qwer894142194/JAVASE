package com.lanou3g;

public class HomeMain {
		public static void main(String[] args) {
			Father father = new Father();
			//¸ø°Ö°ÖÒ»¸öÃû×Ö
			father.setName("ÂíÔÆ°Ö°Ö");
			Mother mother = new Mother();
			mother.setName("Î§È¹ÂèÂè");
			Child child = new Child();
			child.setName("Ã«ĞÂÓî");
			
			
			
			father.setWife(mother);
			father.setChild(child);
			
			mother.setChild(child);
			mother.setFather(father);
			child.setFather(father);
			child.setMother(mother);
			
			father.showFamily();
			mother.showFamily();
			child.showfamily();
		}
}
