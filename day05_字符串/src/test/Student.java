package test;
/**
 * Ȩ�����η�:
 * public :
 * 
 * private :
 *  
 *  
 * @author java-201707211014
 *
 */
public class Student {
	// ��װ !!!!! 
	/*  ����һ�������
	 * ˳����:                       �����ĵ�����:����ջ����
	 * Ĭ�ϳ�ʼ��
	 * ��ʾ��ʼ��
	 * ���������ʼ��
	 * ���췽����ʼ��
	 * 
	 */
		private String name = "һ����";
		
		public String na;
		public String getName() {
			return name;
		}
		// ��¶һ�����еķ��� ȥ����/���
		public void setName(String n) {
			n= name;
					
		}
		
		
		public void smile() {
			System.out.println("����Ц���˻���"); 
		}
		// ֻ���Լ���
		private	void cry() {
			System.out.println("�޵��� ������");
		} 		
		// ֻ��ͬ������  ��ͬ��������
		protected void angry() {
			System.out.println("������ֻ��");
		}
		
		// ������û�����η���  һ��û����
		String  sad() {
			return "����һ����";
		}
}
 