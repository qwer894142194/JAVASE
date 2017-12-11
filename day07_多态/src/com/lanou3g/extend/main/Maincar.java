package com.lanou3g.extend.main;

import com.lanou3g.extend.BigCar;
import com.lanou3g.extend.Car;
import com.lanou3g.extend.Runcar;

public class Maincar {
		public static void main(String[] args) {
			Car car = new Car();
//			car.speed();
			Runcar caruncar = new Runcar();
			caruncar.speed();
//			BigCar bigCar = new BigCar();
//			bigCar.speed();
			
			/*
			 * 这俩个speed方法都从父类那里继承过来的
			 * 但是每个方法的输出的内容又不同
			 * 是因为我们在子类中给他修改了,扩展了
			 * 
			 * 这就是重写
			 * 重写就是为了给每个子类添加独有的行为
			 * 同时,也继承了父类的行为
			 * 重写就是复写,复写就是重写
			 * 叫法不同
			 * 
			 * 面试题中容易出现
			 * 
			 * 请写出重写,复写,重载的含义:
			 * 				
			 * 			
			 * 
			 */
		}
}
