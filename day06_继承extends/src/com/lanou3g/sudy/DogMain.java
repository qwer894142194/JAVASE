package com.lanou3g.sudy;

public class DogMain {
		public static void main(String[] args) {
			Dog dog = new Dog();
			Dog d1 = new Dog("����");
			Dog dog2 = new Dog(2,"����");
			
			
			//����ֵ���� ��ʱ��Ͳ�����Ϊ
			//��ͬ����֮����ж�����
			dog.eatBone();
			//���������ӾͿ��Կ����� �Ƿ��з���ֵ,�޷����ж��Ƿ�Ϊ����������û��Ӱ��
			dog.eatBone("a");
		}
}
