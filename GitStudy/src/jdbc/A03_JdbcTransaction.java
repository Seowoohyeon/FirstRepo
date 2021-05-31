package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A03_JdbcTransaction {
	public static void main(String[] args) {
		String sql = "update fruits set fcolor = 'BLUE' where fname ='Kiwi'";
		
		try(
			Connection conn = DBConnecter.getConncetion();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			// jdbc로 처음 연결을 생성하면 기본적으로 AutoCommit이 활성화 되어있다
			// 트랜젝션을 직접 제어하기 위해서는 자동 커밋을 비활성화 해야한다
			conn.setAutoCommit(false);
			
			int rows = pstmt.executeUpdate();
			
			System.out.println(rows + " 행이 업데이트 되었습니다");
			
			if(rows % 2 == 0) {
				conn.commit();
				System.out.println("commit!!");
			} else {
				conn.rollback();
				System.out.println("rollback!!");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
