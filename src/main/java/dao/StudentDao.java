
package dao;

import model.StudentModel;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    public static List<StudentModel> lst=new ArrayList<>();

    public void AddStudent(StudentModel s){

        lst.add(s);
    }

    public List<StudentModel> GetAllStudent(){
        return lst;
    }
}

