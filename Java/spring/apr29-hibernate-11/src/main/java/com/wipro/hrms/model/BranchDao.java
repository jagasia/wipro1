package com.wipro.hrms.model;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class BranchDao {
	private HibernateTemplate ht;
	
	public BranchDao() {}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	@Transactional
	public void create(Branch branch) {
		ht.persist(branch);
	}
	public List<Branch> read() {
		return ht.loadAll(Branch.class);
	}
	public Branch read(String bid) {
		return ht.get(Branch.class, bid);
	}
	
	@Transactional
	public void update(Branch branch) {		
		ht.update(branch);
//		ht.save(branch);
	}
	
	@Transactional
	public void delete(String bid) {
		Branch b = read(bid);
		if(b!=null)
			ht.delete(b);
		else
			System.out.println("Nothing to delete");
	}
	
}
