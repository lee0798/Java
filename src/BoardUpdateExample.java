package ch20.mysql.sec07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateExample {


    public static void main(String[] args) {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "root", "dohwan1031!");
            System.out.println("연결 성공");


            //매개변수화된 SQL문 작성
            String sql = new StringBuilder()
                    .append("UPDATE boards SET btitle=?, bcontent=?, bfilename=?, bfiledata=? WHERE bno=?")
                    .toString();

            //PreparedStatement 얻기 미 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "눈사람");
            pstmt.setString(2, "눈으로 만든 사람");
            pstmt.setString(3, "증명사진 도환.jpg");
            pstmt.setBlob(4, new FileInputStream("/Users/dodo/Desktop/도환/잡것/증명사진 도환.jpg"));

            pstmt.setInt(5, 3);

            //SQL문 실핼
            int rows = pstmt.executeUpdate();
            System.out.println("수정된 행수 : " + rows);
            //PreparedStatement 닫기
            pstmt.close();
        } catch (ClassNotFoundException var13) {
            var13.printStackTrace();
        } catch (SQLException var14) {
            var14.printStackTrace();
        } catch(FileNotFoundException var15) {
            var15.printStackTrace();

        }finally{

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