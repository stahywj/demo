package testbean;

import java.io.Serializable;

/**
 * Created by kenneth on 2016/8/16.
 */
public class Student implements Serializable {
    private int sid;
    private String sname;
    private String ssex;
    private Grade grade;

    public Student(){

    }
    public Student(String sname, String ssex){
        this.sname = sname;
        this.ssex = ssex;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getSid() {
        return sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSname() {
        return sname;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSsex() {
        return ssex;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }
}
