import java.util.Scanner;

public class BookStoreTest {
public static void main(String[] args) {
		Book a;
		
		BookStore bs = new BookStore();
		
		System.out.println("欢迎光临蓝鸥书店");
		
		while (true) {
			
			System.out.println("1-查询,2-添加,3-删除,4-修改");
			
			Scanner sc = new Scanner(System.in);
			
			String input = sc.nextLine();
			// 或得的字符串 名字 input   nextLine 字符串的或得方式
			
			
			switch (input) {
			
			case "1":
				
				System.out.println("请输入书名:");
				
				Book book = bs.queryBookByName(sc.nextLine());
			
				if (book == null) {
					
					System.out.println("此书未找到");
					
				} else {
					
					System.out.println("书名:" + book.getBookName() + ",价格:" + book.getPrice() + ",出版商" + book.getPulishCompany() + ",编号" + book.getBookSn());
				}
				break;
				
			case "2":
				
				Book newBook = new Book();
				
				System.out.println("请输入书的名字");
				
				newBook.setBookName(sc.nextLine());
				
				System.out.println("请输入书的价格");
				
				newBook.setPrice(sc.nextDouble());
				//  这里改成double是应为price对应的形式是double 类型
				// 但是改成double型又会有一个bug   所以就会有以下解决方法
				// 解决输出多行提示的问题
				sc.nextLine();
				System.out.println("请输入书的出版商");
				
				newBook.setPulishCompany(sc.nextLine());
				
				System.out.println("请输入书的编号");
				
				newBook.setBookSn(sc.nextLine());
				
				bs.addBook(newBook);
				
				break;
			case "3":
				System.out.println("请输入书名:");
				Book book1 = bs.queryBookByName(sc.nextLine());
				if(book1 !=null) {
					System.out.println("已找到此书籍  并正在删除中");
				}
				else {
					System.out.println("此书未找到");
				}
				bs.subBook(book1);
				System.out.println(book1);
				break;
				
			// 修改		
			case "4":
				System.out.println("请输入书名  进行查看");
				Book book2 = bs.queryBookByName(sc.nextLine());

				if (book2 != null) {
					
					System.out.println("此书已找到");
					
				} else {
					
					System.err.println("此书未找到");
				}
				
				
				System.out.println("请输入要修改成的的名字");
					book2.setBookName(sc.nextLine());
				System.out.println("请输入要修改的价格");
					book2.setPrice(sc.nextDouble());
					sc.nextLine();
				System.out.println("请输入要修改的编号");
					book2.setBookSn(sc.nextLine());
				System.out.println("请输入要修改成的出版商");
					book2.setPulishCompany(sc.nextLine());
				break;
				
				
			default:
				System.out.println("输入有误,请重新正确的书名");
			}
		}
	}
}
