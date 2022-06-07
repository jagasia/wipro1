package com.wipro.hrms;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class BranchDaoImpl implements BranchDao {	
	private JdbcTemplate jt;
	
	public BranchDaoImpl() {}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	@Override
	public int create(Branch branch)
	{
		String sql="INSERT INTO Branch VALUES(?,?,?)";
		return jt.update(sql,branch.getBid(),branch.getBname(),branch.getBcity());
	}
	
	@Override
	public List<Branch> read()
	{
		String sql="SELECT * FROM Branch";
		return jt.query(sql, new BranchRowMapper());
	}
	
	@Override
	public Branch read(String bid)
	{
		String sql="SELECT * FROM Branch WHERE bid=?";
		return jt.queryForObject(sql, new BranchRowMapper(),bid);
	}
	
	@Override
	public int update(Branch branch)
	{
		String sql="UPDATE Branch SET bname=?, bcity=?  WHERE bid=?";
		return jt.update(sql,branch.getBname(),branch.getBcity(),branch.getBid());
	}
	
	@Override
	public int delete(String bid)
	{
		String sql="DELETE FROM Branch WHERE bid=?";
		return jt.update(sql,bid);
	}
	
}
