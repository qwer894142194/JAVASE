package com.lanou3g.homework;
/*
 * 实现简单的java通讯录操作
 * 1.定义练习人类Cantact , 属性变量,姓名,性别,电话号码,住址,分组名称,方法,构造方法(姓名,电话号码),显示联系人的信息
 * 2.在main中定义数组(容量为10个元素),管理所有联系人,可以添加新联系人兑现,,如果姓名电话或电话号码为空,打印添加失败
 * 3.获取某个分组下的所有联系人
 * 4.根据电话号码,搜索联系人
 * 5.获取所有女性联系人
 * 6.展示通讯录中所有联系人
 * 
 * 目的
 * 使用面向对象思想编程
 * 
 * 解体思路
 * 将联系热封装成一个 类,
 * 在main中定义数组,并为每个功能添加方法去实现
 * 
 */
public class Contact {
		private String name;
		private String sex;
		private int phoneNumber;
		private String site;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public int getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getSite() {
			return site;
		}
		public void setSite(String site) {
			this.site = site;
		}
		public Contact(String name, String sex, int phoneNumber, String site) {
			super();
			this.name = name;
			this.sex = sex;
			this.phoneNumber = phoneNumber;
			this.site = site;
		}
		
}
