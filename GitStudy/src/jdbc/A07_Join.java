package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class A07_Join {
	
	public static void main(String[] args) {
		
		// �̸��� en�� ���� ��� ����� �̸�/�μ���ȣ/�μ���/���ø� �� Ŭ������ �̿��� ������ �� ���
		HikariConfig config = new HikariConfig();
		
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
		config.setUsername("hr");
		config.setPassword("1234");

		HikariDataSource ds = new HikariDataSource(config);
		
		String sql = "SELECT first_name, department_name, department_id, city "
				+ "FROM employees INNER JOIN departments USING(department_id) "
				+ "INNER JOIN locations USING(location_id) "
				+ "WHERE first_name LIKE '%en%'";
		
		try(
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			while(rs.next()) {
				System.out.printf("%-10s%-15s%-15d%-15s\n",
						rs.getString("first_name"),
						rs.getString("department_name"),
						rs.getInt("department_id"),
						rs.getString("city"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
