package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A05_PrspareStatement {
	
	public static void main(String[] args) {
		
		String fname = "Kiwi";
		String fcolor = "Purple";
		
		
		//String sql = "insert into fruits values(fruits_sqe.nextval, " + fname + "," + fcolor +")";
		// PrspareStatement 에 준비시킬 쿼리문에 변수가 필요하다면 변수자리는 ?로 채운다
		String sql = "insert into fruits values(fruits_sqe.nextval, ?, ?)";
		ConnectionPool pool = new ConnectionPool(10);
		
		try(
				Connection conn = pool.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			// 다음과 같이 ?를 채울 수 있다
			pstmt.setString(1,  fname);
			pstmt.setString(2,  fcolor);
			
			//실행
			pstmt.executeUpdate();
		} catch (SQLException e) {
	
			e.printStackTrace();
		} 
	
	
	
	
	
	}
}
