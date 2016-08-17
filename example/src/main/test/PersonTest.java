import Bean.Address;
import Bean.Person;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.Work;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.Filter;
import java.io.*;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.SQLException;


/**
 * Created by kenneth on 2016/8/13
 * //测试类.
 */
public class PersonTest {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init(){
        //创建配置对象
        Configuration conf = new Configuration().configure("hbm_config/hibernate.cfg.xml");
        //创建服务注册对象
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
        //创建会话工厂对象
        sessionFactory = conf.buildSessionFactory(serviceRegistry);
        //会话对象
        session = sessionFactory.openSession();
//        sessionFactory.getCurrentSession();
        //开启事务
        transaction = session.beginTransaction();
    }

    @After
    public void destory(){
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    @Test
    public void testSavePerson(){
        //生成一个person对象
        Person person = new Person();
        person.setName("ywj");
        person.setAge(33);
//        person.setAddress("iloeyou");
        Address address = new Address("710068", "18846427271", "西安市");
        person.setAddress(address);

      /*  session.doWork(new Work() {
            public void execute(Connection connection) throws SQLException {
                connection.setAutoCommit(true);
            }
        });*/

        //保存对象进入数据库
        session.save(person);
//        session.flush();
    }

    @Test
    public void testGetPerson(){
        Person person = (Person)session.get(Person.class, 1);
        session.delete(person);
        System.out.println(person);
    }

    @Test
    public void testWriteBlob(){
        Person person = new Person();
        person.setName("ywj");
        person.setAge(33);
//        person.setAddress("iloeyou");
        File f = new File("C:/Users/kenneth/Desktop/cell-blue.jpg");
        //获得这个文件的输入流
        try {
            InputStream inputStream = new FileInputStream(f);
            //创建blob对象
            Blob blob = Hibernate.getLobCreator(session).createBlob(inputStream, inputStream.available());
            person.setPicture(blob);
            session.save(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReadBlob() throws Exception {
        Person person = (Person) session.get(Person.class, 1);
        //获得Blob对象
        Blob image = person.getPicture();
        //获得输入流
        InputStream inputStream = image.getBinaryStream();
        //创建输出流
        File f = new File("C:/Users/kenneth/Desktop/image.jpg");
        //获得输出流
        OutputStream outputStream = new FileOutputStream(f);
        byte[] buff = new byte[inputStream.available()];
        inputStream.read(buff);
        outputStream.write(buff);
        inputStream.close();
        outputStream.close();
    }

}
