package com.lanou3g.homework;
/*
 * ʵ�ּ򵥵�javaͨѶ¼����
 * 1.������ϰ����Cantact , ���Ա���,����,�Ա�,�绰����,סַ,��������,����,���췽��(����,�绰����),��ʾ��ϵ�˵���Ϣ
 * 2.��main�ж�������(����Ϊ10��Ԫ��),����������ϵ��,�����������ϵ�˶���,,��������绰��绰����Ϊ��,��ӡ���ʧ��
 * 3.��ȡĳ�������µ�������ϵ��
 * 4.���ݵ绰����,������ϵ��
 * 5.��ȡ����Ů����ϵ��
 * 6.չʾͨѶ¼��������ϵ��
 * 
 * Ŀ��
 * ʹ���������˼����
 * 
 * ����˼·
 * ����ϵ�ȷ�װ��һ�� ��,
 * ��main�ж�������,��Ϊÿ��������ӷ���ȥʵ��
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
