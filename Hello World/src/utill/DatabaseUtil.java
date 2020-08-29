package utill;

import java.sql.Connection;
import java.sql.DriverManager;

//데이터베이스와 연동하는 부분
public class DatabaseUtil {

	public static Connection getConnection() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/TUTORIAL?serverTimezone=UTC";
			String dbID = "root";
			String dbPassword = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		//이렇게 접속한 상태 자체를 반환하게 하는 것
	}
}
