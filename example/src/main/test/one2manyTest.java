
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testbean.Grade;
import testbean.Student;

import java.util.Set;


/**
 * Created by kenneth on 2016/8/13
 * //测试类.
 */
public class one2manyTest {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init(){
        Configuration config = new Configuration().configure("one2many/hibernate.cfg.xml");
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        sessionFactory = config.buildSessionFactory(sr);
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    @After
    public void destory(){
        transaction.commit();

        session.close();
        sessionFactory.close();
    }

    @Test
    public void testSaveGrade() {
        Student student1 = new Student("ywj", "女");
        Student student2 = new Student("xpz", "男");
        Grade grade = new Grade("二班", "加强牛逼班级");
        //建立班级---》学生的一对多关系
        grade.getStudents().add(student1);
        grade.getStudents().add(student2);
        //建立学生---》班级的多对一关系
        student1.setGrade(grade);
        student2.setGrade(grade);

        session.save(grade);
      /*  session.save(student1);
        session.save(student2);*/
    }

    @Test
    public void testSelectGrade(){
        //查询班级中包含的学生信息
        Grade grade = (Grade) session.get(Grade.class, 1);
        System.out.println(grade.getGname()+" "+grade.getGdesc());
        Set<Student> students = grade.getStudents();
        for (Student stu : students){
            System.out.println(stu.getSname()+" : "+stu.getSsex());
        }
    }


}
