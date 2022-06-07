package com.wipro.hrms;

import java.util.List;

public interface BranchDao {

	int create(Branch branch);

	List<Branch> read();

	Branch read(String bid);

	int update(Branch branch);

	int delete(String bid);

}