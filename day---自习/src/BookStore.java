import java.util.Arrays;

/**
 *   ��� 
 *   ����: ��������һ������
 * @author java-201707211014
 *
 */
public class BookStore {
		// ����
	private Book[] books =new  Book[10];
	//	
	// 1ͨ���鼮����ѯ�鼮
	// String bookName �Ѳ���������  �����������    
	public Book queryBookByName(String bookName) {
		for (Book a : books) {
			
			// Book b : books                                       
			// String��equals�Ա������ַ����Ƿ����	,���ִ�Сд
			// equalsIgnoreCase�����ִ�Сд
			if ( a!= null && bookName.equals(a.getBookName())) {
				return a;
			}
			;
		}
		return null;
	}		
	// ����鼮
	// ������һ����������ΪBook ��������Ϊbook  
			public void addBook(Book book) {
				for (int i = 0; i < books.length; i++) {
					// �������пյ�λ�ø�ֵ�����ܸ��Ǿ��еĶ���
					if (books[i] == null) {
						books[i] = book;
						return;
						// ����������Ϊnullʱ����
					}
				}
		// ��һ�������������ݵ����飬�ڶ����Ӳ��������ݺ�������鳤��
		books = Arrays.copyOf(books, books.length + 5);
		// �����ĵݹ����,Ҫ�н���������
		addBook(book);
	}
	
	// ɾ���鼮�ķ���
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
