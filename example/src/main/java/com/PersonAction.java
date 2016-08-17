package com;

import Bean.Person;
import Dao.MybatisDao;
import Dao.PersonDao;

import java.util.List;

/**
 * Created by kenneth on 2016/8/5.
 */
public class PersonAction {
    public static void main(String[] args) throws Exception{
      /*  PersonDao pd = new PersonDao();*/
       /* Person person = new Person();
        person.setName("hello");
        person.setAge(23);
        pd.insert(person);*/

/*
        List<Person> list = pd.Query();
        for (Person p : list){
            System.out.println(p.getName()+" "+p.getAge());
        }*/
//        pd.query();
    /*    List<Person> list = pd.sp_select_filter("12");
        for (Person p : list){
            System.out.println(p.getName()+" "+p.getAge());
        }*/


        MybatisDao mybatisDao = new MybatisDao();
        List<Person> list = mybatisDao.queryMyBatisList();
        for (Person li : list){
            System.out.println(li.getName()+" "+li.getAge()+" "+li.getAddress());
        }
    }
}
