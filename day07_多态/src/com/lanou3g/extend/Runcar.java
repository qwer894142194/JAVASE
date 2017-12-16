package com.lanou3g.extend;

public class Runcar extends Car{

	@Override
	public void speed() {
		// TODO 自动生成的方法存根
		super.speed();
	}
			// 跑车的速度 , 比一般的车块,
	// 所以我们复写父类Car中的加速方法
	//复写: 就是把父类中的方法修改
//	@Override  //----->检测该方法用来帮我们检测该方法是否从父类中继承过来的   // 注解------ @ 大写O + alt +/
//	public void speed() {
//		
//		System.out.println("加速度为240");
//		super.speed();
		// 调用父类的方法对输出父类的结果和子类结果的顺序没有影响,都是先输出父类的方法
	
//	@Override
	// 这个报错就是说明该方法不是从父类中继承过来的
//	public void slowDown() {
//
//	}
}
