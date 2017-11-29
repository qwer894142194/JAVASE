
package com.lanou3g;

public class Main {
		public static void main(String[] args) {
			Car car = new Car();
//			这里就是将car的地址传给c2
			
			Car c2 = car;
			
			// 这就是创建对象的过程
			// 然后我们来说一下什么是对象
			/*
			 * 对象就是类中的一个实例化, 意思就是: 符合类中Car 的信息中的众多汽车,选择某一个汽车来写其信息
			 * Car就是类
			 * car 就是对象,
			 * 根据Car这个类创建出来的
			 * 
			 * 
			 * CPU: 指令  中央处理器
			 * 内存:程序运行时数据的缓存
			 * 硬盘:保存数据的
			 * 
			 */
			
			// 
			
			car.showInfo();
			c2.showInfo();
			System.out.println(car);
			System.out.println(c2);
			System.out.println(car == c2);
			// 该判断的是地址   
			 
			
	/*
	* 创建对象的过程
	* Car car = new car(); 创建对象
	* car 叫做引用,通过引用可以找到对象,
	* new Car();是放在堆里面
	* 这才是真正的对象
	* 会先在堆中,开辟一块空间
	* 将这个空间的内存地址,赋值给栈中的Car car;
	* 所以car才可以根据内存地址
	* 找到在堆中存储的对象
	* 
	* 所有同过new关键字的创建
	* 都是在存放在堆中的
	* 
	* 
	* Car car2 = new car();
	* car2 = car;
	* 本来car2是指向堆中的一个对象
	* 但是car2 = car 
	*   将car的地址赋值给了car2
	*   这样car2与car指向了同一个对象
	*    
	*  
	*   
	* 		
	 */
			
//		 属性初始化的顺序
			/*
			 *默认初始化
			 * 显示 初始化
			 * 构造代码块初始化
			 * 构造方法初始化
			 */
		}
}
