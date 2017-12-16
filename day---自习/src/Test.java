import java.sql.Date;
import java.util.Scanner;

public class Test {
	 public static void main(String args[]){   
		 
	        DoubleBall db=new DoubleBall();   // 创建一个对象
	        System.out.println("请输入要获得的双色球的注数 ");
	        Scanner scanner = new Scanner(System.in);// 声明控制台
	        int num= scanner.nextInt();// 或得控制台的输出
	        
	        db.printNums(num); //  调用打印的方法   将控制或得的参数传进去  
	        System.out.println("你的幸运号");
	        System.out.println("预祝你中500W哟");
	        Scanner sc = new Scanner(System.in);
}
}
