package com.lanou3g;

public class HomeMain {
		public static void main(String[] args) {
			Father father = new Father();
			//���ְ�һ������
			father.setName("���ưְ�");
			Mother mother = new Mother();
			mother.setName("Χȹ����");
			Child child = new Child();
			child.setName("ë����");
			
			
			
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
