package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A01_JdbcConnection {
	/*
		# JDBC
		 - Java Database Connectivity
	  	 - DB�� �������� �����Ͽ� �����ϰ� ����� �޾ƿ��� Java API
	  	 - � DB�͵� ȣȯ�� �� �ֵ��� ����Ǿ� �ִ�
	  	 - Java ����� �ҽ��� � DB�� ����ϴ��� �׻� �����ϴ�
	  	 - DB�� ������ �ʿ��� jdbc���� �䱸�ϴ� ������ ���߾� �����ϱ� ������
	  	       ���α׷��ӵ��� ���ο� DB�� ������ jdbc�� ���ϰ� ��밡��
	  	       
		# OJDBC
	  	 - ����Ŭ �����ͺ��̽��� JDBC API�� �����ϱ� ���� ���� ���̺귯��
	  	 - ����Ŭ DB�� ��ġ�� ������ ���ԵǾ� �ִ�
	  	 
	  	 * external : �ܺ���
	  	 * internal : ������
	*/
	
	public static void main(String[] args) {
		/*
		 	# � ȸ�� DB�� ����ϴ��� ���ľ��ϴ� ������
		*/
		// 1. Class.forName()���� �ش� DB���� jdbc����̹��� �ε��Ѵ�
		try {
			// 1. Class.forName()���� �ش� DB���� jdbc����̹��� �ε��Ѵ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("OracleDriver�� ������");
			
			// 2. DriverManager Ŭ������ ���� DB�� ������ �����Ѵ�
			Connection conn = 
					DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");
			System.out.println("���������");
			
			// 3. ������ ������ ���� ������ �������� �����Ѵ�
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
			
			// 4. ������ Ŀ���� DB�� ������
			ResultSet rs = pstmt.executeQuery();
			
			// 5. �޾ƿ� ����� ������� ����Ѵ�
			while(rs.next()) {
				System.out.println(rs.getString("first_name") + "/" + rs.getString("salary"));
			}
			
			// 6. �� ������ ������ �� �����ش� (���� ���߿� ������ ������� �ݴ´�)
			rs.close();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
