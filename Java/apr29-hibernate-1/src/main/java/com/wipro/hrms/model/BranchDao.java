package com.wipro.hrms.model;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class BranchDao {
	private HibernateTemplate ht;
	
	public BranchDao() {}
	
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}


	public BranchDao(HibernateTemplate ht) {
		super();
		this.ht = ht;
	}


	public void create(Branch branch) {
		ht.save(branch);		
	}
	public List<Branch> read() {
		return ht.loadAll(Branch.class);
	}
	public Branch read(String bid) {
		return ht.load(Branch.class, bid);
	}
	public void update(Branch branch) {
		ht.update(branch);
	}
	public void delete(String bid) {
		ht.delete(read(bid));
	}
	
}
