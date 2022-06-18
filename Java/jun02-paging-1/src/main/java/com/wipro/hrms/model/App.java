package com.wipro.hrms.model;

import java.util.List;

public class App {

	public static void main(String[] args) {
		BranchDaoImpl bdao=new BranchDaoImpl();
//		List<Branch> branches = bdao.read();

//		Branch branch = bdao.read("B00103");
//		System.out.println(branch);
		
//		Branch b=new Branch("B00126", "Wipro 3 branch...", "Bengaluru");
//		bdao.create(b);
//		bdao.update(b);
//		bdao.delete("B00126");
//		List<Branch> branches = bdao.retrieveBranchesOfRange(0, 5);
//		for(Branch b:branches)
//		{
//			System.out.println(b);
//		}		
System.out.println(	bdao.getBranchesCount() );
	}

}
