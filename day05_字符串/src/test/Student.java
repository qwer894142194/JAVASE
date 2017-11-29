package test;
/**
 * 权限修饰符:
 * public :
 * 
 * private :
 *  
 *  
 * @author java-201707211014
 *
 */
public class Student {
	// 封装 !!!!! 
	/*  创建一个对象后
	 * 顺序是:                       方法的调用是:放在栈里面
	 * 默认初始化
	 * 显示初始化
	 * 构造代码块初始化
	 * 构造方法初始化
	 * 
	 */
		private String name = "一星龙";
		
		public String na;
		public String getName() {
			return name;
		}
		// 暴露一个公有的方法 去设置/获得
		public void setName(String n) {
			n= name;
					
		}
		
		
		public void smile() {
			System.out.println("心里笑开了花啊"); 
		}
		// 只让自己用
		private	void cry() {
			System.out.println("哭的像 个孩子");
		} 		
		// 只让同包下用  不同包不可用
		protected void angry() {
			System.out.println("气的像只狗");
		}
		
		// 像这样没有修饰符的  一般没人用
		String  sad() {
			return "爱是一道光";
		}
}
 