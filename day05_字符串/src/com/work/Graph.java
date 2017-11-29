package com.work;
  /*
   * 图表类
   */
public class Graph {
		private String triangle;//三角形
		private String square;//正方形
		private String roundness;//圆形
	
		
		// 三角 的set get
		public void setTriangle(String triangle) {
			this.triangle = triangle;
		}
		public String getTriangle() {
			return triangle;
		}
		//正方形set get
		public void setSquare(String square) {
				this.square= square;
		}
		public String getSquare() {
			return square;
		}
		//圆形的get set 
		
	public void setRoundness(String roundness) {
		this.roundness = roundness;
	}
	public String getRoundness() {
		return roundness;
	}
	
	public void large() {
		System.out.println("这是一个没有参数,没有返回值的   将图形变大方法");
	}
	public void small(String m) {
		System.out.println("这是一个没有返回值,有参数,,将图形变小的方法");
	}
	public String variant() {
		return square + "这是一个将图形变成正方形的方法  ----该方法有返回值没有参数";
	}
	public String round(String $) {
		return  roundness  + "这是一个有返回值,有参数  将图形变成圆形的方法";
	}
}