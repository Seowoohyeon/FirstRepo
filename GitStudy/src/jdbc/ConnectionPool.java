package jdbc;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	/*
	 	DB�� DML�� �����Ҷ����� ���ο� ������ �����ϴ� ���� ���ҽ��� ���� ����ȴ�
	 	
	 	������ �̹� ������ �����صΰ�, ��������� ���� Ŀ�ؼ��� �����ִ� ����� Ŀ�ؼ� Ǯ�̶�� �Ѵ�
	*/
	
	List<JdbcConnection> pool;
	
	public ConnectionPool(int size) {
		pool = new ArrayList<>(size);
		
		for (int i = 0; i < size; i++) {
			pool.add(new JdbcConnection());
		}
	}
	
	public Connection getConnection() {
		for(JdbcConnection jconn : pool) {
			if(!jconn.using()) {
				return jconn.use();
			}
		}
		return null;
	}
	
	class JdbcConnection {
		private Connection conn;
		private boolean using;
		
		public JdbcConnection() {
			conn = DBConnector.getConnection();
		}
		
		public boolean using() {
			return using;
		}
		
		public Connection use() {
			using = true;
			return conn;
		}
		
		public void close() {
			using = false;
		}
		
		
	}
	
	
	
	
	
}
