package com.lanou3g.homework;

class Chinese extends Person {
	private String complexion;//��ɫ
	public Chinese() {
		super();
		// TODO �Զ����ɵĹ��캯�����
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
//����
		public void counterfeit() {
			System.out.println("�ҽ�" + getName() +";�ҵ��Ա���:  " + getSex() +  ";�ҵķ�ɫ�� : " + getComplexion() + ";�������й�,����������ţ��");
		}
		public void nameCalling() {
			System.out.println("�ҽ�" + getName() +";�ҵ��Ա���:  " + getSex() +  ";�ҵķ�ɫ�� : " + getComplexion() +";����һ���й���,��������ţ��");
		}
		
}