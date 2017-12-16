import java.util.Scanner;

import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

public class Id {
			
			private String userName;
			private String passWord;
			public String getUserName() {
				return userName;
			}
			public void setUserName(String userName) {
				this.userName = userName;
			}
			public String getPassWord() {
				return passWord;
			}
			public void setPassWord(String passWord) {
				this.passWord = passWord;
			}
			public Id(String userName, String passWord) {
				super();
				this.userName = userName;
				this.passWord = passWord;
			}
			public Id() {
				super();
				// TODO 自动生成的构造函数存根
			}

			
				
}
			
