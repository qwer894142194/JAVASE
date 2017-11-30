package com.lanou3g.sudy;

public class DogMain {
		public static void main(String[] args) {
			Dog dog = new Dog();
			Dog d1 = new Dog("旺财");
			Dog dog2 = new Dog(2,"旺财");
			
			
			//返回值类型 这时候就不能作为
			//不同方法之间的判断条件
			dog.eatBone();
			//这俩个列子就可以看出来 是否有返回值,无法对判断是否为方法的重载没有影响
			dog.eatBone("a");
		}
}
