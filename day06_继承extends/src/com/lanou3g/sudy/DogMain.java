package com.lanou3g.sudy;

public class DogMain {
		public static void main(String[] args) {
			Dog dog = new Dog();
			Dog d1 = new Dog("旺财");
			Dog dog2 = new Dog(2,"旺财");
			
			
			//返回值类型 这时候就不能作为
			//不同方法之间的判断条件
			dog.eatBone();
			dog.eatBone("a");
		}
}
