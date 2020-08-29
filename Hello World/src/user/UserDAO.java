package user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utill.DatabaseUtil;

//���������� �����ͺ��̽��� �����Ǵ� �κ�, ���� �����ϴ� ��
//Database Access Object
public class UserDAO {
	
	//ȸ������ �Լ�
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
