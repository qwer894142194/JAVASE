package com.lanou3g.abs;

import com.lanou3g.Person;

public class Main {
		public static void main(String[] args) {
			Sunfine sunfine  = new Sunfine();
			
			sunfine.description();
			overcast.description();
			
		//	Weather W = new Weather();
			
			// 不能实例化对象! 有因为weather是一个抽象类
			Person  p = new Person() {
				// 内部类,,,这个时候他就不是抽象类了
			};
		}
}
