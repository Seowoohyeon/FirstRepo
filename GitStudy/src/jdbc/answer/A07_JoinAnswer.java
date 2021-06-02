package jdbc.answer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import jdbc.model.Department;
import jdbc.model.Employee;

public class A07_JoinAnswer {
	
	public static void main(String[] args) {
		
		HikariConfig config = new HikariConfig();
		
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
		config.setUsername("hr");
		config.setPassword("1234");

		HikariDataSource ds = new HikariDataSource(config);
		
		String sql = "SELECT first_name, department_id, department_name "
				+ "FROM employees INNER JOIN departments USING(department_id) "
				+ "INNER JOIN locations USING(location_id) "
				+ "WHERE first_name LIKE ?";
		
		try( 
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, "%en%");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Employee em = new Employee();
				em.setFirst_name(rs.getString(1));
				em.setDepartment(new Department());
				em.getDepartment().setDepartment_id(rs.getInt(2));
				em.getDepartment().setDepartment_name(rs.getString(3));
				
				System.out.println("-------------------------");
				System.out.println(em.getFirst_name());
				System.out.println(em.getDepartment().getDepartment_id());
				System.out.println(em.getDepartment().getDepartment_name());
			}
			rs.close();		
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
