import java.sql.Date;
import java.util.Scanner;

public class Test {
	 public static void main(String args[]){   
		 
	        DoubleBall db=new DoubleBall();   // ����һ������
	        System.out.println("������Ҫ��õ�˫ɫ���ע�� ");
	        Scanner scanner = new Scanner(System.in);// ��������̨
	        int num= scanner.nextInt();// ��ÿ���̨�����
	        
	        db.printNums(num); //  ���ô�ӡ�ķ���   �����ƻ�õĲ�������ȥ  
	        System.out.println("������˺�");
	        System.out.println("Ԥף����500WӴ");
	        Scanner sc = new Scanner(System.in);
}
}
