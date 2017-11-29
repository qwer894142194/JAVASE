package test;

public class Main {
			public static void main(String[] args) {
				Student s = new Student();
				Student st = new Student();
				s.angry();
				// 除了private修饰的,,,,,public String protected 同包下,,,这几种方法都可以找到
			String q =s.sad();
				s.smile();
				System.out.println(q);
				String name2 =	st.getName();
				System.out.println("改之前对象 st的名字 : " + name2);
				
				// 通过getName 的方法 拿到了name属性
				// 改之前
				String name = s.getName();
				System.out.println("改之前 对象s的名字:" +name);
				
				//改之后
				s.setName("二星龙");
				name = s.getName();
				System.out.println("改之后  对象s的名字 : " + name);
				
				 
				
				String name1 = st.getName();
				System.out.println("改之后 对象st的名字 : " +name);
			
			}
}
