package Util;

import java.sql.*;

import static java.lang.Class.forName;

/**
 * Created by kenneth on 2016/8/5.
 */
public class DBUtil {
    public static final String URL = "jdbc:mysql://localhost:3306/javademo";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public static Connection conn = null;
    static {
        try {
            //加载MySQL驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取数据库连接
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    /*public static void main(String[] args) throws Exception {

        //通过数据库的连接操作数据库，实现增删改查
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from person");
        while (rs.next()){
            System.out.println(rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("age"));
        }

    }*/
}
