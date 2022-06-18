package com.wipro.hrms;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BranchRowMapper implements RowMapper<Branch>
{

	@Override
	public Branch mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Branch(rs.getString(1), rs.getString(2), rs.getString(3));
	}

}
