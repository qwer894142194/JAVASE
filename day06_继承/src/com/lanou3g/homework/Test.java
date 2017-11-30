package com.lanou3g.homework;

public class Test {
		public static void main(String[] args) {
			Person person = new Person();
			Women women = new Women();
			Man man = new Man();
			Chinese chinese = new Chinese();
			person.setName("人类");
			person.setSex("未知");
			person.sleep();
			person.eat();
			
			
			women.setName("幸运女神");
			women.setSex("女");
			women.sleep();
			women.eat();
			women.buyClothes();
			women.giveChild();
			
			man.setName("美男子");
			man.setSex("男");
			man.sleep();
			man.eat();
			man.smoking();
			man.fight();
			
			chinese.setName("中国人");
			chinese.setSex("男");
			chinese.setComplexion("黄色");
			chinese.eat();
			chinese.sleep();
			chinese.counterfeit();
			chinese.nameCalling();
			
		}
}
