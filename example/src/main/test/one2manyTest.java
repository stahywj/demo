
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

import java.io.Serializable;
import java.util.Iterator;


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
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        sessionFactory = config.buildSessionFactory(serviceRegistry);
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    @After
    public void destory(){
        /*transaction.commit();

        session.close();*/
        sessionFactory.close();
    }

    @Test
    public void testSaveGrade() {
        Student student1 = new Student("zhangsan", "女");
        Student student2 = new Student("lisi", "男");
        Grade grade = new Grade("三班", "普通班级");
        System.out.println("grade: "+grade);
        //建立班级---》学生的一对多关系
        grade.getStudents().add(student1);
        grade.getStudents().add(student2);
        //建立学生---》班级的多对一关系
        student1.setGrade(grade);
        student2.setGrade(grade);

        Serializable i = session.save(grade);
        System.out.println("i: "+i);

       /* session.save(student1);
        session.save(student2);*/
    }

    @Test
    public void testSelectGrade(){
        //查询班级中包含的学生信息
       /* Grade grade = (Grade) session.get(Grade.class, 1);
        System.out.println(grade.getGname()+" "+grade.getGdesc());
       *//* Set<Student> students = grade.getStudents();
        for (Student stu : students){
            System.out.println(stu.getSname()+" : "+stu.getSsex());
        }*//*
        Grade grade2 = (Grade) session.get(Grade.class, 1);
        System.out.println(grade2.getGname()+" "+grade2.getGdesc());*/

//        List<Student> stu = session.createQuery(" from testbean.Student").setFirstResult(0).setMaxResults(30).list();
//        Iterator iter = stu.iterator();
        Iterator<Student> iter = session.createQuery("from testbean.Student").setFirstResult(0).setMaxResults(30).iterate();
        while (iter.hasNext()){
            Student stdent = (Student) iter.next();
            System.out.println(stdent.getSname()+" "+stdent.getSsex());
        }

    }


    @Test
    public void TestSecondCache(){
        Grade grade = (Grade) session.load(Grade.class, 1);
        System.out.println(grade.getGname()+" ------------ "+grade.getGdesc());
        transaction.commit();
        session.close();
        System.out.println("**********************");

        session = sessionFactory.openSession();
        Grade grade1 = (Grade) session.load(Grade.class, 1);
        System.out.println(grade1.getGname()+" ++++++++++++++ "+grade1.getGdesc());
        transaction = session.beginTransaction();
        transaction.commit();
        session.close();



    }


}
