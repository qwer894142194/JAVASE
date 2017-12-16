package test;

public class IdStore {
		Id[] ids = new Id[100];

	//账号查询的方法
		public Id quaryIdByUserName(String UserName) {
			for(Id i : ids) {
				//for each 增加循环的 方法 ----直接遍历数组
				if(i != null && UserName.equals(i.getUserName())) {
					return i;
				}
				;
			}
			return null;
		}
		public Id quaryIdByPassword(String PassWord) {
			for(Id i : ids) {
				//for each 增加循环的 方法 ----直接遍历数组
				if(i != null && PassWord.equals(i.getPassWord())) {
					return i;
				}
				;
			}
			return null;
		}
	// 账号添加的方法 ;;;
		public void addId(Id id) {
			for(int i = 0; i < ids.length;i++) {
				if(ids[i]==null) {
					ids[i] = id;
					return;
				}
			}
			addId(id);//方法的递归调用
		}
		
		
		
}
