package com.lanou3g.homework;

 class Man extends Person {
	private	String brag;
	private String girlfriend;
	public String getBrag() {
		return brag;
	}
	public void setBrag(String brag) {
		this.brag = brag;
	}
	public String getGirlfriend() {
		return girlfriend;
	}
	public void setGirlfriend(String girlfriend) {
		this.girlfriend = girlfriend;
	}
	public Man(String brag, String girlfriend) {
		super();
		this.brag = brag;
		this.girlfriend = girlfriend;
	}
	public Man() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public void smoking() {
		System.out.println("�ҵ�������" + getName() + ";�ҵ��Ա���" + getSex() + ";��ϲ������" );
	}
	
	public void fight() {
		System.out.println("����������"+   getName() +";�ҵ��Ա���:" + getSex() + ";��ϲ�����");
	}
}
