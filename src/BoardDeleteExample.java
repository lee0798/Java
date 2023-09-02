package ch20.mysql.sec08;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteExample {


    public static void main(String[] args) {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "root", "dohwan1031!");
            System.out.println("연결 성공");


            //매개변수화된 SQL문 작성
            String sql = "DELETE FROM boards WHERE bwriter=?";

            //PreparedStatement 얻기 미 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"winter");
            //SQL문 실핼
            int rows = pstmt.executeUpdate();
            System.out.println("삭제된 행수 : " + rows);
            //PreparedStatement 닫기
            pstmt.close();
        } catch (ClassNotFoundException var13) {
            var13.printStackTrace();
        } catch (SQLException var14) {
            var14.printStackTrace();
        } finally{

            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("연결 끊기");
                } catch (SQLException var12) {
                }
            }
        }
    }
}