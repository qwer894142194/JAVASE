
public class Book {
	//ͼ����
	
			private String bookSn;
			//����
			private String bookName;
			//�۸�
			private double price;
			//������
			private String pulishCompany;
			
			//��ݼ�shift+alt+s   r �Զ�����gettersetter����
			
			public String getBookName() {
				return bookName;
			}
			public String getBookSn() {
				return bookSn;
			}
			public void setBookSn(String bookSn) {
				this.bookSn = bookSn;
			}
			public void setBookName(String bookName) {
				this.bookName = bookName;
			}
			public double getPrice() {
				return price;
			}
			public void setPrice(double price) {
				this.price = price;
			}
			public String getPulishCompany() {
				return pulishCompany;
			}
			
			 
			public void setPulishCompany(String pulishCompany) {
				this.pulishCompany = pulishCompany;
			}
		}

