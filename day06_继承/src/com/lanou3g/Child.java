package com.lanou3g;

public class Child {
	 private String name;
		private Father father;
		private Mother mother;
	 
	 
		//father set
		public void setFather(Father father) {
			this.father = father;
		}
		//mother set
		public void setMother(Mother mother) {
			this.mother = mother;
		}
		
		//name get set 
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void showfamily() {
			System.out.println(name + "的爸爸:   是" +father.getName() + ";" + "他的妈妈是 : " + mother.getName());
		}
}
