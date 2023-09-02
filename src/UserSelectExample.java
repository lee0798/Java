package ch20.mysql.sec09.exam01;

import java.sql.*;


public class UserSelectExample {


    public static void main(String[] args) {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "root", "dohwan1031!");
            System.out.println("연결 성공");


            //매개변수화된 SQL문 작성
            String sql = "SELECT userid, username, userpassword, userage, useremail FROM users WHERE userid=?";

            //PreparedStatement 얻기 미 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"winter");

            //SQL문 실핼
            ResultSet  rs = pstmt.executeQuery();
            if(rs.next()){ //1개의 데이터 행을 가져왔을 때
                User user = new User();
                user.setUserId(rs.getString("userid"));
                user.setUserName(rs.getString("username"));
                user.setUserPassword(rs.getString(3));
                user.setUserAge(rs.getInt(4));
                user.setUserEmail(rs.getString(5));
                System.out.println(user);
            }else {
                System.out.println("아이디가 존재 하지 않음");
            }
            rs.close();
            //PreparedStatement 닫기
            pstmt.close();
        } catch (ClassNotFoundException var13) {
            var13.printStackTrace();
        } catch (SQLException var14) {
            var14.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("연결 끊기");
                } catch (SQLException e) {}
            }

        }

    }
}
