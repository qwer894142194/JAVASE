package test;

public class IdStore {
		Id[] ids = new Id[100];

	//�˺Ų�ѯ�ķ���
		public Id quaryIdByUserName(String UserName) {
			for(Id i : ids) {
				//for each ����ѭ���� ���� ----ֱ�ӱ�������
				if(i != null && UserName.equals(i.getUserName())) {
					return i;
				}
				;
			}
			return null;
		}
		public Id quaryIdByPassword(String PassWord) {
			for(Id i : ids) {
				//for each ����ѭ���� ���� ----ֱ�ӱ�������
				if(i != null && PassWord.equals(i.getPassWord())) {
					return i;
				}
				;
			}
			return null;
		}
	// �˺���ӵķ��� ;;;
		public void addId(Id id) {
			for(int i = 0; i < ids.length;i++) {
				if(ids[i]==null) {
					ids[i] = id;
					return;
				}
			}
			addId(id);//�����ĵݹ����
		}
		
		
		
}
