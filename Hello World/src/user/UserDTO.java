package user;

//Date Transfer Object
//jsp ���α׷� �ȿ��� �ϳ��� ������ ������ ��� ���� ��ü ���� sql ���̺��� �����
public class UserDTO {
	
	String userID;
	String userPassword;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}
