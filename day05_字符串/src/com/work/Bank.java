package com.work;
/*/
 * ������
 */
public class Bank {
	private	double money;
	private String receptionist;
	private String client;
	
	//money set get
	public void setMoney(double money) {
		this.money = money;
		
	}
	public double getMoney() {
		return money;
	}
	//receptionsit get set
	public void setReceptionist(String receptionist) {
		this.receptionist = receptionist;
	}
	
	public String getReceptionist() {
		return receptionist;
	}
	//client get set
	public void setClient(String client) {
		this.client = client;
	}
	public String getClinet() {
		return client;
	}
	
	public void ask() {
		System.out.println("�˿�ѯ�ʹ�̨��Ա -----û�в���,û�з���ֵ");
	}
	public void save(double money) {
		System.out.println("�˿ʹ�Ǯ ------------�в���,,û�з���ֵ"  );
	}
	public String draw() {
		return money  + "�˿�ȡǮ ------û�в���,,,�з���ֵ";
	}
	public String access(double money) {
		return money + "�˿ʹ�ȡǮ  ----�в���,�з���ֵ";
	}
	
}
