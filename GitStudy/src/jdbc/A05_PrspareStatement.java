package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A05_PrspareStatement {
	
	public static void main(String[] args) {
		
		String fname = "Kiwi";
		String fcolor = "Purple";
		
		
		//String sql = "insert into fruits values(fruits_sqe.nextval, " + fname + "," + fcolor +")";
		// PrspareStatement �� �غ��ų �������� ������ �ʿ��ϴٸ� �����ڸ��� ?�� ä���
		String sql = "insert into fruits values(fruits_sqe.nextval, ?, ?)";
		ConnectionPool pool = new ConnectionPool(10);
		
		try(
				Connection conn = pool.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			// ������ ���� ?�� ä�� �� �ִ�
			pstmt.setString(1,  fname);
			pstmt.setString(2,  fcolor);
			
			//����
			pstmt.executeUpdate();
		} catch (SQLException e) {
	
			e.printStackTrace();
		} 
	
	
	
	
	
	}
}
