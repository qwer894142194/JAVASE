package com.lanou3g.homework;

public class Women extends Person{
	private String bwh;//��Χ
	private String boyfriend; // ��������
	public String getBwh() {
		return bwh;
	}
	public void setBwh(String bwh) {
		this.bwh = bwh;
	}
	public String getBoyfriend() {
		return boyfriend;
	}
	public void setBoyfriend(String boyfriend) {
		this.boyfriend = boyfriend;
	}
	public Women(String bwh, String boyfriend) {
		super();
		this.bwh = bwh;
		this.boyfriend = boyfriend;
	}
	public Women() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	
	//Ů�˵���Ϊ
	public void buyClothes() {
		System.out.println("�ҵ������� : " + getName() + ";�ҵ��Ա��� : " + getSex() + ";��ϲ�����·�");
	}
	public void giveChild() {
		System.out.println("�ҵ������� : " + getName() +";�ҵ��Ա��� : " + getSex() + ";�һ�������");
	}
	
	
}
