import java.util.Scanner;

public class BookStoreTest {
public static void main(String[] args) {
		Book a;
		
		BookStore bs = new BookStore();
		
		System.out.println("��ӭ������Ÿ���");
		
		while (true) {
			
			System.out.println("1-��ѯ,2-���,3-ɾ��,4-�޸�");
			
			Scanner sc = new Scanner(System.in);
			
			String input = sc.nextLine();
			// ��õ��ַ��� ���� input   nextLine �ַ����Ļ�÷�ʽ
			
			
			switch (input) {
			
			case "1":
				
				System.out.println("����������:");
				
				Book book = bs.queryBookByName(sc.nextLine());
			
				if (book == null) {
					
					System.out.println("����δ�ҵ�");
					
				} else {
					
					System.out.println("����:" + book.getBookName() + ",�۸�:" + book.getPrice() + ",������" + book.getPulishCompany() + ",���" + book.getBookSn());
				}
				break;
				
			case "2":
				
				Book newBook = new Book();
				
				System.out.println("�������������");
				
				newBook.setBookName(sc.nextLine());
				
				System.out.println("��������ļ۸�");
				
				newBook.setPrice(sc.nextDouble());
				//  ����ĳ�double��ӦΪprice��Ӧ����ʽ��double ����
				// ���Ǹĳ�double���ֻ���һ��bug   ���Ծͻ������½������
				// ������������ʾ������
				sc.nextLine();
				System.out.println("��������ĳ�����");
				
				newBook.setPulishCompany(sc.nextLine());
				
				System.out.println("��������ı��");
				
				newBook.setBookSn(sc.nextLine());
				
				bs.addBook(newBook);
				
				break;
			case "3":
				System.out.println("����������:");
				Book book1 = bs.queryBookByName(sc.nextLine());
				if(book1 !=null) {
					System.out.println("���ҵ����鼮  ������ɾ����");
				}
				else {
					System.out.println("����δ�ҵ�");
				}
				bs.subBook(book1);
				System.out.println(book1);
				break;
				
			// �޸�		
			case "4":
				System.out.println("����������  ���в鿴");
				Book book2 = bs.queryBookByName(sc.nextLine());

				if (book2 != null) {
					
					System.out.println("�������ҵ�");
					
				} else {
					
					System.err.println("����δ�ҵ�");
				}
				
				
				System.out.println("������Ҫ�޸ĳɵĵ�����");
					book2.setBookName(sc.nextLine());
				System.out.println("������Ҫ�޸ĵļ۸�");
					book2.setPrice(sc.nextDouble());
					sc.nextLine();
				System.out.println("������Ҫ�޸ĵı��");
					book2.setBookSn(sc.nextLine());
				System.out.println("������Ҫ�޸ĳɵĳ�����");
					book2.setPulishCompany(sc.nextLine());
				break;
				
				
			default:
				System.out.println("��������,��������ȷ������");
			}
		}
	}
}
