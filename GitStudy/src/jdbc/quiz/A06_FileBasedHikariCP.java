package jdbc.quiz;

import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class A06_FileBasedHikariCP {

      // 메뉴얼의 File based 방식으로 HikariCP구동해보기
   
   public static void main(String[] args) {
      // Examines both filesystem and classpath for .properties file
      HikariConfig config = new HikariConfig("./some/path/hikari.properties");
      HikariDataSource ds = new HikariDataSource(config);
      
      try {
         System.out.println(ds.getConnection());
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}
