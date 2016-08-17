package Dao;

import Bean.Person;
import db.DBAccess;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenneth on 2016/8/8.
 */
public class MybatisDao {
    public List<Person> queryMyBatisList(){
        DBAccess dbAccess = new DBAccess();
        List<Person> list = new ArrayList<Person>();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            //通过SqlSession执行sql语句
            list = sqlSession.selectList("queryMyBatisList");
        }
        catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null){
                sqlSession.close();
            }
        }
        return list;
    }
}
