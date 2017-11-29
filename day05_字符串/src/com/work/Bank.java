package com.work;
/*/
 * 银行类
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
		System.out.println("顾客询问柜台人员 -----没有参数,没有返回值");
	}
	public void save(double money) {
		System.out.println("顾客存钱 ------------有参数,,没有返回值"  );
	}
	public String draw() {
		return money  + "顾客取钱 ------没有参数,,,有返回值";
	}
	public String access(double money) {
		return money + "顾客存取钱  ----有参数,有返回值";
	}
	
}
