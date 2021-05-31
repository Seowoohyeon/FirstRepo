package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A01_ConnectionPractice {	
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("OracleDriver가 존재함");
			
			System.out.print("부서ID 입력 : ");
			
			String i = sc.nextLine();
			
			Connection conn = 
					DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");
			System.out.println("연결생성됨");
			
			String sql = "SELECT * FROM employees WHERE DEPARTMENT_ID = " + i;
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("EMPLOYEE_ID" + " : " + rs.getString("EMPLOYEE_ID"));
	            System.out.println("FIRST_NAME" + " : " + rs.getString("FIRST_NAME"));
	            System.out.println("LAST_NAME" + " : " + rs.getString("LAST_NAME"));
	            System.out.println("EMAIL" + " : " + rs.getString("EMAIL"));
	            System.out.println("PHONE_NUMBER" + " : " + rs.getString("PHONE_NUMBER"));
	            System.out.println("HIRE_DATE" + " : " + rs.getString("HIRE_DATE"));               
	            System.out.println("JOB_ID" + " : " + rs.getString("JOB_ID"));
	            System.out.println("SALARY" + " : " + rs.getString("SALARY"));
	            System.out.println("DEPARTMENT_ID" + " : " + rs.getString("DEPARTMENT_ID"));
	            System.out.println("COMMISSION_PCT" + " : " + rs.getString("COMMISSION_PCT"));
	            System.out.println("\n===========================================================\n");
			}
			

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
