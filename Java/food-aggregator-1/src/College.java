import java.util.Date;

public class College {
	private String name, website, mobile, founder, location;
	private Integer numberOfDept;
	private Date startingDate;
	
	public College() {
	
	}



	public College(String name, String website, String mobile, String founder, Integer numberOfDept, String location,
			Date startingDate) {
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.location = location;
		this.numberOfDept = numberOfDept;
		this.startingDate = startingDate;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getWebsite() {
		return website;
	}



	public void setWebsite(String website) {
		this.website = website;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public String getFounder() {
		return founder;
	}



	public void setFounder(String founder) {
		this.founder = founder;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public Integer getNumberOfDept() {
		return numberOfDept;
	}



	public void setNumberOfDept(Integer numberOfDept) {
		this.numberOfDept = numberOfDept;
	}



	public Date getStartingDate() {
		return startingDate;
	}



	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}



	@Override
	public boolean equals(Object obj) {
		College arg=(College) obj;
		// Two colleges are considered same if they have the same name and startingDate. Implement the logic in the appropriate function. (Case – Insensitive)
		return this.getName().equalsIgnoreCase(arg.getName()) && this.getStartingDate().equals(arg.getStartingDate());
	}

	@Override
	public String toString() {
		return String.format(
		"Name: %s\r\n" + 
		"Website: %s\r\n" + 
		"Mobile: %s\r\n" + 
		"Founder: %s\r\n" + 
		"Number of Dept: %d\r\n" + 
		"Location: %s\r\n" + 
		"Starting Date: %s",name, website,mobile, founder, numberOfDept, location, startingDate);
	}

	
}
