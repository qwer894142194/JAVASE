package com.work;
  /*
   * ͼ����
   */
public class Graph {
		private String triangle;//������
		private String square;//������
		private String roundness;//Բ��
	
		
		// ���� ��set get
		public void setTriangle(String triangle) {
			this.triangle = triangle;
		}
		public String getTriangle() {
			return triangle;
		}
		//������set get
		public void setSquare(String square) {
				this.square= square;
		}
		public String getSquare() {
			return square;
		}
		//Բ�ε�get set 
		
	public void setRoundness(String roundness) {
		this.roundness = roundness;
	}
	public String getRoundness() {
		return roundness;
	}
	
	public void large() {
		System.out.println("����һ��û�в���,û�з���ֵ��   ��ͼ�α�󷽷�");
	}
	public void small(String m) {
		System.out.println("����һ��û�з���ֵ,�в���,,��ͼ�α�С�ķ���");
	}
	public String variant() {
		return square + "����һ����ͼ�α�������εķ���  ----�÷����з���ֵû�в���";
	}
	public String round(String $) {
		return  roundness  + "����һ���з���ֵ,�в���  ��ͼ�α��Բ�εķ���";
	}
}