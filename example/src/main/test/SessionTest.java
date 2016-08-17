import Bean.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.Work;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;


/**
 * Created by kenneth on 2016/8/15.
 */
public class SessionTest {
    @Test
    public void testOpenSession(){
        Configuration config = new Configuration().configure("hbm_config/hibernate.cfg.xml");
        ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = config.buildSessionFactory(registry);
        Session session = sessionFactory.openSession();
        if (session != null){
            System.out.println("session 创建成功");
        }else {
            System.out.println("session 创建不成功");
        }


    }

    @Test
    public void testSavePersonWithOpenSession(){
        final Configuration config = new Configuration().configure("hbm_config/hibernate.cfg.xml");
        ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = config.buildSessionFactory(registry);
        Session session1 = sessionFactory.openSession();
        Transaction tran = session1.beginTransaction();
        Person person = new Person();
        person.setName("lisi");
        person.setAge(39);
//        person.setAddress("装甲口");
        session1.doWork(new Work() {
            public void execute(Connection connection) throws SQLException {
                System.out.println("connection1"+connection.hashCode());
            }
        });
        session1.save(person);
        tran.commit();

        Session session2 = sessionFactory.openSession();
        tran = session2.beginTransaction();
        person.setName("小明");
        person.setAge(44);
//        person.setAddress("北京");
        session1.doWork(new Work() {
            public void execute(Connection connection) throws SQLException {
                System.out.println("connection2"+connection.hashCode());
            }
        });
        session2.save(person);
        tran.commit();
    }

    @Test
    public void testGetCurrentSession(){
        Configuration config = new Configuration().configure("hbm_config/hibernate.cfg.xml");
        ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = config.buildSessionFactory(registry);
        Session session = sessionFactory.getCurrentSession();
        if(session != null){
            System.out.println("session 成功");
        }else{
            System.out.println("session 失败");
        }
    }

    @Test
    public void testSavePersonWithGetCurrentSession(){
        Configuration config = new Configuration().configure("hbm_config/hibernate.cfg.xml");
        ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = config.buildSessionFactory(registry);
        Session session1 = sessionFactory.getCurrentSession();
        Transaction tran = session1.beginTransaction();
        Person person = new Person();
        person.setName("lisi");
        person.setAge(39);
//        person.setAddress("装甲口");
        session1.doWork(new Work() {
            public void execute(Connection connection) throws SQLException {
                System.out.println("connection"+connection.hashCode());
            }
        });
        session1.save(person);
        tran.commit();

        Session session2 = sessionFactory.getCurrentSession();
        tran = session2.beginTransaction();
        person.setName("小明");
        person.setAge(44);
//        person.setAddress("北京");
        session1.doWork(new Work() {
            public void execute(Connection connection) throws SQLException {
                System.out.println("connection"+connection.hashCode());
            }
        });
        session2.save(person);
        tran.commit();
    }
}
