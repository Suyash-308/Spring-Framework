package com.itshaala.springboot03webservice.dao;

import com.itshaala.springboot03webservice.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class StudentDao {

    JdbcTemplate jdbcTemplate;

    public void addStudent(Student student){
        String sql="insert into student_tbl(name,email,phone) values(?,?,?)";
        jdbcTemplate.update(sql,student.getName(),student.getEmail(),student.getPhone());
    }

    public void updateStudent(Student student){
        String sql="update student_tbl set name=?,email=?,phone=? where id=?";
        jdbcTemplate.update(sql,student.getName(),student.getEmail(),student.getPhone(),student.getId());
    }

    public void deleteStudent(int id){
        String sql="delete from student_tbl where id=?";
        jdbcTemplate.update(sql,id);
    }

    public Student getStudentById(int id){
        String sql="select * from student_tbl where id=?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Student.class),id);
    }

    public List<Student> getAllStudents(){
        String sql="select * from student_tbl";
        return  jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Student.class));
    }


}
