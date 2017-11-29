import java.util.Arrays;

/**
 *   书店 
 *   属性: 管理书店的一个容器
 * @author java-201707211014
 *
 */
public class BookStore {
		// 容器
	private Book[] books =new  Book[10];
	//	
	// 1通过书籍名查询书籍
	// String bookName 把参数传进来  就是书的属性    
	public Book queryBookByName(String bookName) {
		for (Book a : books) {
			
			// Book b : books                                       
			// String的equals对比两个字符串是否相等	,区分大小写
			// equalsIgnoreCase不区分大小写
			if ( a!= null && bookName.equals(a.getBookName())) {
				return a;
			}
			;
		}
		return null;
	}		
	// 添加书籍
	// 传入了一个参数类型为Book 参数名字为book  
			public void addBook(Book book) {
				for (int i = 0; i < books.length; i++) {
					// 往数组中空的位置赋值，不能覆盖就有的对象
					if (books[i] == null) {
						books[i] = book;
						return;
						// 所有索引处为null时扩容
					}
				}
		// 第一个参数：被扩容的数组，第二个从参数是扩容后的新数组长度
		books = Arrays.copyOf(books, books.length + 5);
		// 方法的递归调用,要有结束的条件
		addBook(book);
	}
	
	// 删除书籍的方法
			public void subBook(Book book) {
				for(int i = 0; i < books.length; i++) {
					if(books[i] !=null) {
						books[i]=null;
						return;
					} 
				}
					subBook(book);
			}
		
	
	
	
	
				public Book[] getBooks() {
					return books;
				}
			
				public void setBooks(Book[] books) {
					this.books = books;
						
				}
			
}
