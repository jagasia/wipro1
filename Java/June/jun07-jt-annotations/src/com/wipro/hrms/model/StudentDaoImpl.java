package com.wipro.hrms.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("sdao")
public class StudentDaoImpl {
	@Autowired
	private JdbcTemplate jt;
	
	public StudentDaoImpl() {}

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int create(Student student) {
		String sql="INSERT INTO Student VALUES(?,?,?,?)";
		return jt.update(sql,student.getId(), student.getName(), student.getDateOfBirth(), student.getPicture());
	}
	public List<Student> read() {
		String sql="SELECT * FROM Student";
		return jt.query(sql, new StudentRowMapper());
	}
	public Student read(Integer id) {
		String sql="SELECT * FROM Student WHERE id=?";
		return jt.queryForObject(sql, new StudentRowMapper(),id);
	}
	public int update(Student student) {
		String sql="UPDATE Student SET name=?, dateOfBirth=?, picture=? WHERE id=?";
		return jt.update(sql,student.getName(),student.getDateOfBirth(),student.getPicture(),student.getId());
	}
	public int delete(Integer id) {
		String sql="DELETE FROM Student WHERE id=?";
		return jt.update(sql,id);
	}
	
}