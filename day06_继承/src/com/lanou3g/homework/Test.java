package com.lanou3g.homework;

public class Test {
		public static void main(String[] args) {
			Person person = new Person();
			Women women = new Women();
			Man man = new Man();
			Chinese chinese = new Chinese();
			person.setName("����");
			person.setSex("δ֪");
			person.sleep();
			person.eat();
			
			
			women.setName("����Ů��");
			women.setSex("Ů");
			women.sleep();
			women.eat();
			women.buyClothes();
			women.giveChild();
			
			man.setName("������");
			man.setSex("��");
			man.sleep();
			man.eat();
			man.smoking();
			man.fight();
			
			chinese.setName("�й���");
			chinese.setSex("��");
			chinese.setComplexion("��ɫ");
			chinese.eat();
			chinese.sleep();
			chinese.counterfeit();
			chinese.nameCalling();
			
		}
}
