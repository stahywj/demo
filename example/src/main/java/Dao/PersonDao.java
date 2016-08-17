package Dao;

import Bean.Person;
import Util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenneth on 2016/8/5.
 */
public class PersonDao {

    //增加
    public void insert(Person person){
        Connection conn = DBUtil.getConnection();
        String sql = "insert into person(name, age) values(?, ?)";
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, person.getName());
            pstmt.setString(2, person.getAge()+"");
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   /* public List<Person> Query(){
        Connection conn = DBUtil.getConnection();
        //通过数据库的连接操作数据库，实现增删改查
        Statement stat = null;
        List<Person> list = new ArrayList<Person>();
        try {
            stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("select * from person");
            while (rs.next()){
                Person p = new Person();
                p.setName(rs.getString("name"));
                p.setAge(Integer.valueOf(rs.getString("age")));
                list.add(p);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }*/


    public void query(){
        Connection conn = DBUtil.getConnection();
        String sql = "select * from person";

        try {
            CallableStatement cs = conn.prepareCall(sql);
            cs.execute();
            ResultSet rs = cs.getResultSet();
            while (rs.next()){
                System.out.println(rs.getString("name")+" "+rs.getString("age"));
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public List<Person> sp_select_filter(String sp_name){
        Connection conn = DBUtil.getConnection();
        List<Person> listArray = new ArrayList<Person>();
        try {
            CallableStatement cs = conn.prepareCall("call sp_select_filter(?)");
            cs.setString(1, sp_name);
            cs.execute();
            ResultSet rs = cs.getResultSet();
            while (rs.next()){
                Person p = new Person();
                p.setName(rs.getString("name"));
                p.setAge(Integer.valueOf(rs.getString("age")));
                listArray.add(p);
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listArray;
    }
}
