package com.lanou3g.homework;
/*
 *  ����һ��Person��
	�ڴ���������̳���
	Person�����������ԣ���������
	�������Լ����е����Ժͷ������������⣩
	�ڴ���һ�Ը������ࣨ���⣩
 */
public class Person {
		private String name;
		private String  sex;
		
		
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
		public Person() {
			super();
			// TODO �Զ����ɵĹ��캯�����
		}
		public Person(String name, String sex) {
			super();
			this.name = name;
			this.sex = sex;
		}
		
		public void sleep() {
			System.out.println("�ҵĵ�������" + getName() + ";�ҵ��Ա���" + getSex() + ";��ӵ�е���Ϊ��:˯��");
		}
		public void eat() {
			System.out.println("�ҵĵ�������" + getName() + ";�ҵ��Ա���" + getSex() + ";��ӵ�е���Ϊ��:�Է�");
		}
		
}
