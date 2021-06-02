package jdbc.quiz;

import java.io.PrintWriter;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class A06_FileBasedHikariCP {

      // �޴����� File based ������� HikariCP�����غ���
   
   public static void main(String[] args) {
      // Examines both filesystem and classpath for .properties file
      HikariConfig config = new HikariConfig("./some/path/hikari.properties");
      config.addDataSourceProperty("logWriter", new PrintWriter(System.out));
      config.setConnectionTestQuery("select 1 from dual");
      
      HikariDataSource ds = new HikariDataSource(config);
      
      try {
         System.out.println(ds.getConnection());
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}
