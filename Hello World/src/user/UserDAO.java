package user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utill.DatabaseUtil;

//실질적으로 데이터베이스와 연동되는 부분, 직접 접근하는 것
//Database Access Object
public class UserDAO {
	
	//회원가입 함수
	public int join(String userID, String userPassword) {
		String SQL = "INSERT INTO USER VALUES (?, ?)";
		try {
			Connection conn = DatabaseUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			pstmt.setString(2, userPassword);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
}
