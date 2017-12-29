package jUnit;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;


public class JunitTest {
	/*오라클 db*/
/*	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	
	private static final String USER = "kjc";
	
	private static final String PW = "1234";*/
	
	// h2 db
	private static final String DRIVER = "org.h2.Driver";
	
	private static final String URL = "jdbc:h2:tcp://localhost:9092/~/sugi;MODE=Oracle";
	
	private static final String USER = "sa";
	
	private static final String PW = "ENV2017";
	
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println(con);
			System.out.println("연결성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("연결실패");
		}
	}

}
