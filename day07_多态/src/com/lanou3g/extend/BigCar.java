package com.lanou3g.extend;
/*
 * 继承 只能 继承非私有的属性,和方法-----这句话有点小错误
 */
public class BigCar extends Car{
		private String name = "大卡车";
	//定义在类的{}中的属性
		//叫做成员变量或成员属性
		//show方法中定义的w
		//叫做局部变量
		// 局部变量,只在定义它 的{}中有效....这个变量的有效范围.被称为变量的作用域 
		
		public void pullGoods() {
		
			System.out.println("拉货物去了");
		}
		
	
	
		public void show() {
//			wheels =  4;
			// 因为wheels是私有的
			//所以子类无妨访问 ,也就无法赋值
			// 子类无妨直接访问到父类的 私有属性....
			//
	//		wheel = 4;  // 看wheel 报错是蓝色的   字段 Car.wheel 不可视  说明了子类继承了父类的所有属性,方法,,,只不过有些属性,方法 用private修饰了
			// 那么导致我们无法使用    ------> 这里会是很多人理解的误区
			setWheel(4);
			int w = getWheel();
			//变量w 是当调用方法时,才会有这个变量,如果不被调用,,这个变量就不会出现,,,所以叫做局部变量
			
			System.out.println("轮胎个数为: " + w);
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		@Override
		public int getWheel() {
			// TODO 自动生成的方法存根
			return super.getWheel();
		}



		@Override
		public void setWheel(int wheel) {
			// TODO 自动生成的方法存根
			super.setWheel(wheel);
		}



		@Override
		public String getColor() {
			// TODO 自动生成的方法存根
			return super.getColor();
		}



		@Override
		public void setColor(String color) {
			
//			System.out.println("我是子类中的setColor"  + color);
			super.setColor(color);
		}
		
		
			@Override
		public void speed() {
			// TODO 自动生成的方法存根
			super.speed();
			System.out.println("我是大卡车,我的加速度为80");
		}



			public void showThis() {
				//this.是在调用本类自己的方法
				//super 是在调用父类的方法
				//this叫做被本类对象
				//但是一般没听过管super叫做父类对象的
				
				
				//this可以调用本类的属性和方法	
				this.setColor("子类设置黑色");
				super.setColor("父类设置绿色");
			}


	


		public BigCar(String name) {
			super();
			this.name = name;
		}



	


		public BigCar(int wheel, String color) {
			super(wheel, color);
			// TODO 自动生成的构造函数存根
		}



		public BigCar() {
			super();
			// TODO 自动生成的构造函数存根
		}
		
}
