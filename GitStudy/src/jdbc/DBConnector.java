package jdbc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DBConnector {
	
	static String driverName;
	static String url;
	static String id;
	static String password;
	
	
	static {
		try(BufferedReader in = new BufferedReader(new FileReader("./data/DB.txt"))){
			driverName = in.readLine();
			url = in.readLine();
			id = in.readLine();
			password = in.readLine();
			System.out.println("[INFO] Onitialize static variables");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	static {
		File file = new File("./data/DB.txt");
		try(Scanner sc = new Scanner(file)) {
			while(sc.hasNextLine()) {
				driverName = sc.nextLine();
				url = sc.nextLine();
				id = sc.nextLine();
			    password = sc.nextLine();
			 }        
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	*/
	static {
		try {
			Class.forName(driverName);
			System.out.println("드라이버 로드 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	  public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			return null;
		}
	} 
	public static void main(String[] args) {
		
	
	}
}
