package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A01_ConnectionPractice2 {
	
	//static 블록 : 해당 클래스가 한번이라도 언급되면 static 블록을 최초로 한 번 실행한다 
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	static String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	
	static Connection getConncetion(String id, String password) {
		try {
			return DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			return null;
		}
	}
	
	public static void main(String[] args) {
		String sql = "select * from employees where department_id =" + 50;
		
		try(
				Connection conn = getConncetion("hr","1234");
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()
			) {
				System.out.println("EMPNO\t      first_name\tlast_name");
				while(rs.next()) {
					System.out.printf("%-10d\t%-15s\t%s\n",
							rs.getInt(1),rs.getString(2),rs.getString(3));	
				}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
