package com.lanou3g.sudy;

public class Cat {
		private String name;
		private Person owner;
		
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public Person getOwner() {
			return owner;
		}
		public void setOwner(Person owner) {
			this.owner = owner;
		}
		
		
		//���췽��
		/*
		 * ���췽��:
		 *   1.������������һ��
		 *   2.û�з���ֵ��һ����
		 *   
		 *   
		 *   ���˹��췽��:.��Ҫset,get ����?
		 *   ���ȵ�һ��:
		 *   get��һ��Ҫ�е�.
		 *   ������������޷����˽�����Ե�
		 *   
		 *  ����set
		 *    ��Щ����,������ÿ������Ҫ���е�...
		 *    ����cat���ܻ���һ������,���ǲ�����ÿһ��cat
		 *    cat�ڳ�ʼ����ʱ��,��������һ������
		 *    �����ں�����ʹ����,ͨ��set����
		 *    ��������һ��
		 *    ���ڳ�ʼ�����е����owner����,
		 *    �ܿ������èҲ������,�Ǿ���Ҫ��һ��
		 *    ����,���ʱ���Ҳ����ʹ��set����,ȥ�޸�����
		 *  
		 *   
		 */
		public Cat() {
			System.out.println("�����޲εĹ��췽��");
		}
		
		
		public Cat(Person owner) {
			//�������� �Ĳ���owner ��ֵ
			//��ֵ�����Ե�owner
			//û�з���ֵ�������
			
			this.owner = owner;
		}
		
		
		
		
		public void showOwner() {
			System.out.println("�ҵ�������  :" + owner.getName());
		}
}
