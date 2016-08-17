package testbean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kenneth on 2016/8/16.
 */
public class Grade implements Serializable{
    private int gid;
    private String gname;
    private String gdesc;
    private Set<Student> students = new HashSet<Student>();


    public Grade(){

    }
    public Grade(String gname, String gdesc){
        this.gname = gname;
        this.gdesc = gdesc;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getGid() {
        return gid;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGname() {
        return gname;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc;
    }

    public String getGdesc() {
        return gdesc;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Student> getStudents() {
        return students;
    }
}
