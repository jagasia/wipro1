package com.wipro.hrms.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.wipro.hrms.entity.Student;
import com.wipro.hrms.entity.StudentRowMapper;

public class StudentDaoImpl {
	private JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int create(Student student) {
		//insert, update, delete (DML) use "update" method of jt
		//in mysql, date format is always "yyyy-MM-dd"
		String sql="INSERT INTO Student VALUES(?,?,?)";
		int no = jt.update(sql,student.getId(), student.getName(), student.getDateOfBirth());
		return no;
	}
	public List<Student> read() {
		String sql="select * from Student";
//		return jt.query(sql, new StudentRowMapper());
		return jt.query(sql, (rs,y)->{return new Student(rs.getInt(1), rs.getString(2), rs.getDate(3));});
	}
	public Student read(Integer id) {
		String sql="select * from Student where id=?";
//		return jt.queryForObject(sql, new StudentRowMapper(), id);
		return jt.queryForObject(sql, (rs,y)->{return new Student(rs.getInt(1), rs.getString(2), rs.getDate(3));},id);
	}
	public int update(Student student) {
		String sql="UPDATE Student SET name=?, dateOfBirth=? WHERE id=?";
		return jt.update(sql,student.getName(), student.getDateOfBirth(), student.getId());
	}
	public int delete(Integer id) {
		String sql="DELETE FROM Student WHERE id=?";
		return jt.update(sql,id);
	}
	
}
