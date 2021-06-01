package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.ConnectionPool;
import jdbc.DBConnector;


public class A05_SearchKeyword {
	/*
		first_name�� ����ڰ� �Է��� ������ ���ԵǾ��ִ� ��� ����� ��ȸ�غ�����
		(��, �˻���� �� ���� �̻��̾�� �ϰ� �� ���� �̻��� �ƴ϶�� ���ܰ� �߻��ؾ� ��)
	*/
	
	public static void main(String[] args) {
		
		String keyword = "en";
		String sql = "select * from employees where first_name like ?";
		ConnectionPool pool = new ConnectionPool(5);
		
		try(
				Connection conn = pool.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			
			pstmt.setString(1, String.format("%%%s%%", keyword));
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%-10d%-15s%-15s%-10d\n",
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getInt("salary"));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
