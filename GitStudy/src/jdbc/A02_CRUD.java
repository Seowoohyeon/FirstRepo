package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A02_CRUD {
	
	/*
	 	JDBC에서 select는 ResultSet을 반환한다
	 	그 외의 DML은 적용된 행의 개수를 반환한다
	 	
	 	select는 PreparedStatement의 executeQuery() 메서드를 사용하고
	 	나머지는 executeUpdate() 메서드를 사용한다
	*/
	
	public static void main(String[] args) {
		String sql = "insert into fruits " + "values(fruits_sqe.nextval, 'Kiwi', 'ORANGE')";
		String sql2 = "select * from fruits order by fid desc";
		try(
				Connection conn = DBConnector.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		) {
			for(int i = 0; i < 10; i++) {
				int rows = pstmt.executeUpdate();
				System.out.println(rows + "row(s) update");
			}
			
			ResultSet rs = pstmt2.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%d\t%s\t%s\n", rs.getInt(1), rs.getString(2),rs.getString(3));
			}
			
			
			System.out.println("성공");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	
		
	}
}
