package user;

//Date Transfer Object
//jsp 프로그램 안에서 하나의 데이터 단위를 담기 위한 객체 보통 sql 테이블대로 담아줌
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
