package test;

public class Main {
			public static void main(String[] args) {
				Student s = new Student();
				Student st = new Student();
				s.angry();
				// ����private���ε�,,,,,public String protected ͬ����,,,�⼸�ַ����������ҵ�
			String q =s.sad();
				s.smile();
				System.out.println(q);
				String name2 =	st.getName();
				System.out.println("��֮ǰ���� st������ : " + name2);
				
				// ͨ��getName �ķ��� �õ���name����
				// ��֮ǰ
				String name = s.getName();
				System.out.println("��֮ǰ ����s������:" +name);
				
				//��֮��
				s.setName("������");
				name = s.getName();
				System.out.println("��֮��  ����s������ : " + name);
				
				 
				
				String name1 = st.getName();
				System.out.println("��֮�� ����st������ : " +name);
			
			}
}
