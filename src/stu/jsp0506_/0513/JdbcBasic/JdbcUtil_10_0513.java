package kr.co.jsp.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil_10_0513 {

	
	public static void close(Connection conn,PreparedStatement pstmt) {
	
			try {
				if(pstmt !=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (SQLException e) {
				System.out.println("close 과정에서 에러 발생!");
			}
	}
	
	public static void close(Connection conn,PreparedStatement pstmt,ResultSet rs) {
		try {
			if(pstmt !=null) pstmt.close();
			if(conn !=null) conn.close();
			if(rs !=null) rs.close();
		} catch (SQLException e) {
			System.out.println("close 과정에서 에러 발생!");
		}
	}
	
}
