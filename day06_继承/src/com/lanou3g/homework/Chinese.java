package com.lanou3g.homework;

class Chinese extends Person {
	private String complexion;//肤色
	public Chinese() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Chinese(String complexion, String language) {
		super();
		this.complexion = complexion;
		this.language = language;
	}
	public String getComplexion() {
		return complexion;
	}
	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	private String language;
//方法
		public void counterfeit() {
			System.out.println("我叫" + getName() +";我的性别是:  " + getSex() +  ";我的肤色是 : " + getComplexion() + ";我来自中国,仿造能力贼牛博");
		}
		public void nameCalling() {
			System.out.println("我叫" + getName() +";我的性别是:  " + getSex() +  ";我的肤色是 : " + getComplexion() +";我是一名中国人,我骂人贼牛逼");
		}
		
}